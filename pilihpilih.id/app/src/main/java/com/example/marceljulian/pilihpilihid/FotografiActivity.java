package com.example.marceljulian.pilihpilihid;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FotografiActivity extends AppCompatActivity {
    ListView listFotografi;
    List<Smartphone> smartphoneList2;
    private DatabaseReference databaseHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotografi);

        listFotografi = (ListView)findViewById(R.id.listViewFoto);
        smartphoneList2 = new ArrayList<>();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onStart() {

        databaseHp = FirebaseDatabase.getInstance().getReference("smartphone");
        Query query = databaseHp.orderByChild("kategori1").equalTo("Fotografi");
        super.onStart();
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                smartphoneList2.clear();
                for(DataSnapshot smartphoneSnapshot : dataSnapshot.getChildren()){
                    Smartphone smartphone = smartphoneSnapshot.getValue(Smartphone.class);
                    smartphoneList2.add(smartphone);
                }
                SmartphoneList adapter = new SmartphoneList(FotografiActivity.this, smartphoneList2);
                listFotografi.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
