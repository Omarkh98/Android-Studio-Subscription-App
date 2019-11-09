package com.example.subscriptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Butt;
    EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Butt = findViewById(R.id.ShowButton);
        Name = findViewById(R.id.MyName);

        Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RecyclerActivity.class);
                intent.putExtra("Name",Name.getText().toString());
                startActivity(intent);
            }
        });
    }
}
