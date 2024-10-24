# Fundamentals of Programming for Engineers, Lab 4

## Logic Optimization Problem

### Problem Statement

The following Java code simultes a digital circuit where the output of a digital circuit 
based on four binary inputs \( A, B, C, D \). The current implementation uses 
a series of nested `if` statements that are not optimized. Your task is to 
simplify the logic using Karnaugh maps and rewrite the program using only `if` 
statements.

## Original Code

```java
public class DigitalCircuit {
    public static void main(String[] args) {
        boolean A = true; // Example values
        boolean B = false;
        boolean C = true;
        boolean D = false;

        int output = 0;

        if (A) {
            if (B) {
                if (C) {
                    if (D) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                }
            } else {
                if (C) {
                    if (D) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D) {
                        output = 0;
                    } else {
                        output = 1;
                    }
                }
            }
        } else {
            if (B) {
                if (C) {
                    if (D) {
                        output = 0;
                    } else {
                        output = 1;
                    }
                } else {
                    if (D) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                }
            } else {
                if (C) {
                    if (D) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D) {
                        output = 0;
                    } else {
                        output = 1;
                    }
                }
            }
        }

        System.out.println("Output: " + output);
    }
}
```

## Tasks

1. **Complete the following truth table** for the above code:

| Decimal | A | B | C | D | O |
| ------- | - | - | - | - | - |
|    0    | 0 | 0 | 0 | 0 |   |
|    1    | 0 | 0 | 0 | 1 |   |
|    2    | 0 | 0 | 1 | 0 |   |
|    3    | 0 | 0 | 1 | 1 |   |
|    4    | 0 | 1 | 0 | 0 |   |
|    5    | 0 | 1 | 0 | 1 |   |
|    6    | 0 | 1 | 1 | 0 |   |
|    7    | 0 | 1 | 1 | 1 |   |
|    8    | 1 | 0 | 0 | 0 |   |
|    9    | 1 | 0 | 0 | 1 |   |
|    10   | 1 | 0 | 1 | 0 |   |
|    11   | 1 | 0 | 1 | 1 |   |
|    12   | 1 | 1 | 0 | 0 |   |
|    13   | 1 | 1 | 0 | 1 |   |
|    14   | 1 | 1 | 1 | 0 |   |
|    15   | 1 | 1 | 1 | 1 |   |

2. **Use the truth table to complete the following Karnaugh map**:

| AB\CD | 00 | 01 | 11 | 10 |
| ----- |  - |  - |  - |  - |
|   00  |    |    |    |    |
|   01  |    |    |    |    |
|   11  |    |    |    |    |
|   10  |    |    |    |    |

4. **Simplify the Logic**: Use the Karnaugh map to derive the simplified 
Boolean expression.
5. **Rewrite the Code**: Implement the simplified logic using only if 
statements.

## Expected Output

The optimized code should produce the same output but with fewer and more 
efficient if statements.

