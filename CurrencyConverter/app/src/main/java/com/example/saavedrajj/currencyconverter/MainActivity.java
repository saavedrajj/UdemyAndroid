package com.example.saavedrajj.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("Info","Button pressed!");
        EditText editText = (EditText) findViewById(R.id.editText);
        Log.i("Info", editText.getText().toString());

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.3;
        String amountInDollarsString = Double.toString(amountInDollarsDouble);
        Log.i("Amount in dollars", amountInDollarsString);

        Toast.makeText(this,amountInPounds + " is " + amountInDollarsString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
