package com.dashan.apptest.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Set;

/**
 * SharePreferences
 * 要先在Application里面初始化
 * */
public class SharePreferencesUtil {
    private final static String log = "SharePreferencesUtil";
    private Context context;
    private static String KEY = "data";
    private static SharedPreferences preferences;

    /**
     * 初始化工具类
     * */
    @SuppressLint("WrongConstant")
    public static void init(Context context){
        preferences = context.getSharedPreferences(KEY, Context.MODE_APPEND);
    }


    public static void putString(String key,String value){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value).apply();
    }
    /**
     * 默认返回null
     * */
    public static String getString(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return null;}
        return preferences.getString(key,null);
    }

    public static void putInt(String key,int value){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value).apply();
    }
    /**
     * 默认返回0
     * */
    public static int getInt(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return 0;}
        return preferences.getInt(key,0);
    }

    public static void putBoolean(String key,boolean value){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key,value).apply();
    }
    /**
     * 默认返回false
     * */
    public static boolean getBoolean(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return false;}
        return preferences.getBoolean(key,false);
    }

    public static void putLong(String key,long value){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key,value).apply();
    }
    /**
     * 默认返回0
     * */
    public static long getLong(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return 0;}
        return preferences.getLong(key,0);
    }

    public static void putFloat(String key,float value){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key, value).apply();
    }
    /**
     * 默认返回0
     * */
    public static float getFloat(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return 0;}
        return preferences.getFloat(key,0);
    }

    public static void putSetString(String key, Set<String> set){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return;}
        SharedPreferences.Editor editor = preferences.edit();
        editor.putStringSet(key, set).apply();
    }
    /**
     * 默认返回null
     * */
    public static Set<String> getSetString(String key){
        if (preferences == null){Log.e(log,"SharePreferencesUtil还没有初始化");return null;}
        return preferences.getStringSet(key,null);
    }



}
