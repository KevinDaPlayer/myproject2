package com.Kevin.ticket.midtermpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Ticket> list = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
        System.out.println("your start station? 1 2 3");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice) {
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KOAHSHUNG_STATION;
                break;
        }
        System.out.println("your destination ? 123");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KOAHSHUNG_STATION;
                break;
        }
        System.out.println("ticket type? 123");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice) {
            case 1:
                ticket = new Ticket(start, destination);
                list.add(ticket);
                break;
            case 2:
                ticket = new StudentTicket(start, destination);
                list.add(ticket);
                break;
        }
        list.get(0).print();
        ticket.print();
        for (Ticket t : list) {
            t.print();
        }

    }
}



