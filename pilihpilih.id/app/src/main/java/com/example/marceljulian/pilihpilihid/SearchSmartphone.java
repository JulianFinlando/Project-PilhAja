package com.example.marceljulian.pilihpilihid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class SearchSmartphone extends AppCompatActivity {
    private ImageButton cariSmartphone;
    private EditText edtCari;
    ListView listSmartphone;
    List<Smartphone> smartphoneList;

    private DatabaseReference mSmartphoneDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_smartphone);

        cariSmartphone = (ImageButton) findViewById(R.id.btn_cariSmartphone);
        edtCari = (EditText) findViewById(R.id.search_smartphone);

        listSmartphone = (ListView) findViewById(R.id.listViewPencarian);
        smartphoneList = new ArrayList<>();
        cariSmartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchText = edtCari.getText().toString();
                cariSmartphone(searchText);
            }
        });
    }

    private void cariSmartphone(String searchText) {
            String merk = searchText;
            String cekKecil = merk.substring(0, 1).toLowerCase()+merk.substring(1);
            //Toast.makeText(SearchSmartphone.this, ""+cekKecil, Toast.LENGTH_SHORT).show();

            String merkKecil = merk.substring(0, 1).toUpperCase()+merk.substring(1).toLowerCase();

            mSmartphoneDatabase = FirebaseDatabase.getInstance().getReference("smartphone");
            Query query2 = mSmartphoneDatabase.orderByChild("merk").equalTo(merkKecil);
            query2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    smartphoneList.clear();
                    for (DataSnapshot smartphoneSnapshot : dataSnapshot.getChildren()) {
                        Smartphone smartphone = smartphoneSnapshot.getValue(Smartphone.class);
                        //if(smartphone.getRam().equals("1GB") && smartphone.getInternal().equals("")){
                        smartphoneList.add(smartphone);
                        //}

                    }
                    SmartphoneList adapter = new SmartphoneList(SearchSmartphone.this, smartphoneList);
                    listSmartphone.setAdapter(adapter);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
    }

}

