package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 0.001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0),0.001);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40.0),0.001);
        assertEquals(37.78, TemperatureConverter.fahrenheitToCelsius(100.0),0.01);


    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 0.001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0), 0.001);
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40.0), 0.001);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37.0), 0.01);

    }

    @Test
    void testIsExtremeTemperature() {
        //Extreme temperatures
        assertTrue(TemperatureConverter.isExtremeTemperature(-45.0));
        assertTrue(TemperatureConverter.isExtremeTemperature(55.0));

        // Normal temperatures

        assertFalse(TemperatureConverter.isExtremeTemperature(20.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(-10.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(50.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(-40.0));
    }





}
