package com.example.ubuntu.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MyAnimation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_animation1);
        final Animation animTrans= AnimationUtils.loadAnimation(this,R.anim.translate_right);
        final Button butt1=findViewById(R.id.But1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butt1.startAnimation(animTrans);
            }
        });
    }
}
