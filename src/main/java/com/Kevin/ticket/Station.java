package com.Kevin.ticket;

public class Station {
    int id;
    String name;
    public Station (int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static final Station TAIPEI_STATION = new Station(100, "TAIPEI");
    public static final Station TAICHUNG_STATION = new Station(200, "TAICHUNG");
    public static final Station KOAHSIUNG_STATION = new Station(300, "KOAHSIUNG");
}
