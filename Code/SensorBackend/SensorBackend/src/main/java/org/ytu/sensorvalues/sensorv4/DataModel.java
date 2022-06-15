package org.ytu.sensorvalues.sensorv4;

import java.util.ArrayList;

public class DataModel {

    private String deviceID;
    private ArrayList<SensorDataModel> sensorModel;

    public DataModel(String deviceID, ArrayList<SensorDataModel> sensorModel) {
        this.deviceID = deviceID;
        this.sensorModel = sensorModel;
    }

    public DataModel() {
        this.deviceID="";
        this.sensorModel=new ArrayList<>();
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public ArrayList<SensorDataModel> getSensorModel() {
        return sensorModel;
    }

    public void setSensorModel(ArrayList<SensorDataModel> sensorModel) {
        this.sensorModel = sensorModel;
    }
}
