package cn.com.entity;

import java.util.ArrayList;
import java.util.List;

public class news {
    private Integer newsid;
    private String newstitle;
    private  String newsContene;
    private Integer clickCount;
    private List<talk> tak=new ArrayList<talk>();

    public List<talk> getTak() {
        return tak;
    }

    public void setTak(List<talk> tak) {
        this.tak = tak;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsContene() {
        return newsContene;
    }

    public void setNewsContene(String newsContene) {
        this.newsContene = newsContene;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}