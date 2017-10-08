package cn.zjl.Day01;

public class zjl_Service {
    private String info;

    public zjl_Service() {
        System.out.println("正在构建对象。。。。。");
    }

    @Override
    public String toString() {
        return "zjl_Service{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void work(){
        System.out.println("Hello"+info);
    }
}