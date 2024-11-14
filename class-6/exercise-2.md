# Exercise 2:
Create a program that prints a pattern using nested `for` loops.
1. The program should ask the user for the number of rows to display.
2. Use nested `for` loops:
   - The **outer loop** controls the number of rows.
   - The **inner loop** controls the numbers printed in each row.
3. Print the numbers sequentially for each row.

If user inputs 5 rows, the pattern should look like this:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Hint: `System.out.print()` prints same line. `System.out.println()` prints on next row (Use after inner loop) 

```java
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop controls the rows
        
            // Inner loop controls the numbers printed in each row
            
                // Print numbers in the current row
            
             // Move to the next row
        }

        scanner.close();
    }
}

