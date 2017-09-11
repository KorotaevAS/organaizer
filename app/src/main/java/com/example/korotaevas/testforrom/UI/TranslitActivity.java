package com.example.korotaevas.testforrom.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.korotaevas.testforrom.R;
import com.example.korotaevas.testforrom.Services.Translater;

public class TranslitActivity extends AppCompatActivity {

    EditText etTop;
    EditText etBotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translit);

        etTop = (EditText)findViewById(R.id.et_main_top);
        etBotton = (EditText)findViewById(R.id.et_main_botton);
    }

    public void Translate(View view){
        try {
            Translater translater = new Translater();
            String translateText = translater.translate(etTop.getText().toString());
            etBotton.setText(translateText);
        } catch (Exception ex){
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG);
        }
    }
}
