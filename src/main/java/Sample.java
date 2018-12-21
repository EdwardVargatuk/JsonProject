import com.google.gson.*;

public class Sample {


    private String  gsonParse(String json) {

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        JsonObject coord = jsonObject.get("coord").getAsJsonObject();
        double lon = coord.get("lon").getAsDouble();
        double lat = coord.get("lat").getAsDouble();

        String base = jsonObject.get("base").getAsString();
        String name = jsonObject.get("name").getAsString();
        int visibility = jsonObject.get("visibility").getAsInt();
        int cod = jsonObject.get("cod").getAsInt();
        long dt = jsonObject.get("dt").getAsLong();
        long id = jsonObject.get("id").getAsLong();

        JsonObject main = jsonObject.get("main").getAsJsonObject();
        double temp = main.get("temp").getAsDouble();
        int pressure = main.get("pressure").getAsInt();
        int humidity = main.get("humidity").getAsInt();
        double temp_min = main.get("temp_min").getAsDouble();
        double temp_max = main.get("temp_max").getAsDouble();

        JsonArray weatherAr = jsonObject.get("weather").getAsJsonArray();
        JsonObject weather = (JsonObject) weatherAr.get(0);
        int idW = weather.get("id").getAsInt();
        String mainW = weather.get("main").getAsString();
        String description = weather.get("description").getAsString();
        String icon = weather.get("icon").getAsString();

        JsonObject sys = jsonObject.get("sys").getAsJsonObject();
        short type = sys.get("type").getAsShort();
        int idSys = sys.get("id").getAsInt();
        double message = sys.get("message").getAsDouble();
        String country = sys.get("country").getAsString();
        long sunrise = sys.get("sunrise").getAsLong();
        long sunset = sys.get("sunset").getAsLong();

        JsonObject wind = jsonObject.get("wind").getAsJsonObject();
        double speed = wind.get("speed").getAsDouble();
        short deg = wind.get("deg").getAsShort();

        JsonObject clouds = jsonObject.get("clouds").getAsJsonObject();
        short all = clouds.get("all").getAsShort();

        String result = ("coord:" + lon + ", " + lat +
                "\nweather: [" + idW + ", " + mainW + ", " + description + ", " + icon + "]" +
                "\nbase: " + base +
                "\nmain: " + temp + ", " + pressure + ", " + humidity + ", " + temp_min + ", " + temp_max) +
                "\nvisibility: " + visibility +
                "\nwind: " + speed + ", " + deg +
                "\nclouds: " + all +
                "\ndt: " + dt +
                "\nsys: " + type + ", " + idSys + ", " + message + ", " + country + ", " + sunrise + ", " + sunset +
                "\nid: " + id +
                "\nname: " + name +
                "\ncod: " + cod;

        System.out.println(result);

return result;
//        return gson.fromJson(json, GSonObject.class);
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        String sours = "{\"coord\":{\"lon\":-0.13,\"lat\":51.51},\"weather\":[{\"id\":300,\"main\":\"Drizzle\",\"description\":\"light intensity drizzle\",\"icon\":\"09d\"}],\"base\":\"stations\",\"main\":{\"temp\":280.32,\"pressure\":1012,\"humidity\":81,\"temp_min\":279.15,\"temp_max\":281.15},\"visibility\":10000,\"wind\":{\"speed\":4.1,\"deg\":80},\"clouds\":{\"all\":90},\"dt\":1485789600,\"sys\":{\"type\":1,\"id\":5091,\"message\":0.0103,\"country\":\"GB\",\"sunrise\":1485762037,\"sunset\":1485794875},\"id\":2643743,\"name\":\"London\",\"cod\":200}";

        sample.gsonParse(sours);


    }
}


//        Coordinate coordinate = gson.fromJson(json, Coordinate.class);
//
//    public int someInt = 5;
//    public String someString = "text";
//    Coordinate coord = new Coordinate(-0.15, 0.55);


//        List<Weather> weatherlist = new ArrayList<Weather>() ;
//        weatherlist.add(new Weather(12,"sd", "sds", "s55"));
//        Weather weather= new Weather(weatherlist);
//
//
//        String jsonStr = new Gson().toJson(weatherlist);
//        System.out.println(jsonStr);

//         json = "{\"coord\":{\"lon\":-0.13,\"lat\":51.51}}";
//        Coordinate coord = new Coordinate();


//        Gson gson2= new Gson();
//        GSonObject gSonObject11= new GSonObject(new Coordinate(-0.13, 51.5),"station", new MainParam(55.8, 50, 50, 280, 280), new Clouds(90));
//        json =gson.toJson(coord);
//        System.out.println(json);
//        gson.toJson(coord);