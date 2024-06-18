package com.example.simple_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText edit1,edit2,edit3;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.first_input);
        edit2=findViewById(R.id.second_input);
        edit3=findViewById(R.id.final_input);
        b1=findViewById(R.id.sum_button);
        b2=findViewById(R.id.sub_button);
        b3=findViewById(R.id.mul_button);
        b4=findViewById(R.id.div_button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edit1.getText().toString().trim();
                String b=edit2.getText().toString().trim();

                Integer c=Integer.parseInt(a);
                Integer d=Integer.parseInt(b);
                Integer e=c+d;

                String f=String.valueOf(e);

                edit3.setText(f);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edit1.getText().toString().trim();
                String b=edit2.getText().toString().trim();

                Integer c=Integer.parseInt(a);
                Integer d=Integer.parseInt(b);
                Integer e=c-d;

                String f=String.valueOf(e);

                edit3.setText(f);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edit1.getText().toString().trim();
                String b=edit2.getText().toString().trim();

                Integer c=Integer.parseInt(a);
                Integer d=Integer.parseInt(b);
                Integer e=c*d;

                String f=String.valueOf(e);

                edit3.setText(f);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edit1.getText().toString().trim();
                String b=edit2.getText().toString().trim();

                Integer c=Integer.parseInt(a);
                Integer d=Integer.parseInt(b);
                Integer e=c/d;

                String f=String.valueOf(e);

                edit3.setText(f);
            }
        });



    }
}