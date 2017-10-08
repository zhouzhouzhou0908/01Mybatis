package cn.zjl.Day02.printer;

import cn.zjl.Day02.ink.Ink;
import cn.zjl.Day02.paper.paper;

public class print {
    private Ink ink;
    private paper paper;

    public  void printer(){
        System.out.println("小哥，你正在使用"+ink.getColor()+"打印机，打印我黑凤梨"+paper.getPaper());
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public cn.zjl.Day02.paper.paper getPaper() {
        return paper;
    }

    public void setPaper(cn.zjl.Day02.paper.paper paper) {
        this.paper = paper;
    }
}