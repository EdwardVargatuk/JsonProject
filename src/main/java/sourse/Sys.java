package sourse;

public class Sys {
    private int type;
    private long id;
    private double message;
    private String country;
    private long sunrise;
    private long sunset;

    public Sys(int type, long id, double message, String country, long sunrise, long sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "sys: \n{" +
                "type = " + type +
                ", id = " + id +
                ", message = " + message +
                ", country = \"" + country + "\"" +
                ", sunrise = " + sunrise +
                ", sunset = " + sunset +
                '}';
    }
}
