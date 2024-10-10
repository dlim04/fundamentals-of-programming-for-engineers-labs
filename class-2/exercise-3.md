# Exercise 3

## Task 1 - Integer Overflow and Underflow

1. Analyse the following code:
```java
public class Overflow {
    public static void main(String[] args) throws Exception {
        
        byte var1 = 127;
        value = (byte) (value + 1);
        System.out.println(value);
    }
}
```
2. Using a pen and paper, write down the output you'd expect from this program.
3. Create a new source file by right clicking `src` in the Explorer tab in Visual Studio Code and click `New File...`
4. Name the file `Overflow.java`
5. Copy and paste in the code and run it. Was the outcome what you expected?
6. Write down the value of `var1` using an 8-bit binary number. What happens if you add 1 to it?
7. Fix the code so that it outputs the intended value

## Task 2 - Floating Point Overflow and Underflow

Write a Java program using `float` data type to demonstrate examples of both floating point overflow and underflow.

Print the value of the variable before and after to show the value clipping to Infinity or 0.0.

Then verify that changing the data type to a larger size, i.e. `double`, prevents the overflow/underflow condition.


