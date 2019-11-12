package com.stx.test.demo.pojo;

import java.util.Date;

public class Contract {
    private  String cId;
    private  String cUser;
    private Date cDate;

    @Override
    public String toString() {
        return "Contract{" +
                "cId='" + cId + '\'' +
                ", cUser='" + cUser + '\'' +
                ", cDate=" + cDate +
                '}';
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcUser() {
        return cUser;
    }

    public void setcUser(String cUser) {
        this.cUser = cUser;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }
}
