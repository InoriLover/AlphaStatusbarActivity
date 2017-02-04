package com.alphastatusbaractivity.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;

import com.alphastatusbaractivity.BaseAlphaActivity;
import com.alphastatusbaractivity.R;

/**
 * Created by Fishy on 2017/2/3.
 */

public class ImageToolbarActivity extends BaseAlphaActivity{
    private final int alpha=40;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    @Override
    protected int setStatusBarColor() {
        return 0;
    }

    @Override
    protected Mode setAlphaMode() {
        return Mode.IMAGE_TOOLBAR;
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
