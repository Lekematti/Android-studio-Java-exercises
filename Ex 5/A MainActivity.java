package com.example.e4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.e4.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.e4.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

       public void send (View v) {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            Intent intent2 = new Intent(this, DisplayMessageActivity.class);
            EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
            EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
            String message = editText.getText().toString();
            String message2 = editText2.getText().toString();
            Integer.parseInt(EXTRA_MESSAGE2);
            intent.putExtra(EXTRA_MESSAGE, message);
            intent2.putExtra(EXTRA_MESSAGE, message2);
            startActivity(intent);

        }
      
    }

