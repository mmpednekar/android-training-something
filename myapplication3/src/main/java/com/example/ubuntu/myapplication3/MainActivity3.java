package com.example.ubuntu.myapplication3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.ubuntu.myapplication3.R.id.click_button_1;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RadioGroup rdo_1=findViewById(R.id.rdo_1);

        final RadioButton rd1=findViewById(R.id.rd_button_1);
        final RadioButton rd2=findViewById(R.id.rd_button_2);
        final RadioButton rd3=findViewById(R.id.rd_button_3);
        final RadioButton rd4=findViewById(R.id.rd_button_4);

        Button cl_button_1=(Button) findViewById(R.id.click_button_1);

        rdo_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (group.getCheckedRadioButtonId() == R.id.rd_button_1)
                    Toast.makeText(MainActivity3.this, "ans" +rd1.getText(), Toast.LENGTH_LONG).show();
                else if (group.getCheckedRadioButtonId() == R.id.rd_button_2)
                    Toast.makeText(MainActivity3.this, "ans" +rd2.getText(), Toast.LENGTH_LONG).show();
                else if (group.getCheckedRadioButtonId() == R.id.rd_button_3)
                    Toast.makeText(MainActivity3.this, "ans" +rd3.getText(), Toast.LENGTH_LONG).show();
                else if(group.getCheckedRadioButtonId()==R.id.rd_button_4)
                Toast.makeText(MainActivity3.this, "ans" +rd4.getText(), Toast.LENGTH_LONG).show();

            }
        });

        cl_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alrt=new AlertDialog.Builder(MainActivity3.this);
                alrt.setTitle("dnt_click");
                alrt.setMessage("Dont Click Me");
                alrt.setPositiveButton("ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alrt.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alrt.setNeutralButton("retry",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alrt.create();
                alrt.show();
            }
        });
    }
}
