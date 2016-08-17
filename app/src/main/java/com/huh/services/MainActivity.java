package com.huh.services;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView mToolberName;
    private FrameLayout mContent;
    private BottomNavigationBar mBottomNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mToolbar = ((Toolbar) findViewById(R.id.toolbar));
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        mToolberName = ((TextView) findViewById(R.id.bar_name));
        mContent = ((FrameLayout) findViewById(R.id.fl_content));
        mBottomNavigationBar = ((BottomNavigationBar) findViewById(R.id.bottom_navigation_bar));
        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.news_checked, "新闻"))
                .addItem(new BottomNavigationItem(R.mipmap.sport_checked, "运动"))
                .addItem(new BottomNavigationItem(R.mipmap.apple_checked, "苹果"))
                .addItem(new BottomNavigationItem(R.mipmap.me_checked, "我"))
                .setFirstSelectedPosition(0)
                .initialise();
    }
}
