package me.quxiu.user.model;

import java.io.Serializable;

public class UserLevel implements Serializable{
	
	private static final long serialVersionUID = 2475316213737825437L;

	private long id;

    private String name;

    private int point;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}