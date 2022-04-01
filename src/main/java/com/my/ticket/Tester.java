package com.my.ticket;

import java.util.Scanner;

public  class Tester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION );
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your start station ?(1:taipei,2:taichung,3:kaohsiung)");
        int choice =Integer.parseInt((scanner.next()));
        Station start =null;
        switch (choice){
            case 1:
                start =Station.TAIPEI_STATION;
                break;
            case  2:
                start=Station.TAICHUNG_STATION;
                break;
            case 3:
                start=Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your start station ?(1:taipei,2:taichung,3:kaohsiung)");
        choice=Integer.parseInt((scanner.next()));
        Station destinaton=null;
        switch (choice){
            case 1:
                destinaton =Station.TAIPEI_STATION;
                break;
            case  2:
                destinaton=Station.TAICHUNG_STATION;
                break;
            case 3:
                destinaton=Station.KAOHSIUNG_STATION;
                break;
        }
    }
}

