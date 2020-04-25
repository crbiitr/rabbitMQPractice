package com.practice.rabbitmq.model;

import java.io.Serializable;

/**
 * Created by chetan on 23/4/20.
 */
public class SimpleMessage implements Serializable{
    private String name;
    private String desc;

    public SimpleMessage(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
