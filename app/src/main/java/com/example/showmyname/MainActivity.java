package com.example.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView txt;
    private EditText entername;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        txt=findViewById(R.id.txtV);
        entername=findViewById(R.id.EnterName);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=entername.getText().toString();
                if (name.isEmpty()){
                    txt.setText("Hello ! Aiman");
                }else {
                    txt.setText("Hell!"+name);
                }

            }
        });

    }

}