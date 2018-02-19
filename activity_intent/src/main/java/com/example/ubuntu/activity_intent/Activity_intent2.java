package com.example.ubuntu.activity_intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_intent2 extends AppCompatActivity {

    private EditText editTextName, editTextClass, editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        editTextName = findViewById(R.id.edit_text_name);
        editTextClass = findViewById(R.id.edit_text_class);
        editTextAddress = findViewById(R.id.edit_text_address);

        final Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            editTextName.setText(bundle.getString("NAME"));
            editTextClass.setText(bundle.getString("CLASS"));
        }

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
        bundle.putString("ADDRESS", editTextAddress.getText().toString().trim());

         Intent intent2 = new Intent(Activity_intent2.this, Activity_intent3.class);
         intent2.putExtras(bundle);
         startActivity(intent2);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
