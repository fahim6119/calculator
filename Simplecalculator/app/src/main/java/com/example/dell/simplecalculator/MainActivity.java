package com.example.dell.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Addition(View view) {
        double sum;
        double num1;
        double num2;

        EditText first_number = (EditText) findViewById(R.id.first_number);
        EditText second_number = (EditText) findViewById(R.id.second_number);

        TextView result = (TextView) findViewById(R.id.result);

        String one = first_number.getText().toString();
        String two = second_number.getText().toString();

        if((one.equals("")!=true) && (two.equals("")!=true)) {
            num1 = Double.valueOf(one);

            num2 = Double.valueOf(two);

            sum = num1 + num2;

            String res = String.valueOf(sum);

            result.setText("Addition result = " + res);

        }

        else
        {
            Toast.makeText(this,"Please Input number",Toast.LENGTH_LONG).show();
        }

    }


    public void Subtraction(View view){
        double dif;
        double num1;
        double num2;

        EditText first_number = (EditText) findViewById(R.id.first_number);
        EditText second_number = (EditText) findViewById(R.id.second_number);

        TextView result = (TextView) findViewById(R.id.result);

        String one = first_number.getText().toString();
        String two = second_number.getText().toString();


        if((one.equals("")!=true) && (two.equals("")!=true)) {
            num1 = Double.valueOf(one);

            num2 = Double.valueOf(two);

            dif = num1 - num2;

            String res = String.valueOf(dif);

            result.setText("Subtraction result = " + res);
        }


        else
        {
            Toast.makeText(this,"Please Input number",Toast.LENGTH_LONG).show();
        }


    }



    public void Multiply(View view){
        double mul;
        double num1;
        double num2;

        EditText first_number = (EditText) findViewById(R.id.first_number);
        EditText second_number = (EditText) findViewById(R.id.second_number);

        TextView result = (TextView) findViewById(R.id.result);

        String one = first_number.getText().toString();
        String two = second_number.getText().toString();


        if((one.equals("")!=true) && (two.equals("")!=true)) {
            num1 = Double.valueOf(one);

            num2 = Double.valueOf(two);

            mul = num1 * num2;

            String res = String.valueOf(mul);

            result.setText("Multiplication result = " + res);

        }

        else
        {
            Toast.makeText(this,"Please Input number",Toast.LENGTH_LONG).show();
        }

    }




    public void Divide(View view){
        double div;
        double num1;
        double num2;

        EditText first_number = (EditText) findViewById(R.id.first_number);
        EditText second_number = (EditText) findViewById(R.id.second_number);

        TextView result = (TextView) findViewById(R.id.result);

        String one = first_number.getText().toString();
        String two = second_number.getText().toString();

        if((one.equals("")!=true) && (two.equals("")!=true)) {

            num1 = Double.valueOf(one);

            num2 = Double.valueOf(two);

            if(num2 != 0) {

                div = num1 / num2;


                String res = String.valueOf((float) div);

                result.setText("Division result = " + res);
            }

            else{
                Toast.makeText(this,"Not a valid operation",Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"Please Input number",Toast.LENGTH_LONG).show();
        }

    }




    public void Modulo(View view) {
        double mod;
        double num1;
        double num2;

        EditText first_number = (EditText) findViewById(R.id.first_number);
        EditText second_number = (EditText) findViewById(R.id.second_number);

        TextView result = (TextView) findViewById(R.id.result);

        String one = first_number.getText().toString();
        String two = second_number.getText().toString();


        if((one.equals("")!=true) && (two.equals("")!=true)) {

            num1 = Double.valueOf(one);

            num2 = Double.valueOf(two);

            if(num2 != 0){

                mod = num1 % num2;

                String res = String.valueOf(mod);

                result.setText("Modulo result = " + res);

            }


            else{
                Toast.makeText(this,"Not a valid operation",Toast.LENGTH_LONG).show();
            }

        }

        else
        {
            Toast.makeText(this,"Please Input number",Toast.LENGTH_LONG).show();
        }
    }

}
