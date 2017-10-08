package cn.zjl.entity;

public class Car {
    private String bard;

    @Override
    public String toString() {
        return "Car{" +
                "bard='" + bard + '\'' +
                '}';
    }

    public String getBard() {
        return bard;
    }

    public void setBard(String bard) {
        this.bard = bard;
    }
}