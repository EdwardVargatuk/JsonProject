package sourse;

public class Coordinate {



    private double lon;
    private double lat;


    public Coordinate(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Coordinate() {
    }

    @Override
    public String toString() {
        return "coordinate:\n{" +
                "longitude = " + lon +
                ", latitude = " + lat +
                '}';
    }
}

