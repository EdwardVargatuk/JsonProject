package sourse;

public class Wind {
    private double speed;
    private int deg;

    public Wind(double speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "wind:\n{" +
                "speed = " + speed +
                ", direction = " + deg +
                '}';
    }
}
