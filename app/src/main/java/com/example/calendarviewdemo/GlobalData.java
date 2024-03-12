package com.example.calendarviewdemo;

public class GlobalData {

    static GlobalData instance;
    private GlobalData (){}

    public static GlobalData getInstance() {
        if(instance == null) {
            instance = new GlobalData();
        }
        return instance;
    }

    //Data
    String day;
    String month;

}
