package sourse;

public class MainParam {
    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;


    public MainParam(double temp, int pressure, int humidity, double temp_min, double temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    @Override
    public String toString() {
        return "main: \n{" +
                "temperature = " + temp +
                ", pressure = " + pressure +
                ", humidity = " + humidity +
                ", temp_min = " + temp_min +
                ", temp_max = " + temp_max +
                '}';
    }
}
