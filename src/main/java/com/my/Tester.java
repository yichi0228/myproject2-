package com.my;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yiur start station ?(1:taipei,2:taichung ,3:kaohsiung)");
    }
}
