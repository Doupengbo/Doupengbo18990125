package com.example.zuoye2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static String getNowDateTime(){
        SimpleDateFormat s_format = new SimpleDateFormat();
        return s_format.format(new DateTime());
    }

    public static String getNowTime(){
        SimpleDateFormat s_format = new SimpleDateFormat();
        return s_format.format(new DateTime());
    }
}