package com.example.mytugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mytugas.intent1;
import com.example.mytugas.intent2;
import com.example.mytugas.intent3;
import com.example.mytugas.intent4;


public class MainActivity extends AppCompatActivity {

    ImageView fdpizza, fddrink, fdhotdog, fdsoda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fdpizza = findViewById(R.id.fd_pizza);
        fdpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, intent1.class);
                startActivity(intent);
            }
        });

        fddrink = findViewById(R.id.fd_drink);
        fddrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, intent2.class);
                startActivity(intent);
            }
        });

        fdhotdog = findViewById(R.id.fd_hotdog);
        fdhotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, intent3.class);
                startActivity(intent);
            }
        });

        fdsoda = findViewById(R.id.fd_soda);
        fdsoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, intent4.class);
                startActivity(intent);
            }
        });



    }
}