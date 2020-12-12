package com.example.brnteklonoji;

public class IletisimModel {

    private int iconId;
    private String bilgi;

    public IletisimModel(int iconId, String bilgi) {
        this.iconId = iconId;
        this.bilgi = bilgi;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }
}
