package com.Kevin.finalExamPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingTime {
    public static void main(String[] args) {
        String id = "dc-7414";
        String enterTime = "11:00";
        String exitTime = "14:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        Date d2 = null;
        try{
        d = sdf.parse(enterTime);
        d2 = sdf.parse(exitTime);
        } catch (Exception e) {
            System.out.println("WrongFormat");
        }
        System.out.println(d);
        System.out.println(d2);
        int mins = (int)(d2.getTime()-d.getTime())/1000/60;
        int fees = 30*(mins/60);
        System.out.println(fees);
    }
}
