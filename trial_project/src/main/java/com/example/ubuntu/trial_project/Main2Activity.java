package com.example.ubuntu.trial_project;

import android.preference.PreferenceFragment;
import android.support.annotation.ArrayRes;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    //  int[] but;
    Button[] button_dtl;

/*    private int detectRandom(int max, int min) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }*/

    /*private Button[] reset_Array(Button[] arr, int rd) {
        int len = arr.length, j = 0;
        Button arr2[] = new Button[len - 1];
        for (int i = 0; i < len; i++) {
            if (arr[i] != arr[rd]) {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(Main2Activity.this, "window in Oncreate ", Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main2);

        final Animation animFade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        final Animation animFade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        final Animation animScale_in = AnimationUtils.loadAnimation(this, R.anim.scale_in);
        final Animation animScale_out = AnimationUtils.loadAnimation(this, R.anim.scale_out);
        final Button but_1 = findViewById(R.id.button_detail_1);
        final Button but_2 = findViewById(R.id.button_detail_2);
        final Button but_3 = findViewById(R.id.button_detail_3);
        final Button but_4 = findViewById(R.id.button_detail_4);
        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but_1.startAnimation(animFade_in);
            }
        });
        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but_2.startAnimation(animFade_out);
            }
        });
        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but_3.startAnimation(animScale_in);
            }
        });
        but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but_4.startAnimation(animScale_out);
            }
        });
/*        but = new int[]{R.id.button_detail_1, R.id.button_detail_2, R.id.button_detail_3, R.id.button_detail_4, R.id.button_detail_5};
        button_dtl = new Button[5];

        for (int i = 0; i < 5; i++) {
            button_dtl[i] = findViewById(but[i]);
        }

        button_dtl[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = detectRandom(button_dtl.length-1, 0);
                button_dtl[rd].setVisibility(View.INVISIBLE);
                button_dtl = reset_Array(button_dtl, rd);
            }
        });
        button_dtl[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = detectRandom(button_dtl.length-1, 0);
                button_dtl[rd].setVisibility(View.INVISIBLE);
                button_dtl = reset_Array(button_dtl, rd);
            }
        });
        button_dtl[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = detectRandom(button_dtl.length-1, 0);
                button_dtl[rd].setVisibility(View.INVISIBLE);
                button_dtl = reset_Array(button_dtl, rd);
            }
        });
        button_dtl[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = detectRandom(button_dtl.length-1, 0);
                button_dtl[rd].setVisibility(View.INVISIBLE);
                button_dtl = reset_Array(button_dtl, rd);
            }
        });
        button_dtl[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = detectRandom(button_dtl.length-1, 0);
                button_dtl[rd].setVisibility(View.INVISIBLE);
                button_dtl = reset_Array(button_dtl, rd);
            }
        });*/

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Main2Activity.this, "window is Started ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Main2Activity.this, "window is Resumed ", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Main2Activity.this, "window in Paused ", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Main2Activity.this, "window in Stopped ", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Main2Activity.this, "window in Restarted ", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Main2Activity.this, "window in destroyed ", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(Main2Activity.this, "back pressed ", Toast.LENGTH_LONG).show();

    }
}
