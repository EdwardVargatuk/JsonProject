package sourse;

public class Clouds {
    private int all;

    public Clouds(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "clouds:\n{" +
                "cloudiness = " + all +
                '}';
    }
}
