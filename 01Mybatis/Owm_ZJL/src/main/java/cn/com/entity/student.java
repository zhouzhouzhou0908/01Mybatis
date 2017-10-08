package cn.com.entity;

import java.util.ArrayList;
import java.util.List;

public class student {
    private  Integer sid;
    private  String sname;
    private List<teacher> tes=new ArrayList<teacher>();

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<teacher> getTes() {
        return tes;
    }

    public void setTes(List<teacher> tes) {
        this.tes = tes;
    }
}