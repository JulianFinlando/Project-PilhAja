package com.example.marceljulian.pilihpilihid;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class GamingActivity extends AppCompatActivity {
    ListView listGaming;
    List<Smartphone> smartphoneList3;
    private DatabaseReference databaseHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming);

        listGaming = (ListView)findViewById(R.id.listViewGaming);
        smartphoneList3 = new ArrayList<>();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }
    protected void onStart() {

        databaseHp = FirebaseDatabase.getInstance().getReference("smartphone");
        Query query = databaseHp.orderByChild("kategori2").equalTo("Gaming");
        super.onStart();
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                smartphoneList3.clear();
                for(DataSnapshot smartphoneSnapshot : dataSnapshot.getChildren()){
                    Smartphone smartphone = smartphoneSnapshot.getValue(Smartphone.class);
                    smartphoneList3.add(smartphone);

                }
                SmartphoneList adapter = new SmartphoneList(GamingActivity.this, smartphoneList3);
                listGaming.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
