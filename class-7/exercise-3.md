# Fundamentals of Programming for Engineers, Lab 7

## Exercise 3 - Classroom Statistics

The following Java contains a 2D char array storing the type of each person
in a class. The available types are as follows:
- 'l' is a lecturer
- 'd' is a demonstrator
- 's' is a student

You are to complete the following two tasks:
1) Create a function which takes in one class at a time to count the numbers
of demonstrators and students assigned to the class. You should do then print
the totals.
2) Create a function to check that exactly one lecturer is assigned to each
class. If more than one lecturer is in a class, print the phrase "Too many 
lecturers in class i!", where i is the class number. If no lecturers are
present, print the string "No lecturers assigned to class i!"

### Code Snippet

```java
public class ClassStatistics {
    // TODO: Create a function to count the demonstrators and students separately

    // TODO: Create a function to check that exactly one lecturer is assigned to any given class

    public static void main(String[] args) {
        char[][] classes = {
            {'l', 's', 's', 's', 's', 'd', 'd', 's', 's', 's'},
            {'s', 's', 's', 'd', 's', 'd', 's', 's', 's', 's'},
            {'s', 's', 's', 'd', 's', 's', 's', 's', 's', 's', 's', 'l'},
            {'s', 'l', 's', 's', 's', 's', 'd', 's', 's', 's', 'l', 's', 'd'}
        };

        // TODO: Count the number of demonstrators, and students in each class

        // TODO: Check which classes are valid and which are not
    }
}
```

### Expected Output

The number of demonstrators and students in each of classes 1-4 should be printed.

Afterwards, any invalid classes should have their appropriate error message displayed.
