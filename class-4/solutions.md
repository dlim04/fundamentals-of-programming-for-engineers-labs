# Fundamentals of Programming for Engineers, Lab 4

## Solutions

### Exercise 1

```java
public class UkTaxCalculator {
    public static void main(String[] args) {
        // Test different values of the salary
        double salary = 100000;

        double tax1 = 0, tax2 = 0, tax3 = 0;
        double total_tax = 0;

        if (salary <= 12570) {
            total_tax = 0;
        } else if (salary <= 50270) {
            tax1 = (salary - 12570) * 0.2;
            total_tax = tax1;
        } else if (salary <= 125140) {
            tax1 = (50270 - 12500) * 0.2;
            tax2 = (salary - 50270) * 0.4;
            total_tax = tax1 + tax2;
        } else {
            tax1 = (50270 - 12500) * 0.2;
            tax2 = (125140 - 50270) * 0.4;
            tax3 = (salary - 125140) * 0.45;
            total_tax = tax1 + tax2 + tax3;
        }

        System.out.println("Tax is £" + total_tax);
    }
}
```

### Exercise 2a

```java
import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args) {
        // Create an input scanner
        Scanner in = new Scanner(System.in);

        System.out.println("What is the cost of the meal?");
        float cost = in.nextFloat();

        System.out.println("Is the customer a member?");
        boolean member = in.nextBoolean();

        float discountedPrice;

        if (member) {
            if (cost < 100) {
                discountedPrice = cost * 0.95f;
            } else {
                discountedPrice = cost * 0.9f;
            }
        } else {
            discountedPrice = cost;
        }

        System.out.println("The discounted price is £" + discountedPrice);
    }
}
```

### Exercise 2b

```java
import java.util.Scanner;

public class MealPlanner {
    public static void main(String[] args) {
        // Create an input scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Do you have any dietary requirements?");
        System.out.println("v = Vegetarian, g = Vegan");
        char dietary_preference = in.next().charAt(0);

        System.out.println("Which meal would you like a suggestion for?");
        System.out.println("b = Breakfast, l = Lunch, d = Dinner");
        char meal = in.next().charAt(0);

        if (dietary_preference == 'v') {
            if (meal == 'b') {
                System.out.println("Have some porridge.");
            } else if (meal == 'l') {
                System.out.println("Have a salad.");
            } else if (meal == 'd') {
                System.out.println("Have a vegetable stir fry.");
            }
        } else if (dietary_preference == 'g') {
            if (meal == 'b') {
                System.out.println("Have a fruit salad.");
            } else if (meal == 'l') {
                System.out.println("Have a quinoa bowl.");
            } else if (meal == 'd') {
                System.out.println("Have a lentil curry.");
            }
        } else {
            System.out.println("Unsupported dietary preference! Please specify a valid dietary preference.");
        }
    }
}
```

### Exercise 3

The completed truth table is:
| Decimal | A | B | C | D | O |
| ------- | - | - | - | - | - |
|    0    | 0 | 0 | 0 | 0 | 1 |
|    1    | 0 | 0 | 0 | 1 | 0 |
|    2    | 0 | 0 | 1 | 0 | 0 |
|    3    | 0 | 0 | 1 | 1 | 1 |
|    4    | 0 | 1 | 0 | 0 | 0 |
|    5    | 0 | 1 | 0 | 1 | 1 |
|    6    | 0 | 1 | 1 | 0 | 1 |
|    7    | 0 | 1 | 1 | 1 | 0 |
|    8    | 1 | 0 | 0 | 0 | 1 |
|    9    | 1 | 0 | 0 | 1 | 0 |
|    10   | 1 | 0 | 1 | 0 | 0 |
|    11   | 1 | 0 | 1 | 1 | 1 |
|    12   | 1 | 1 | 0 | 0 | 0 |
|    13   | 1 | 1 | 0 | 1 | 1 |
|    14   | 1 | 1 | 1 | 0 | 0 |
|    15   | 1 | 1 | 1 | 1 | 1 |

The compled Karnaugh map is:
| AB\CD | 00 | 01 | 11 | 10 |
| ----- |  - |  - |  - |  - |
|   00  |  1 |  0 |  1 |  0 |
|   01  |  0 |  1 |  0 |  1 |
|   11  |  0 |  1 |  1 |  0 |
|   10  |  1 |  0 |  1 |  0 |

The K-map yields groupings such that the output `O = B'C'D' + B'CD + BC'D + ACD + A'BCD'`
(The equation `O = B'C'D' + B'CD + BC'D + ABD + A'BCD` is also valid)

The Java code to implement this is:
```java
public class DigitalCircuit {
    public static void main(String[] args) {
        boolean A = true; // Example values
        boolean B = false;
        boolean C = true;
        boolean D = false;

        int output = 0;

        if (!B && !C && !D || !B && C && D || B && !C && D || A && C && D || !A && B && C && !D) {
            output = 1;
        }

        System.out.println("Output: " + output);
    }
}
```
