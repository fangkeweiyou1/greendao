package com.zhang.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zhangyuncai on 2019/8/3.
 * 数据库样式
 */
@Entity
public class GreenSimpleInfo {
    @Id
    private Long id;
    private String name;
    private String age;
    @Generated(hash = 1784278215)
    public GreenSimpleInfo(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Generated(hash = 1383345792)
    public GreenSimpleInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
