# Fundamentals of Programming for Engineers, Lab 4

## Logic Optimization Problem

### Problem Statement

You are given a Java program that determines the output of a digital circuit based on four binary inputs \( A, B, C, D \). The current implementation uses a series of nested `if` statements that are not optimized. Your task is to simplify the logic using Karnaugh maps and rewrite the program using only `if` statements.

## Original Code

```java
public class DigitalCircuit {
    public static void main(String[] args) {
        int A = 1; // Example values
        int B = 0;
        int C = 1;
        int D = 0;

        int output = 0;

        if (A == 1) {
            if (B == 1) {
                if (C == 1) {
                    if (D == 1) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D == 1) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                }
            } else {
                if (C == 1) {
                    if (D == 1) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D == 1) {
                        output = 0;
                    } else {
                        output = 1;
                    }
                }
            }
        } else {
            if (B == 1) {
                if (C == 1) {
                    if (D == 1) {
                        output = 0;
                    } else {
                        output = 1;
                    }
                } else {
                    if (D == 1) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                }
            } else {
                if (C == 1) {
                    if (D == 1) {
                        output = 1;
                    } else {
                        output = 0;
                    }
                } else {
                    if (D == 1) {
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

1. **Construct the Karnaugh Map**: Create a Karnaugh map for the given logic to identify and eliminate redundancies.
2. **Simplify the Logic**: Use the Karnaugh map to derive the simplified Boolean expression.
3. **Rewrite the Code**: Implement the simplified logic using only if statements.

## Hints

- The Karnaugh map will help you visualize and simplify the logic by grouping adjacent ones.
- Look for common patterns and use Boolean algebra to simplify the expression.

## Expected Output

The optimized code should produce the same output but with fewer and more efficient if statements.


Disclaimer: Microsoft Copilot wrote this task upon prompting
