package com.example.loto0206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText soMn,soMx;
    Button random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soMn=(EditText)findViewById(R.id.edittextSomin);
        soMx=(EditText)findViewById(R.id.edittextSomax);
        random=(Button)findViewById(R.id.buttonRandom);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soMin0 = soMn.getText().toString();
                String soMax0 = soMx.getText().toString();
                int soMax =0;
                int soMin=0;
                if(soMin0.trim().equals("") || soMax0.trim().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Vui lòng nhập số đầy đủ",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    soMin =Integer.parseInt(soMin0);
                    soMax =Integer.parseInt(soMax0);
                    if(soMax > soMin)
                    {
                        Toast.makeText(MainActivity.this,"Thành công",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        int temp =soMin+1;
                        soMx.setText(String.valueOf(temp));
                    }
                }
            }
        });

    }
}