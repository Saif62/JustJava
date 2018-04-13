package com.example.android.justjava;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     AnimationDrawable animation;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.cup_animation);
        animation = (AnimationDrawable) imageView.getDrawable();
        animation.start();

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoreActivity();
            }
        });
    }

    public void openStoreActivity() {
        Intent intent = new Intent(this, StoreActivity.class);
        startActivity(intent);
    }
}
