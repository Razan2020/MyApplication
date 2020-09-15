package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b ;
    EditText e;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button3);
        e=(EditText) findViewById(R.id.name);
        t=(TextView) findViewById(R.id.text);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String j = e.getText().toString();
                t.setText("Hello " + j);

            }
        });

    }

}
