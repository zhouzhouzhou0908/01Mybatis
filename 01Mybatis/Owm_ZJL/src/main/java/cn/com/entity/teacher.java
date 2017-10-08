package cn.com.entity;

import java.util.ArrayList;
import java.util.List;

public class teacher {
    private Integer tid;
    private String tname;
    private List<student> stu=new ArrayList<student>();

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<student> getStu() {
        return stu;
    }

    public void setStu(List<student> stu) {
        this.stu = stu;
    }
}