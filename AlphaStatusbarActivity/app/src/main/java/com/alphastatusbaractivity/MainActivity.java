package com.alphastatusbaractivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alphastatusbaractivity.sample.DrawerLayoutActivity;
import com.alphastatusbaractivity.sample.ImageToolbarActivity;
import com.alphastatusbaractivity.sample.NormalColorActivity;

/**
 * Created by Fishy on 2017/2/3.
 */

public class MainActivity extends AppCompatActivity{
    Button btnNormal,btnImage,btnDrawerlayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNormal= (Button) findViewById(R.id.normal_color);
        btnImage= (Button) findViewById(R.id.image_toolbar);
        btnDrawerlayout= (Button) findViewById(R.id.drawerlayout);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NormalColorActivity.class));
            }
        });
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ImageToolbarActivity.class));
            }
        });
        btnDrawerlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DrawerLayoutActivity.class));
            }
        });
    }
}
