package com.example.forlove.SP;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * created by jiangtao on 2021/3/3 14:18
 * breakTT
 */
public class SPUser {

    /**
     * 写入数据
     *
     * @param context
     */
    public static void onEdit(Context context, String key, String value) {
        //可以创建一个新的SharedPreference来对储存的文件进行操作
        SharedPreferences sp = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        //像SharedPreference中写入数据需要使用Editor
        SharedPreferences.Editor editor = sp.edit();
        //类似键值对
        editor.putString(key, value);
        //editor.apply();
        editor.commit();
    }


    /**
     * 读取数据
     *
     * @param context
     * @param key
     * @return 返回存储的信息
     */
    public static String onRead(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        //第一个参数是键名，第二个是默认值
        String name;
        switch (key) {
            case "First":
                boolean state = sp.getBoolean("First", false);
                //已经登陆了就是true
                if (state) {
                    name = "true";
                }else {
                    name = "false";
                }
            default:
                name = sp.getString(key, "暂无");
                break;
        }
        return name;
    }

    /**
     * 检索
     *
     * @param context
     */
    public static void retrieval(Context context) {
        SharedPreferences sp = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        //检查当前键是否存在
        boolean isContains = sp.contains("key");

        //使用getAll可以返回所有可用的键值
        //Map<String,?> allMaps=sp.getAll();
    }

    /**
     * 删除sp
     *
     * @param context
     */
    public static void delete(Context context) {
        SharedPreferences sp = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
    }
}
