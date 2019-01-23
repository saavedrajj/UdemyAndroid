package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    class Number {
        public boolean isTriangular (long n) {
            long calc_num = 8*n+1;
            long t = (long) Math.sqrt(calc_num);

            if (t*t==calc_num) {
                return true;
            }
            return false;
        }

        public boolean isSquare(int n) {
            int sqrt = (int) Math.sqrt(n);

            if(sqrt*sqrt == n) {
                return true;
            }
            return false;
        }
    }


    public void testNumber(View view) {
        Log.i("Info","Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        Number myNumber = new Number();
        int number = Integer.parseInt(editText.getText().toString());
        System.out.println(number);

        boolean triangular;
        boolean square;
        String message;
        String message2;

        if (myNumber.isTriangular(number)) {
            triangular = true;
            message = number + " is triangular";

        }
        else {
            message = number + " is not triangular";
            triangular = false;
        }

        if (myNumber.isSquare(number)) {
            message = number + " is square";
            square = true;
        }
        else {
            message = number + " is not square";
            square = false;
        }

        if (triangular == true && square == true) {
            message2 = number + " is triangular and square";
            Toast.makeText(this,message2, Toast.LENGTH_SHORT).show();
        }

        if (triangular == false && square == false) {
            message2 = number + " is neither triangular nor square";
            Toast.makeText(this,message2, Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
