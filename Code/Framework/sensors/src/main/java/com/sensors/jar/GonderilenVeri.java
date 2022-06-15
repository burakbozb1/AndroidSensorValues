package com.sensors.jar;
public class GonderilenVeri {

    private String deviceID;
    private String tarihBaslangic;
    private String tarihBitis;

    public GonderilenVeri(String deviceID, String tarihBaslangic, String tarihBitis) {
        this.deviceID = deviceID;
        this.tarihBaslangic = tarihBaslangic;
        this.tarihBitis = tarihBitis;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getTarihBaslangic() {
        return tarihBaslangic;
    }

    public void setTarihBaslangic(String tarihBaslangic) {
        this.tarihBaslangic = tarihBaslangic;
    }

    public String getTarihBitis() {
        return tarihBitis;
    }

    public void setTarihBitis(String tarihBitis) {
        this.tarihBitis = tarihBitis;
    }
}

