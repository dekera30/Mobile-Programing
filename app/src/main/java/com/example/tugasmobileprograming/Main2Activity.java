package com.example.tugasmobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    Button btnprofile;
    Button btnkegiatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btnprofile=findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this.getApplicationContext(), Main3Activity.class);
                Main2Activity.this.startActivity(intent);
            }
        });

        btnkegiatan=findViewById(R.id.btnkegiatan);
        btnkegiatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this.getApplicationContext(), Main4Activity.class);
                Main2Activity.this.startActivity(intent);
            }
        });

    }
}
