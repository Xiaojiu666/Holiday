package com.cc.interview.holiday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

    private View activity_main;
    private TextView tv;

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
        tv= (TextView) findViewById(R.id.tv);
        tv.setText("huituiceshi");
        activity_main.setVisibility(View.GONE);
    }


}
