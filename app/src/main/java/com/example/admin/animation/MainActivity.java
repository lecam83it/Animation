package com.example.admin.animation;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_hat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_hat = (ImageView) findViewById(R.id.img_hat);



        img_hat.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.img_hat:
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
                img_hat.startAnimation(animation);
                break;
        }
    }
}
