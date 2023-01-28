package com.example.exercise3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Counter counter;

    private TextView tv;
    private final String DECIMAL = "dec";
    private final String BINARY = "bin";
    private final String HEXADECIMAL = "hex";
    private String selectedButtonId = DECIMAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv =findViewById(R.id.textView);
        counter = new Counter();
    }
    public void plus(View v) {
        counter.plus();
        updateUI();

    }
    public void minus(View v) {
        counter.minus();
        updateUI();
    }
    public void reset(View v) {
        counter.reset();
        updateUI();

    }

    private void updateUI(){
        switch (selectedButtonId){
            case DECIMAL:
                tv.setText(counter.countToString());
                break;
            case BINARY:
                tv.setText(counter.countToBinary());
                break;
            case HEXADECIMAL:
                tv.setText(counter.countToHex());
              break;
    }
        }


public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    selectedButtonId = DECIMAL;
                updateUI();
                    break;
            case R.id.radioButton2:
                if (checked)
                    selectedButtonId = BINARY;
                updateUI();
                    break;
            case R.id.radioButton3:
                if (checked)
                    selectedButtonId = HEXADECIMAL;
                updateUI();
                    break;
            }
        }
}
