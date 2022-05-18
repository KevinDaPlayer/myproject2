package com.Kevin.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "abc-1234";
        String enterTime = "08:00";
        String exitTime = "11:15";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        Date d2 = null;

       try {
           d2 = sdf.parse(exitTime);
           System.out.println(d2);
           System.out.println(d2.getTime());
           int mins = (int)(d2.getTime()-d.getTime())/1000/60;
           float f = mins%60;
           System.out.println(f);
           int fees1 = 30*(mins/60);
           // 3:14 nt90 3:15 nt 120
           if (f >= 15) {
               fees1 = fees1 + 30;
           }
           int fees2 = 30*(mins/60);
           if (f >= 15 && f <= 30) {
               fees2 = fees2 + 15;
           } else if (f > 30) {
               fees2 = fees2 + 30;
           }
           System.out.println("fees1 :" + fees1 + "\t" + "fees2 :" + fees2);
       } catch (Exception e) {
           System.out.println("Wrong Format");

       }
        long ms = 3*60*60*1000;
       //d2.setTime(d.getTime());

    }
}
