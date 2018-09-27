package com.example.android.quakereport;

public class EarthQuake {
    private String mCity;
    private String mMagnitude;
    private String mDate;

    public EarthQuake(String city, String magnitude, String date){
        mCity = city;
        mMagnitude = magnitude;
        mDate = date;
    }
    public String getCity(){
        return mCity;
    }
    public String getMagnitude(){
        return mMagnitude;
    }

    public String getDate(){
        return mDate;
    }
}