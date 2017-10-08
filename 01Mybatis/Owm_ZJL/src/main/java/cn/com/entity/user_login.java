package cn.com.entity;

public class user_login {
    private Integer user_id;
    private Integer user_type_id;
    private String user_name;
    private user_type types;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public user_type getTypes() {
        return types;
    }

    public void setTypes(user_type types) {
        this.types = types;
    }
}