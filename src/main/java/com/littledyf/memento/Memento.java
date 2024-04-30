package com.littledyf.memento;

/**
 * @Author dengyifan
 * @create 2024/4/30 14:12
 * @description 备忘录类
 */
public class Memento {

    private String name;

    private String address;

    private Integer blood;

    private Integer vigor;

    public Memento(String name, String address, Integer blood, Integer vigor) {
        this.name = name;
        this.address = address;
        this.blood = blood;
        this.vigor = vigor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public Integer getVigor() {
        return vigor;
    }

    public void setVigor(Integer vigor) {
        this.vigor = vigor;
    }

}
