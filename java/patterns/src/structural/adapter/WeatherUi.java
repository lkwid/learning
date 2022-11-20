package structural.adapter;

import javax.naming.NameNotFoundException;

public class WeatherUi {

    public void showTemperature(int zipcode) throws NameNotFoundException {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(zipcode));
    }

    public static void main(String[] args) throws NameNotFoundException {
        WeatherUi ui = new WeatherUi();
        ui.showTemperature(96300);
    }

}
