import sourse.*;

import java.util.List;

public class GSonObject {


    private Coordinate coord;
    private List<Weather> weather;
    private String base;
    private MainParam main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private long id;
    private String name;
    private int cod;


    public GSonObject(Coordinate coord, List<Weather> weather, String base, MainParam main, int visibility, Wind wind, Clouds clouds,
                      long dt, Sys sys, long id, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }


    @Override
    public String toString() {
        return "GSonObject:\n{" +
                "coord = " + coord +
                "\nweather : \n" + weather +
                "\nbase = " + base +
                ",\nmain = " + main +
                "\nvisibility = " + visibility +
                ",\nwind = " + wind +
                ",\nclouds = " + clouds +
                ",\ndaytime = " + dt +
                ",\nsys = " + sys +
                ",\nid = " + id +
                ",\ncity name  = " + name +
                ",\ncity code = " + cod +
                '}';
    }
}


