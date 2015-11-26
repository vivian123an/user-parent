package me.quxiu.user.model;

import java.io.Serializable;

public class UserGroup implements Serializable{
	
	private static final long serialVersionUID = 4016145765416142687L;

	private long id;

    private String name;

    private int score;

    private Double discount;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}