# Fundamentals of Programming for Engineers, Lab 7

## Exercise 2 - Coordinate Converter 

You are given some Java code which contains a list of `(x, y, z)`
coordinates all combined into one array.

The array is such that the first three elements are the `x`, `y`, and `z`
values of the first set of coordinates respectively, the next three
elements are that of the next set of coordinates, and so on.

Your task is to divide this array into a 2D array, where the inner array
contains the `(x, y, z)` tuple and the outer array stores all of the
`(x, y, z)` tuples.

### Code Snippet

```java
public class CoordinateConverter {
    public static void main(String[] args) {
        int[] coordinates = {1, 2, 3, 2, 4, 6, 3, 6, 9, 4, 8, 12, 5, 10, 15, 6, 12, 18, 7, 14, 21};
        int[][] coordinates3D = new int[coordinates.length / 3][3];

        // TODO: Convert these coordinates to a 2D array, with the (x, y, z) tuples stored separately

        // Print the 3D coordinates
        System.out.println("3D Coordinates:");
        for (int i = 0; i < coordinates3D.length; i++) {
            for (int j = 0; j < coordinates3D[i].length; j++) {
                System.out.print(coordinates3D[i][j] + " ");
            }
            System.out.println();  // Print a new line for the next row
        }
    }
}
```

### Expected Output

The following output is expected:

```
3D Coordinates:
1 2 3
2 4 6
3 6 9
4 8 12
5 10 15
6 12 18
7 14 21
```
