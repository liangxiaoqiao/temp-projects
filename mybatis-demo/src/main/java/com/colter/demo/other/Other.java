package com.colter.demo.other;

/**
 * @author liangchao
 * created on 4/7/2019 1:52 PM
 * desc:
 */
public class Other {
    private String id;
    private String name;


    public Other(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Other{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
