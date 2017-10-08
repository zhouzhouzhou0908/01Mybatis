package cn.com.entity;

import java.util.ArrayList;
import java.util.List;

public class user_type {
    private Integer user_type_id;
    private String user_type_name;
    //
    private List<user_login> log=new ArrayList<user_login>();

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
    }

    public String getUser_type_name() {
        return user_type_name;
    }

    public void setUser_type_name(String user_type_name) {
        this.user_type_name = user_type_name;
    }

    public List<user_login> getLog() {
        return log;
    }

    public void setLog(List<user_login> log) {
        this.log = log;
    }
}