package com.alphastatusbaractivity.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;

import com.alphastatusbaractivity.BaseAlphaActivity;
import com.alphastatusbaractivity.R;

/**
 * Created by Fishy on 2017/2/3.
 */

public class DrawerLayoutActivity extends BaseAlphaActivity{
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawerlayout);
    }

    @Override
    protected int setStatusBarColor() {
        return getResources().getColor(R.color.toolbar_color);
    }

    @Override
    protected Mode setAlphaMode() {
        return Mode.DRAWER_LAYOUT;
    }

    @Override
    protected DrawerLayout setDrawerLayout() {
        return drawerLayout;
    }
}
