package me.quxiu.user.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserLog {
    private long id;

    private Date timeLog;

    private int logTimeBak;

    private int logAdminId;

    /**
     * 操作用户Id
     */
    private long logUserId;

    private String logUserName;

    private Double money;

    private int score;

    private int point;

    /**
     * 账户明细对应账户Id
     */
    private long userId;

    private String ip;

    private String logInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(Date timeLog) {
        this.timeLog = timeLog;
    }

    public int getLogTimeBak() {
        return logTimeBak;
    }

    public void setLogTimeBak(int logTimeBak) {
        this.logTimeBak = logTimeBak;
    }

    public int getLogAdminId() {
        return logAdminId;
    }

    public void setLogAdminId(int logAdminId) {
        this.logAdminId = logAdminId;
    }

    public long getLogUserId() {
        return logUserId;
    }

    public void setLogUserId(long logUserId) {
        this.logUserId = logUserId;
    }

    public String getLogUserName() {
        return logUserName;
    }

    public void setLogUserName(String logUserName) {
        this.logUserName = logUserName == null ? null : logUserName.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }
}