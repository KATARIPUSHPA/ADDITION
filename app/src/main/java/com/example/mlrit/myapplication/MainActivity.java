package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText et5;
    EditText et6;
    EditText et7;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
        et7=(EditText)findViewById(R.id.et7);
        b=(Button)findViewById(R.id.b);
        b.setOnClickListener(( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et5.getText().toString());
                int b=Integer.parseInt(et6.getText().toString());
                int c=a+b;
                 et7.setText(Integer.toString(c));

            }
        }));
    }
}
