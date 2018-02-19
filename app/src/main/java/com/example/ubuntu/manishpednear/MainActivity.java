package com.example.ubuntu.manishpednear;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        final int[] clor={R.color.red,R.color.colorAccent,R.color.blue,R.color.colorPrimary,R.color.colorPrimaryDark,R.color.green,R.color.orange,R.color.voilet,R.color.white,R.color.yellow};

        final EditText etDetail1 = findViewById(R.id.et_detail_1);
        final EditText etDetail2 = findViewById(R.id.et_detail_2);

        final Button buttonDetail1 = findViewById(R.id.button_detail_1);
        Button buttonDetail2 = findViewById(R.id.button_detail_2);

        final TextView tvAppendedText = findViewById(R.id.textview_appended_text);

        buttonDetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                tvAppendedText.setText(
                        tvAppendedText.getText().toString().trim()
                                + "\n\n"
                                + etDetail1.getText().toString().trim()
                );
                */

               /* if (etDetail1.getText().toString().trim().length() > 0) {
                    tvAppendedText.append(
                            "\n\n1] " + etDetail1.getText().toString().trim()
                    );
                    etDetail1.setText("");
                }*/
                int rand_chce=(int)(Math.random()*10);
                buttonDetail1.setBackgroundColor(
                        mContext.getResources().getColor(clor[rand_chce]));
            }
        });

        buttonDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etDetail2.getText().toString().trim().length() > 0) {

                    tvAppendedText.append(
                            "\n\n2] "
                    );
                    etDetail2.setText("");
                }
            }
        });
    }
}