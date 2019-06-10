package org.primefaces.test;

import java.io.Serializable;
import java.util.Collection;

public class TestPojo implements Serializable {

    private int id;
    private String name;

    public TestPojo(int id, String name) {
        super();
        this.setId(id);
        this.setName(name);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TestPojo [id=").append(id).append(", name=").append(name).append("]");
        return builder.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}