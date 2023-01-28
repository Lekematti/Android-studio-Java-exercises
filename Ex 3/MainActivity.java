package com.example.exercise2_2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = new Counter();
    }
    public void plus(View v) {
        TextView tv = findViewById(R.id.textView);
        counter.plus();
        tv.setText(Integer.toString(counter.getValue()));

    }
    public void minus(View v) {
        TextView tv = findViewById(R.id.textView);
        counter.minus();
        tv.setText(Integer.toString(counter.getValue()));
    }
    public void reset(View v) {
        TextView tv = findViewById(R.id.textView);
        counter.reset();
        tv.setText(Integer.toString(counter.getValue()));

    }
}



