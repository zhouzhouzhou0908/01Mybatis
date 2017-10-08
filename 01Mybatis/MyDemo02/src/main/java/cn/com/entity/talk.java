package cn.com.entity;

import java.util.Date;

public class talk {
    private Integer tid;
    private String Content;
    private Date Talktime;
    private Integer nid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getTalktime() {
        return Talktime;
    }

    public void setTalktime(Date talktime) {
        Talktime = talktime;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}