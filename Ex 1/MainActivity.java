package com.example.Exercise6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "activity";
    public static final String Extra = "EX6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.list);
        lv.setAdapter(new ArrayAdapter<President>(this, android.R.layout.simple_list_item_1, Presidents.getInstance().getPresidents()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick("+ i +")");
                Intent nextActivity = new Intent(MainActivity.this, PresidentActivity.class);
                nextActivity.putExtra(Extra, i);
                startActivity(nextActivity);
            }
        });
    }
}