package com.example.siddhant.highlow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int x;
    public void makeToast(String string){

        Toast.makeText(this,string, Toast.LENGTH_LONG).show();

    }
    public void click (View view){

        EditText et1 = (EditText) findViewById(R.id.et1);
        int guessInt = Integer.parseInt(et1.getText().toString());

        if (guessInt > x){
           makeToast("LOWER");
        }
        else if(guessInt < x) {
            makeToast("HIGHER");
        }
        else if(guessInt == x){
            makeToast("CORRECT");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int x = r.nextInt(20) + 1;
    }
}
