package org.ytu.sensorvalues.sensorv4;

import java.util.ArrayList;
import java.util.HashMap;

public class SensorDataModel {
    private ArrayList<HashMap<String,String >> sensors;
    private String tarih;

    public SensorDataModel(ArrayList<HashMap<String, String>> sensors, String tarih) {
        this.sensors = sensors;
        this.tarih = tarih;
    }

    public SensorDataModel() {
        this.tarih="";
        this.sensors = new ArrayList<>();
    }

    public ArrayList<HashMap<String, String>> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<HashMap<String, String>> sensors) {
        this.sensors = sensors;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}