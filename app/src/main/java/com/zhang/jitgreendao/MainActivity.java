package com.zhang.jitgreendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zhang.greendao.GreenDaoDoc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GreenDaoDoc.context=getApplicationContext();
    }

    public void add(View view) {
        GreenDaoDoc.insert();
    }

    public void query(View view) {
        GreenDaoDoc.query("使用greendao文档");
    }
}
