package cn.zjl.entity;

public class UserStu {

    private Integer id;
    private  String name;
    private  Integer age;
    private  String adds;

    public UserStu() {
    }

    public UserStu(Integer id, String name, Integer age, String adds) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adds = adds;
    }

    @Override
    public String toString() {
        return "UserStu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adds='" + adds + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }
}