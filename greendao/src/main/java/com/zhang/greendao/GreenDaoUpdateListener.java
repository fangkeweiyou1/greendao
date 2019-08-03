package com.zhang.greendao;

import org.greenrobot.greendao.database.Database;

/**
 * Created by zhangyuncai on 2019/8/3.
 * 用于green module  譬如升级数据库等的回调
 */
public interface GreenDaoUpdateListener {
    void dropAllTables(Database db, boolean b);
}
