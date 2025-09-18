package org.example;

public class TemperatureConverter {
    public  double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    public  double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public  boolean isExtremeTemperature(double celsius) {
        return celsius < -40.0 || celsius > 50.0;
    }
    public  double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }


}

