package com.example.brnteklonoji;

public class IcerikModel {

    private int icerikResimId;
    private String icerikAciklama;
    private String baslik;

    public IcerikModel(int icerikResimId, String icerikAciklama, String baslik) {
        this.icerikResimId = icerikResimId;
        this.icerikAciklama = icerikAciklama;
        this.baslik = baslik;
    }

    public int getIcerikResimId() {
        return icerikResimId;
    }

    public void setIcerikResimId(int icerikResimId) {
        this.icerikResimId = icerikResimId;
    }

    public String getIcerikAciklama() {
        return icerikAciklama;
    }

    public void setIcerikAciklama(String icerikAciklama) {
        this.icerikAciklama = icerikAciklama;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
}
