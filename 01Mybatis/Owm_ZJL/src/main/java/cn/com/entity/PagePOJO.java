package cn.com.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by annan on 2017/9/22.
 */
public class PagePOJO {


    private Integer pageIndex; //当前页码
    private Integer pageSize;//显示每页记录数
    private Integer totalpages;//总页数
    private Integer totalRecords;//总记录量
    private List<Smbms_user> list=new ArrayList<Smbms_user>();

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(Integer totalpages) {
        this.totalpages = totalpages;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<Smbms_user> getList() {
        return list;
    }

    public void setList(List<Smbms_user> list) {
        this.list = list;
    }
}
