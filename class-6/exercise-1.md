# Exercise 1:
Write a program that uses a while loop controlled by a Boolean to play a higher or lower guessing game.

**You should:**
1. Generate a random number between 1 and 20.
2. Allow the user to guess the number.
3. If the guess is correct, set the Boolean variable to `false` and exit the loop.
4. If the guess is incorrect:
   - Print "Too high" if the guess is higher than the target
   - "Too low" if the guess is lower than the target.
5. Continue the loop until the user guesses the correct number.

```java
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        // Generate a random number between 1 and 20
        int targetNumber = (int) (Math.random() * 20) + 1;
       

        // Boolean variable to control the loop
       

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // System.out.println "Pick a number between 1 and 20"


        // While loop for the guessing game (is the condition true or false initially?)
       
        // Check the user's guess (conditional statement)

        // Exit Loop
        
        scanner.close();
    }
}
```
