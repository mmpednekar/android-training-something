package com.example.ubuntu.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity34 extends AppCompatActivity {
    private Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);

        final EditText editText = findViewById(R.id.textEdit_1);
        final EditText editText2 = findViewById(R.id.textEdit_2);


        button_1 = findViewById(R.id.Button_1);
        button_1.setEnabled(false);
        // Button button_2 = findViewById(R.id.Button_2);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SharedPreferences sp = MainActivity34.this.getSharedPreferences("demo.xml", MODE_PRIVATE);
                SharedPreferences.Editor spe = sp.edit();
                spe.putString("personName", editText1.getText().toString());
                spe.commit();//sp.apply();*/
            }
        });
        /*button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp2=MainActivity34.this.getSharedPreferences("demo.xml",MODE_PRIVATE);
                String person_Name= sp2.getString("personName", String.valueOf(12));
                editText2.setText(person_Name);
            }
        });*/

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(count>=12)
                    editText.setText(editText.getText().toString()+"\b");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editText2.setText(String.valueOf(count));
                if (editText.getText().toString().trim().length() > 10) {
                    button_1.setEnabled(true);
                }
                else
                    button_1.setEnabled(false);
                }

                @Override
                public void afterTextChanged (Editable s){

                }
            });
        }
    }
