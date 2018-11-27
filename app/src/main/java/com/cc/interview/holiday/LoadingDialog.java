package com.cc.interview.holiday;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2018/11/26.
 */

public class LoadingDialog extends Dialog{
    private Context context;
    private View inflate;
    private ImageView progress_view;
    private AnimationDrawable progress_viewDrawable;

    public LoadingDialog(Context context) {
        super(context);
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflate = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null, true);
        progress_view = inflate.findViewById(R.id.iv_loading);
        progress_view.setImageResource(R.drawable.loading_anim);
        progress_viewDrawable = (AnimationDrawable) progress_view.getDrawable();
        setContentView(inflate);
        setCanceledOnTouchOutside(true);
    }

    //展示popupWindow
    public void showProgressPopup() {
        if (!isShowing()) {
            show();
            if(progress_viewDrawable != null){
                progress_viewDrawable.start();
            }
        }
    }

    //消失popupWindow
    public void dismissProgressPopup() {
        if (isShowing()) {
        dismiss();
        if(progress_viewDrawable != null){
            progress_viewDrawable.stop();
        }
    }
}
}
