# Fundamentals of Programming for Engineers, Lab 7

## Exercise 1 - Temperature Converter

The following Java code should be used to convert the temperature readings
from a two week period from Celsius to Fahrenheit.

Once the conversion is complete, the average temperature across the two week
period should be calculated (as an integer) and printed.

### Code Snippet

```java
public class TemperatureConverter {
    public static int celsiusToFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        int[] temperatureReadings = {13, 18, 19, 16, 15, 18, 21, 18, 16, 12, 15, 19, 21, 22};

        // TODO: Convert all temperatures to Fahrenheit

        // TODO: Calculate the average temperature over the two-week period and print the result
    }
}
```

### Expected Output

A string should be displayed with the average temperature information on it.

