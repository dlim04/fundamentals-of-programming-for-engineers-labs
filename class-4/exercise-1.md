# Fundamentals of Programming for Engineers, Lab 4

## Exercise 1

A UK tax calculator is to be created using the following tax bands:

| Band               | Taxable income           | Tax rate |
|--------------------|--------------------------|----------|
| Personal Allowance  | Up to £12,570            | 0%       |
| Basic rate          | £12,571 to £50,270       | 20%      |
| Higher rate         | £50,271 to £125,140      | 40%      |
| Additional rate     | Over £125,140            | 45%      |

Some Java code was created to implement this, which calculates the total tax
owed and prints the total. The code is as follows:

```java
public class UkTaxCalculator {
    public static void main(String[] args) {
        // Test different values of the salary
        double salary = 100000;

        double tax1 = 0, tax2 = 0, tax3 = 0;

        if (salary <= 12570) {
            double total_tax = 0;
        } else if (salary <= 50270) {
            double tax1 = (salary - 12570) * 0.2;
        } else if (salary <= 125140) {
            tax1 = (50270 - 12500) * 0.2;
            tax2 = (salary - 50270) * 0.4;
            double total_tax = tax1 + tax2;
        } else {
            tax1 = (50270 - 12500) * 0.2;
            tax2 = (125140 - 50270) * 0.4;
            tax3 = (salary - 125140) * 0.45;
            double total_tax = tax1 + tax2 + tax3;
        }

        System.out.println("Tax is £" + total_tax);
    }
}
```

### Your Task
When trying to run this code in VS Code, it does not compile and
throws multiple errors. Your task is to copy this task into your IDE and fix
the compilation errors.

NB: The salary calculations are correct, it is only compilation errors that
need fixed.
