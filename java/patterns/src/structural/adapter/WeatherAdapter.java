package structural.adapter;

import javax.naming.NameNotFoundException;

public class WeatherAdapter {

    public int findTemperature(int zipcode) throws NameNotFoundException {
        String city = switch (zipcode) {
            case 96300 -> "Zyrardow";
            case 00001 -> "Warszawa";
            default -> throw new NameNotFoundException("Unknown Zipcode");
        };

        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);
    }

}
