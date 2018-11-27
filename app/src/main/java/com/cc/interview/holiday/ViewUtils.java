package com.cc.interview.holiday;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018/11/19.
 */

public class ViewUtils extends View {
    private A a;

    public ViewUtils(Context context) {
        super(context);
    }

    public ViewUtils(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewUtils(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewUtils(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void  init(){
        //操作
        a.clear();
    }
    private void  init2(){
        a.paint();
    }

    public interface A{
        void paint();
        void clear();
    }
    public void ssetClick(A a){
        this.a=a;
    }
}
