package com.example.penginryo.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) this.findViewById(R.id.defaultText);
        button = (Button) findViewById(R.id.button);
    }

    public void increment(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
