package com.cc.interview.holiday;

import android.app.Dialog;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class BaseActivity extends AppCompatActivity {

    private Dialog loadingDialog;
    private View inflate;
    private ImageView progress_view;
    private AnimationDrawable progress_viewDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 隐藏标题栏
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        // 沉浸效果
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }

    public void initDialog(){
        loadingDialog=new Dialog(this,R.style.NormalDialogStyle);
        inflate = LayoutInflater.from(this).inflate(R.layout.dialog_loading, null, true);
        progress_view = inflate.findViewById(R.id.iv_loading);
        progress_viewDrawable = (AnimationDrawable) progress_view.getDrawable();
        setContentView(inflate);
        loadingDialog.setCanceledOnTouchOutside(true);




    }

    public void showDialog(){
        if (!loadingDialog.isShowing()) {
            loadingDialog.show();
            if(progress_viewDrawable != null){
                progress_viewDrawable.start();
            }
        }
    }
    public void disDialog(){
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
            if(progress_viewDrawable != null){
                progress_viewDrawable.stop();
            }
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        Resources resources = this.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = 1;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }



    /**
     * 权限检查方法，false代表没有该权限，ture代表有该权限
     */
    public boolean hasPermission(String... permissions) {
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    /**
     * 权限请求方法
     */
    public void requestPermission(int code, String... permissions) {
        ActivityCompat.requestPermissions(this, permissions, code);
    }

    /**
     * 处理请求权限结果事件 * * @param requestCode 请求码 * @param permissions 权限组 * @param grantResults 结果集
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
       // doRequestPermissionsResult(requestCode, grantResults);
    }
//    /**
//     * 处理请求权限结果事件 * * @param requestCode 请求码 * @param grantResults 结果集
//     */
//    public void doRequestPermissionsResult(int requestCode, @NonNull int[] grantResults) {
//
//    }
//
//    /**
//     * 网络状态改变时间监听 * * @param netWorkState true有网络，false无网络
//     */
//    @Override
//    public void onNetChange(boolean netWorkState) {
//
//    }

//}


}
