package com.example.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){
        EditText firstNumber = (EditText)findViewById(R.id.firstNum);
        EditText secondNumber = (EditText)findViewById(R.id.secondNum);
        EditText outputNum = (EditText)findViewById(R.id.output);

        double n1 = Integer.parseInt(firstNumber.getText().toString());
        double n2 = Integer.parseInt(secondNumber.getText().toString());
        double result = n1+n2;

        outputNum.setText("Total Value: "+result);
    }

    public void subtract(View v){
        EditText firstNumber = (EditText)findViewById(R.id.firstNum);
        EditText secondNumber = (EditText)findViewById(R.id.secondNum);
        EditText outputNum = (EditText)findViewById(R.id.output);

        double n1 = Integer.parseInt(firstNumber.getText().toString());
        double n2 = Integer.parseInt(secondNumber.getText().toString());
        double result = n1-n2;

        outputNum.setText("Total Value: "+result);
    }

    public void multiply(View v){
        EditText firstNumber = (EditText)findViewById(R.id.firstNum);
        EditText secondNumber = (EditText)findViewById(R.id.secondNum);
        EditText outputNum = (EditText)findViewById(R.id.output);

        double n1 = Integer.parseInt(firstNumber.getText().toString());
        double n2 = Integer.parseInt(secondNumber.getText().toString());
        double result = n1*n2;

        outputNum.setText("Total Value: "+result);
    }

    public void divide(View v){
        EditText firstNumber = (EditText)findViewById(R.id.firstNum);
        EditText secondNumber = (EditText)findViewById(R.id.secondNum);
        EditText outputNum = (EditText)findViewById(R.id.output);

        double n1 = Integer.parseInt(firstNumber.getText().toString());
        double n2 = Integer.parseInt(secondNumber.getText().toString());
        double result = n1/n2;

        outputNum.setText("Total Value: "+result);
    }
}