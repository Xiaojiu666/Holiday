package com.cc.interview.holiday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends BaseActivity {

    private View activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
        initData();
    }

    private void initData() {

    }

    public void init() {
        //init
        activity_main=findViewById(R.id.activity_second);
    }


}
