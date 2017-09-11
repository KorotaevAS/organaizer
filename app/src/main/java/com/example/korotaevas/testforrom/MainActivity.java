package com.example.korotaevas.testforrom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.korotaevas.testforrom.UI.TranslitActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTranslit(View view){
        Intent intent = new Intent(this, TranslitActivity.class);
        startActivity(intent);
    }
}
