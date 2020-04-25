package com.study.springboot.basesecret;

public class ApiSecret {
        private String[] noEncrytion;
        private String[] noDecryption;


    public String[] getNoEncrytion() {
        return new String[]{"/customer/getAll"};
    }

    public void setNoEncrytion(String[] noEncrytion) {
        this.noEncrytion = noEncrytion;
    }

    public String[] getNoDecryption() {
        return noDecryption;
    }

    public void setNoDecryption(String[] noDecryption) {
        this.noDecryption = noDecryption;
    }
}
