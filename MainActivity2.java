package com.example.newapp;

import static com.example.newapp.R.id.editText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        Double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        Double amountInRupees = amountInDollarsDouble * 74.0;
        
        String amountInRupeesString = Double.toString(amountInRupees);

        Log.i("amount in Rupees", amountInRupeesString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}