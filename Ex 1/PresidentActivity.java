package com.example.Exercise6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.Exercise6.MainActivity;
import com.example.Exercise6.Presidents;
import com.example.Exercise6.R;

import java.util.ArrayList;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president);

        ArrayList<President> presidents = Presidents.getInstance().getPresidents();
        Intent intent = getIntent();
        int message = intent.getIntExtra(MainActivity.Extra, -1);
        President SelectedPresident = presidents.get(message);

        TextView name = findViewById(R.id.name);
        name.setText(SelectedPresident.getName());

        int start = SelectedPresident.getStart();
        String startYearString = String.valueOf(start);

        TextView startYear = findViewById(R.id.startYear);
        startYear.setText(startYearString);

        int end = SelectedPresident.getEnd();
        String endYearString = String.valueOf(end);

        TextView endYear = findViewById(R.id.endYear);
        endYear.setText(endYearString);

        TextView Msg = findViewById(R.id.msg);
        Msg.setText(SelectedPresident.getMsg());

    }
}