package com.alphastatusbaractivity.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;

import com.alphastatusbaractivity.BaseAlphaActivity;
import com.alphastatusbaractivity.R;

/**
 * Created by Fishy on 2017/2/3.
 */

public class NormalColorActivity extends BaseAlphaActivity{
    private final int alpha=40;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_color);
    }

    @Override
    protected int setStatusBarColor() {
        return getResources().getColor(R.color.toolbar_color);
    }

    @Override
    protected Mode setAlphaMode() {
        return Mode.NORMAL_COLOR;
    }

    @Override
    protected DrawerLayout setDrawerLayout() {
        return null;
    }

    @Override
    protected int setTransparentViewAlpha() {
        return alpha;
    }
}
