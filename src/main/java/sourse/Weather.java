package sourse;

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;


    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", main = \"" + main + "\"" +
                ", description = \"" + description + "\"" +
                ", icon = \"" + icon + "\"" +
                '}';
    }
}
