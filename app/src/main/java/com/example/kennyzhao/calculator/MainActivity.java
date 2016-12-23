package com.example.kennyzhao.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button sevenButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView) ;
        sevenButton = (Button) findViewById(R.id.button7);
    }

    public void inputSeven(View view) {
        switch(view.getId()){
            case R.id.button7:
                String txt = String.valueOf(text.getText()) + "7";
                text.setText(txt);
                break;

        }


    }
}
