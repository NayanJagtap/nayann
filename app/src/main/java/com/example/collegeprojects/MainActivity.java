package com.example.collegeprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterkm;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterkm=(EditText)findViewById(R.id.MeterEditText);
        resultTextView=(TextView)findViewById(R.id.resultId);
        convertButton=(Button)findViewById(R.id.convertButtonID);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double result=0.0;
                if(enterkm.getText().toString().equals("")){
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                }
                else{
                    double kmvalue=Double.parseDouble(enterkm.getText().toString());
                    result= 0.621*kmvalue;
                    resultTextView.setTextColor(Color.RED);
                    resultTextView.setText(String.format( ""+result)+" miles");

                }


            }
        });

    }
}