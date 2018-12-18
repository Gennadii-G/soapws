package com.study.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="goods")
public class Goods {

    public Goods() {
    }

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
