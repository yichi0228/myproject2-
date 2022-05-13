package com.my.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String entertime ="08:00";
        String exittime = "11:05";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date d=null;
        try {
             d = sdf.parse(entertime);
        }catch(Exception e){
           System.out.println("wrong formet");
        }

        System.out.println(d);
        System.out.println(d.getTime());
        //long ms =3*60*60*1000;
        try {
            Date d2 = sdf.parse(exittime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins=(int)((d2.getTime()-d.getTime())/1000/60);
            System.out.println(mins);
            int fee=30*(mins/60);
            System.out.println("Fee:"+fee);

        }catch (Exception e){
            System.out.println("exit wrong format");
        }


    }
}
