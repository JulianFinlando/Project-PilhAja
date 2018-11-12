package com.example.marceljulian.pilihpilihid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class DaftarPilihActivity extends AppCompatActivity {
    private CardView fotografi,gaming,editing, cari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pilih);

        fotografi = (CardView)findViewById(R.id.card_view1);
        gaming = (CardView)findViewById(R.id.card_view2);
        editing = (CardView)findViewById(R.id.card_view3);
        cari = (CardView)findViewById(R.id.pencarian);

        fotografi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarPilihActivity.this, FotografiActivity.class);
                startActivity(intent);
            }
        });

        gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarPilihActivity.this, GamingActivity.class);
                startActivity(intent);
            }
        });

        editing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarPilihActivity.this, EditingActivity.class);
                startActivity(intent);
            }
        });

        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarPilihActivity.this, SearchSmartphone.class);
                startActivity(intent);
            }
        });

    }
}
