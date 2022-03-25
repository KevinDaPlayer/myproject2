package com.Kevin.ticket;

public class Ticket {
    public static int TAIPEI_STATION = 100;
    public static int TAICHUNG_STATION = 200;
    public static int KAOHSIUNG_STATION = 300;
    int price;
    Station start;
    Station destination;
    public Ticket (Station start, Station destination ) {
        this.start = start;
        this.destination = destination;
    }
}
