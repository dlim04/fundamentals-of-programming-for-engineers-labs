# Exercise 2 - Caclulations

## Task 1 - Temperature Conversion

1. Create a new source file by right clicking `src` in the Explorer tab in Visual Studio Code and click `New File...`
2. Name the file `TemperatureConverter.java`
3. Copy and paste in the following code:
```java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double c;
        double f;

        System.out.println("Enter temperature in Celsius:");
        c = in.nextDouble();
        
        // Convert cesius to farenheit and store that value in f
        // Print out the value of f


        in.close();
    }
}
```
4. Complete the code so that the program takes in an value of temperature in celsius by the terminal and outputs the value in Farenheit.

> [!TIP]
> $`F = C \times \frac{9}{5} + 32`$

5. Do this again but Farenheit to Kelvin.

## Task 2 - Physics Calculator

1. Create a new source file by right clicking `src` in the Explorer tab in Visual Studio Code and click `New File...`
2. Name the file `PhysicsCalculator.java`
3. Using the code written in Task 1 modify it to solve the following equations given a users input:

$`KE = \frac{1}{2} m v^2`$

$`s = ut + \frac{1}{2} at^2`$

$`U_{out} = \frac{U_{in} \cdot R_2}{R_1 + R_2}`$
