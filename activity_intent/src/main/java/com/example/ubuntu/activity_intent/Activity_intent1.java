package com.example.ubuntu.activity_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_intent1 extends AppCompatActivity {

    private EditText editTextName, editTextClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        editTextName = findViewById(R.id.edit_text_name);
        editTextClass = findViewById(R.id.edit_text_class);

        Button buttonSave = findViewById(R.id.button_save);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callSecondActivityWithData();
            }
        });
    }

    private void callSecondActivityWithData() {

        Bundle bundle = new Bundle();
        bundle.putString("NAME", editTextName.getText().toString().trim());
        bundle.putString("CLASS", editTextClass.getText().toString().trim());

        Intent intent = new Intent(Activity_intent1.this, Activity_intent2.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}