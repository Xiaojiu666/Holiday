package com.cc.interview.holiday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

    private RelativeLayout activity_main;
    private TextView tv;
    private ViewUtils viewUtils;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
        initData();
    }

    private void initData() {
        viewUtils=new ViewUtils(SecondActivity.this);
        viewUtils.ssetClick(new ViewUtils.A() {
            @Override
            public void paint() {

            }

            @Override
            public void clear() {

            }
        });
    }

    public void init() {
        //init
        activity_main= (RelativeLayout) findViewById(R.id.activity_second);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText("huituiceshi");
        iv= (ImageView) findViewById(R.id.iv);

        activity_main.setVisibility(View.GONE);

        initDialog();
        showDialog();

    }


}
