package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbutton = (MaterialButton) findViewById(R.id.loginbutton);


        // admin and admin
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this, "Log in Successful", Toast.LENGTH_SHORT).show();

                    openActivity2();
                }
                else
                    // incorrect
                    Toast.makeText(MainActivity.this, "Log in Failed !", Toast.LENGTH_SHORT).show();
            }
        });

   }
   public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
   }
}