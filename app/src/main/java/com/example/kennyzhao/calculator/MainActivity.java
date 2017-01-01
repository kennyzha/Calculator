package com.example.kennyzhao.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

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

    public void buttonChecker(View view) {
        switch(view.getId()){
            case R.id.button0:
                appendToTextView("0");
                break;
            case R.id.button1:
                appendToTextView("1");
                break;
            case R.id.button2:
                appendToTextView("2");
                break;
            case R.id.button3:
                appendToTextView("3");
                break;
            case R.id.button4:
                appendToTextView("4");
                break;
            case R.id.button5:
                appendToTextView("5");
                break;
            case R.id.button6:
                appendToTextView("6");
                break;
            case R.id.button7:
                appendToTextView("7");
                break;
            case R.id.button8:
                appendToTextView("8");
                break;
            case R.id.button9:
                appendToTextView("9");
                break;
            case R.id.button_equal:
                int ans = computeAnswer();
                text.setText("Place Holder answer");
                break;
            case R.id.button_mult:
                appendToTextView("x");
                break;
            case R.id.button_div:
                appendToTextView("/");
                break;
            case R.id.button_plus:
                appendToTextView("+");
                break;
            case R.id.button_minus:
                appendToTextView("-");
                break;
            case R.id.button_dot:
                appendToTextView(".");
                break;
            case R.id.button_clear:
                clear();
                break;
        }
    }

    public void appendToTextView(String s){
        String txt = String.valueOf(text.getText()) + s;
        text.setText(txt);
    }

    public int computeAnswer(){
        int result = 0;

        String txt = String.valueOf(text.getText());
        Stack<String> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        

        return result;
    }

    public void clear(){
        text.setText("");

        Context context = getApplicationContext();
        CharSequence text = "Input cleared!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
