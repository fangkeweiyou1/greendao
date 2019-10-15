package com.zhang.greendao;

import android.content.Context;
import android.util.Log;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.database.Database;

import java.util.List;

/**
 * Created by zhangyuncai on 2019/8/3.
 * 使用greendao文档,这个类仅仅做示范用
 */
public class GreenDaoDoc {
    private static String TAG = "GreenDaoDoc";
    private static Context context;



    public static void initGreenDao(Context context) {
        DBOpenHelper.dbContext=context;
        GreenDaoDoc.context = context;
    }

    public static GreenSimpleInfoDao getGreenSimpleInfoDao() {
        return DBOpenHelper.getGreenSimpleInfoDao();
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
