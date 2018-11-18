package com.cc.interview.holiday;

/**
 * Created by Administrator on 2018/11/18.
 * 饿汉式
 */

public class Singleton {
    private  static Singleton instance=new Singleton();

    private  Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
