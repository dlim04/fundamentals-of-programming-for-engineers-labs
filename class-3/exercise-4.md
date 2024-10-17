# Exercise 4

In this task, you will perform simple **casting** between different data types in Java. The goal is to convert an `int` to a `char` and a `char` to an `int`, while understanding how casting works.

1. **Input**:
   - Accept an integer (`int`) input from the user.
   - Accept a character (`char`) input from the user.

2. **Casting Operations**:
   - Convert the `char` to an `int` 
   - Convert the `int` to a `char` 
   - Explicitly cast both of these

3. **Output**:
   - Print the integer value of the `char` (its **ASCII** value).
   - Print the character value of the `int`.

Use the ASCII table in the slides to check that the outputs are correct



```java
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values - type int and char
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Explicit cast: char to int (getting ASCII value)
       

        // Explicit cast: int to  ASCII char
        
    }
}
```

