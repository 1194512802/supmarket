package com.qianfeng.entity;

public class CustEntity {

    private int cid;
    private String cname;
    private String caccount;
    private String cpass;
    private String cemail;
    private String cphone;
    private int csex;
    private String cimage;
    private int cstatus;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaccount() {
        return caccount;
    }

    public void setCaccount(String caccount) {
        this.caccount = caccount;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public int getCsex() {
        return csex;
    }

    public void setCsex(int csex) {
        this.csex = csex;
    }

    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }

    public int getCstatus() {
        return cstatus;
    }

    public void setCstatus(int cstatus) {
        this.cstatus = cstatus;
    }

    @Override
    public String toString() {
        return "CustEntity{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", caccount='" + caccount + '\'' +
                ", cpass='" + cpass + '\'' +
                ", cemail='" + cemail + '\'' +
                ", cphone='" + cphone + '\'' +
                ", csex=" + csex +
                ", cimage='" + cimage + '\'' +
                ", cstatus=" + cstatus +
                '}';
    }
}
