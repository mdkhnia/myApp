package com.example.moham.mycv.Models;

public class SessionModel {
    String sessionTitle;
    String sessionStatus;
    String sessionImageUrl;


    public SessionModel(String sessionTitle, String sessionStatus, String sessionImageUrl) {
        this.sessionTitle = sessionTitle;
        this.sessionStatus = sessionStatus;
        this.sessionImageUrl = sessionImageUrl;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }

    public void setSessionTitle(String sessionTitle) {
        this.sessionTitle = sessionTitle;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public String getSessionImageUrl() {
        return sessionImageUrl;
    }

    public void setSessionImageUrl(String sessionImageUrl) {
        this.sessionImageUrl = sessionImageUrl;
    }

}
