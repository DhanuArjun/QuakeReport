package com.example.android.quakereport;

public class EarthQuake {
    private String mCity;
    private String mMagnitude;
    private long mDateInMilliseconds;

    public EarthQuake(String city, String magnitude, long dateInMilliseconds){
        mCity = city;
        mMagnitude = magnitude;
        mDateInMilliseconds = dateInMilliseconds;
    }
    public String getCity(){
        return mCity;
    }
    public String getMagnitude(){
        return mMagnitude;
    }

    public long getDate(){
        return mDateInMilliseconds;
    }
}