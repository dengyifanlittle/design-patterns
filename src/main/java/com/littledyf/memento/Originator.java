package com.littledyf.memento;

/**
 * @Author dengyifan
 * @create 2024/4/30 14:04
 * @description 发起人类
 */
public class Originator {
    private String name;

    private String address;

    private Integer blood;

    private Integer vigor;

    public Originator(String name, String address, Integer blood, Integer vigor) {
        this.name = name;
        this.address = address;
        this.blood = blood;
        this.vigor = vigor;
    }

    public void recover(Memento memento){
        this.name = memento.getName();
        this.address = memento.getAddress();
        this.blood = memento.getBlood();
        this.vigor = memento.getVigor();
    }

    public Memento save(){
        return new Memento(name,address,blood,vigor);
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

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", blood=" + blood +
                ", vigor=" + vigor +
                '}';
    }
}
