package com.zhang.greendao;

import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by zhangyuncai on 2019/8/3.
 * 使用greendao文档
 */
public class GreenDaoDoc {
    private static String TAG = "GreenDaoDoc";
    private static Context context;

    /*依赖本module*/

    /*项目build依赖以下*/
//    mavenCentral() // add repository
//    classpath 'org.greenrobot:greendao-gradle-plugin:3.2.2' // add plugin

    /*需要用到数据库的module.build依赖一下,并添加green数据库版本号*/
//    apply plugin: 'org.greenrobot.greendao' // apply plugin
//    android{
//    greendao {
//        schemaVersion 1
//    }
//    }

    /*新建info表,build后自动生成DaoMaster, DaoSession类,到此完成greendao依赖*/

    /*
    todo 注意使用GreenDaoUpdateListener升级数据库版本的回调
    * */

    public static void initGreenDao(Context context, GreenDaoUpdateListener listener) {
        GreenDaoDoc.context = context;
        DBOpenHelper.listener = listener;
    }

    public static GreenSimpleInfoDao getGreenSimpleInfoDao() {
        return DBOpenHelper.getDaoSession(context).getGreenSimpleInfoDao();
    }

    /**
     * 增
     */
    public static void insert() {
        GreenSimpleInfo info = new GreenSimpleInfo();
        info.setAge("11");
        info.setName("使用greendao文档");
        long insert = getGreenSimpleInfoDao().insert(info);
        if (insert > 0) {
            Log.i(TAG, "插入成功!");
        } else {
            Log.i(TAG, "插入成功!");
        }
    }

    /**
     * 删
     */
    public static void delete() {

    }

    /**
     * 改
     */
    public static void update() {

    }

    /**
     * 查
     */
    public static void query(String name) {
        List<GreenSimpleInfo> list = getGreenSimpleInfoDao().queryBuilder().where(GreenSimpleInfoDao.Properties.Name.eq(name)).build().list();
        for (GreenSimpleInfo info : list) {
            Log.i(TAG, "查到结果:" + info.getName());
        }
    }
}
