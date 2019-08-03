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

    /*TODO 依赖本module*/

    /*TODO  项目build依赖以下*/
//    mavenCentral() // add repository
//    classpath 'org.greenrobot:greendao-gradle-plugin:3.2.2' // add plugin

    /*TODO  需要用到数据库的module.build依赖一下,并添加green数据库版本号*/
//    apply plugin: 'org.greenrobot.greendao' // apply plugin
//    android{
//    greendao {
//        schemaVersion 1
//    }
//    }

    /*TODO  新建info表,build后自动生成DaoMaster, DaoSession类,到此完成greendao依赖*/

    /*
    todo 注意使用升级数据库版本
    * */
    /* TODO 复制以下类,注意所有的info类和以下类在一起,这样生成的DaoMaster,DaoSession才能保证唯一*/

//    public class DBOpenHelper extends DataHelper<DaoMaster, DaoSession> {
//
//        private com.zhang.greendao.DBOpenHelper.DevOpenHelper mDevOpenHelper;
//
//        private static com.zhang.greendao.DBOpenHelper mDBOpenHelper;
//
//
//        public DBOpenHelper(Context context) {
//            super(context);
//        }
//
//        public static DaoSession getDaoSession(Context context) {
//
//            create(context);
//            DaoSession daoSession = mDBOpenHelper.getDaoSession();
//            if (daoSession == null) {
//                mDBOpenHelper.init(context);
//                daoSession = mDBOpenHelper.getDaoSession();
//            }
//            return daoSession;
//        }
//
//
//        private static void create(Context context) {
//
//            if (mDBOpenHelper == null) {
//                mDBOpenHelper = new com.zhang.greendao.DBOpenHelper(context);
//            }
//        }
//
//        @Override
//        public void init(Context context) {
//
//            mDevOpenHelper = new com.zhang.greendao.DBOpenHelper.DevOpenHelper(context);
//            mDatabase = mDevOpenHelper.mDatabase;
//            mDaoMaster = new DaoMaster(mDatabase);
//            mDaoSession = mDaoMaster.newSession();
//
//        }
//
//
//        public static class DevOpenHelper extends DaoMaster.OpenHelper {
//
//            public Database mDatabase;
//
//            public DevOpenHelper(Context context) {
//                this(context, DB_NAME);
//            }
//
//            public DevOpenHelper(Context context, String name) {
//                super(context, name);
//                mDatabase = ENCRYPTED ? getEncryptedWritableDb("super-secret") : getWritableDb();
//            }
//
//
//            @Override
//            public void onUpgrade(Database db, int oldVersion, int newVersion) {
////            super.onUpgrade(db, oldVersion, newVersion);
//                Log.i("greenDAO", "migrating schema from version " + oldVersion + " to " + newVersion);
//                dropAllTables(db, true);
//                onCreate(db);
//                for (int migrateVersion = oldVersion + 1; migrateVersion <= newVersion; migrateVersion++) {
//                    switch (migrateVersion) {
//              /*      case 2:
//                        db.execSQL("ALTER TABLE INHABITANT ADD COLUMN 'GENDER' INTEGER NOT NULL DEFAULT '0';");
//                        break;*/
////                    case 4:
////                        db.execSQL("ALTER TABLE REPORT_INFO ADD COLUMN 'PATROL_IN_TIME' TEXT;");
////                        db.execSQL("ALTER TABLE REPORT_INFO ADD COLUMN 'PATROL_OUT_TIME' TEXT;");
////                        db.execSQL("ALTER TABLE REPORT_INFO ADD COLUMN 'STAR' INTEGER NOT NULL DEFAULT '0';");
////                        break;
//                    }
//                }
//            }
//
//            private void dropAllTables(Database db, boolean b) {
//                //todo 这里升级数据库要用到
////            GreenSimpleInfoDao.dropTable(db, b);
//            }
//            //                sql语句示例
////                db.execSQL("ALTER TABLE INHABITANT ADD COLUMN 'GENDER' INTEGER NOT NULL DEFAULT '0';");
////                db.execSQL("ALTER TABLE INHABITANT ADD COLUMN 'SPECIES' TEXT;");
////                db.execSQL("ALTER TABLE INVERTEBRATE ADD COLUMN 'SPECIES' TEXT;");
////                db.execSQL("ALTER TABLE PLANT ADD COLUMN 'SPECIES' TEXT;");
////                db.execSQL("ALTER TABLE CORAL ADD COLUMN 'SPECIES' TEXT;");
//        }
//
//    }


    /*TODO  最好,使用getDao()就可以进行增删改查了*/



//    @Entity
//    public class GreenSimpleInfo {
//        @Id
//        private Long id;
//        private String name;
//        private String age;
//    }


//    public static void initGreenDao(Context context) {
//        GreenDaoDoc.context = context;
//    }

//    public static GreenSimpleInfoDao getGreenSimpleInfoDao() {
//        return DBOpenHelper.getDaoSession(context).getGreenSimpleInfoDao();
//    }

    /**
     * 增
     */
    public static void insert() {
//        GreenSimpleInfo info = new GreenSimpleInfo();
//        info.setAge("11");
//        info.setName("使用greendao文档");
//        long insert = getGreenSimpleInfoDao().insert(info);
//        if (insert > 0) {
//            Log.i(TAG, "插入成功!");
//        } else {
//            Log.i(TAG, "插入成功!");
//        }
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
//        List<GreenSimpleInfo> list = getGreenSimpleInfoDao().queryBuilder().where(GreenSimpleInfoDao.Properties.Name.eq(name)).build().list();
//        for (GreenSimpleInfo info : list) {
//            Log.i(TAG, "查到结果:" + info.getName());
//        }
    }
}
