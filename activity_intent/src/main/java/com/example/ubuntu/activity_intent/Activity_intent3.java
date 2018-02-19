package com.example.ubuntu.activity_intent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ubuntu on 9/2/18.
 */

public class Activity_intent3 extends AppCompatActivity {

    private TextView textViewName,textViewClass,textViewAddress;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent3);

        textViewName = findViewById(R.id.text_name);
        textViewClass = findViewById(R.id.text_class);
        textViewAddress = findViewById(R.id.text_address);

        final Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            textViewName.setText(bundle.getString("NAME"));
            textViewClass.setText(bundle.getString("CLASS"));
            textViewAddress.setText(bundle.getString("ADDRESS"));
        }
    }
}
