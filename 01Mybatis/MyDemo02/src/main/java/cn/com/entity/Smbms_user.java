package cn.com.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 用户表（smbms_user表）
 * Created by annan on 2017/9/18.
 */
public class Smbms_user {
    private Integer id;//id
    private String userCode;//用户编码 userCode userName gender birthday phone userType
    private String userName;//用户名称
    private String userPassword;//用户密码
    private int gender;//性别
    private Date birthday;//出生日期
    private String phone;//手机
    private String address;//地址
    private Integer userType;//用户类型（1：系统管理员、2：经理、3：普通员工）
    private long createdBy;//创建者（userId）
    private Date creationDate;//创建时间
    private long modifyBy;//更新者（userId）
    private Date modifyDate;//更新时间
    private Integer age;
    private Integer start;
    private Integer pagesize;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        Date date=new Date();
        age = date.getYear()-birthday.getYear();

        this.birthday =birthday;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
