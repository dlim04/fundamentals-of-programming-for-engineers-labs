
# Ex 1

## Description

From the code provided, allow the user to enter a score and classify the score into one of the following grades:
- **Grade A** for scores above 80.
- **Grade B** for scores between 60 and 80 (inclusive).
- **Grade C** for scores between 40 and 59 (inclusive).
- **Fail** for scores below 40.

### Steps to Follow:
1. **Input**: 
   - The program prompts the user to enter a score.
2. **Processing**:
   - The score is evaluated using a series of `if-else if` statements to determine the grade.
3. **Output**:
   - Based on the score, the program will print the corresponding grade to the console.

```java
import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a score: ");
        int score = scanner.nextInt();

      
    }
}
```

### Example Input and Output:

- **Input**: `85`
  - **Output**: `Grade A.`
  
- **Input**: `70`
  - **Output**: `Grade B.`
  
- **Input**: `45`
  - **Output**: `Grade C.`
  
- **Input**: `30`
  - **Output**: `Fail.`


# Ex 2 
Consider the logic gate diagram and implement the boolean logic in Java. Find a correct configuration of A B and C to make the output true -  use an if statement to check! The inputs have been done to start off.
(It may help to write down the truth tables for the circuit)



![image](https://github.com/user-attachments/assets/e8fdfb89-8e67-4b9d-bc01-a0d9e0a4dcb0)





```java 
import java.util.Scanner;

public class LogicGate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values for A, B, and C (true/false)
        System.out.print("Enter value for A (true/false): ");
        boolean A = scanner.nextBoolean();
        
        System.out.print("Enter value for B (true/false): ");
        boolean B = scanner.nextBoolean();

        System.out.print("Enter value for C (true/false): ");
        boolean C = scanner.nextBoolean();

        // Logic Gates


        //Final Output

        //if statement to check if final output is true
    }
}
```
## Ex 3

In this task, you will use **bitwise operators** (`&`, `|`) along with **`if-else` statements** to make decisions based on the results of the operations. The goal is to practice using **bitwise operations** and **conditional logic** in Java.

1. **Input**:
   - Accept two integer inputs from the user.

2. **Bitwise Operations**:
   - Perform the **bitwise AND** (`&`) operation on the two integers.
   - Perform the **bitwise OR** (`|`) operation on the two integers.

3. **Conditional Logic**:
   - If the result of the **AND operation** is greater than `10`, print `"AND result is greater than 10"`. Otherwise, print `"AND result is less than or equal to 10"`.
   - If the result of the **OR operation** is a multiple of `4`, print `"OR result is a multiple of 4"`. Otherwise, print `"OR result is not a multiple of 4"`.

```java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        // Bitwise Operations

        //If else block for >10


        //If else block for % 4
    }
}
```


## Ex 4

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





