package com.Kevin.ticket;

public class Ticket {
    public static int TAIPEI_STATION = 100;
    public static int TAICHUNG_STATION = 200;
    public static int KAOHSIUNG_STATION = 300;
    int price;
    Station start;
    Station destination;
    public Ticket (Station start, Station destination  ) {
        this.start = start;
        this.destination = destination;
        if (start == Station.TAIPEI_STATION) {
            if (destination == Station.KOAHSIUNG_STATION) {
                price = 1500;
            } else {
                price = 600;
            }
        } else if (start == Station.TAICHUNG_STATION) {
            if (destination == Station.KOAHSIUNG_STATION) {
                price = 900;
            } else {
                price = 600;
            }
        } else if (start == Station.KOAHSIUNG_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 900;
            } else {
                price = 600;
            }
        }
    }

    public void print () {
        System.out.println(start.name + "\t" + destination.name + "\t" + "price:" + price);
    }
}

