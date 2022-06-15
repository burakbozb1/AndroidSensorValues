package com.sensors.jar;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    private static DataModel dataModel;

    public Main() {
        System.out.println("Kullanim Klavuzu");
        System.out.println("Verilere ulasabilmek icin oncelikle getDataModel() fonksiyonunu calistiriniz.");
        System.out.println("Kullanilabilecek fonksiyonlar:");
        System.out.println("getDataModel('Cihaz id (String)','baslangic tarihi (String YYYY-AA-GG SS:DD)','bitis tarihi (String YYYY-AA-GG SS:DD.0)','sunucu adresi')");
        System.out.println("Bu fonksiyon belli bir cihaz icin belirtilen tarih araligindaki tum sensor verilerini getirir");
        System.out.println("");
        System.out.println("getOneSensor((DataModel dataModel), (String tarih = YYYY-AA-GG SS:DD),(String sensorAdi))");
        System.out.println("Belirtilen tarihteki belirtilen sensorun degerini dondurur. String dondurur.");
        System.out.println("");
        System.out.println("getSensorsWithoutDate((DataModel dataModel), (String sensorAdi))");
        System.out.println("Belirtilen isimdeki sensorun tum tarihlerdeki degerlerini getirir. ArrayList<ArrayList<String>> dondurur.");
        System.out.println("");
        System.out.println("getSensorsWithSpecificDate((DataModel dataModel), (String tarih = YYYY-AA-GG SS:DD))");
        System.out.println("Bir tarih noktasindaki tum sensorleri ve degerlerini dondurur. ArrayList<ArrayList<String>> dondurur.");
        System.out.println("");
    }

   public DataModel getDataModel(String devID, String baslangic, String bitis, String sunucuAdres) throws IOException {
       //Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
       return null;
    }

    public String getOneSensor(DataModel dtModel, String tarih, String sensorAdi) {
        //Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
        return null;
    }

    public ArrayList<ArrayList<String>> getSensorsWithoutDate(DataModel dtModel, String sensorAdi) {
        //Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
        return null;
    }

    public ArrayList<ArrayList<String>> getSensorsWithSpecificDate(DataModel dtModel, String tarih) {
        //Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
        return null;
    }
}
