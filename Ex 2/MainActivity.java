package com.example.exercis5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Counter creationCounter, visibleCounter, hitCounter;
private TextView creationsCountText, visibleCountText, hitCountText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate() called");

        creationsCountText = findViewById(R.id.creationsCountText);
        visibleCountText = findViewById(R.id.visibleCountText);
        hitCountText = findViewById(R.id.hitCountText);

        SharedPreferences prefGet = getSharedPreferences("MyTestPref" ,Activity.MODE_PRIVATE);
        int creationValue = prefGet.getInt("Creations", 0);
        int visiblesValue = prefGet.getInt("Visibles", 0);
        int hitValue = prefGet.getInt("Hits", 0);

        creationCounter = new Counter(0,-100, 100, creationValue, 1);
        visibleCounter = new Counter(0,-100, 100, visiblesValue, 1);
        hitCounter = new Counter(0,-100, 100, hitValue, 1);


        creationCounter.plus();
        updateUI();
    }

    public void updateUI(){
        creationsCountText.setText(Integer.toString(creationCounter.getValue()));
        visibleCountText.setText(Integer.toString(visibleCounter.getValue()));
        hitCountText.setText(Integer.toString(hitCounter.getValue()));
    }

    public void hitButtonPressed(View v){
        hitCounter.plus();
        updateUI();
    }
    public void resetButtonPressed(View v){
        hitCounter.reset();
        creationCounter.reset();
        visibleCounter.reset();
        updateUI();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart() called");
        visibleCounter.plus();
        updateUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TAG", "onPause() called");

        SharedPreferences prefPut = getSharedPreferences("MyTestPref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = prefPut.edit();

        prefEditor.putInt("Creations", creationCounter.getValue());
        prefEditor.putInt("Visibles", visibleCounter.getValue());
        prefEditor.putInt("Hits", hitCounter.getValue());

        prefEditor.commit();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy() called");
    }
}
