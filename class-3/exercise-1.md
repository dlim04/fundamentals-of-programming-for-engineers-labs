# Exercise 1

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

