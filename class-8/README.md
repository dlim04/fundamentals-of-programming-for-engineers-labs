# Final Practical
## Circuit Solver

Below is an electric circuit:

<img src=../assets/class-8/mesh-analysis.svg width=600>

A comma-seperated values (CSV) file is provided which contains a number of
different values for $V_1$, $V_2$, $V_3$, $R_1$, $R_2$, $R_3$, and $R_4$.

The table in the CSV file is formatted as follows:
| V_1       | V_2       | V_3       | R_1       | R_2       | R_3       | R_4       |
| --------- | --------- | --------- | --------- | --------- | --------- | --------- |
| 28        | 9         | 22        | 23        | 11        | 40        | 7         |
| 28        | 31        | 30        | 50        | 19        | 6         | 5         |
| ...       | ...       | ...       | ...       | ...       | ...       | ...       |
| 45.14     | 20.37     | 44.5      | 92303     | 87843     | 71013     | 35248     |

Where each row represents a set of values you can solve $I_1$, $I_2$, $I_3$, and $I_4$ for.

### Mesh Analysis
Mesh analysis can be used to solve $I_1$, $I_2$, $I_3$, and $I_4$.

The following equations can be used to represent the circuit:
```math
    \begin{align*}
        -I_1R_1 - I_1R_4 + I_2R_1 + I_4R_4 &= V_1 \\
        I_1R_1 - I_2R_1 - I_2R_2 + I_3R_2 &= -V_2 \\
        I_2R_2 - I_3R_2 - I_3R_3 + I_4R_3 &= 0 \\
        I_1R_4 + I_3R_3 - I_4R_3 - I_4R_4 &= V_3
    \end{align*}
```

These equations can be expressed in the following matrix form:

```math
    \begin{bmatrix}
        -R_1 - R_4 & R_1         & 0          & R_4 \\
        R_1        & - R_1 - R_2 & R_2        & 0 \\
        0          & R_2         & -R_2 - R_3 & R_3 \\
        R_4        & 0           & R_3        & - R_3 - R_4
    \end{bmatrix} 

    \begin{bmatrix}
        I_1 \\
        I_2 \\
        I_3 \\
        I_4
    \end{bmatrix}

    =

    \begin{bmatrix}
        V_1 \\
        -V_2 \\
        0 \\
        V_3
    \end{bmatrix}
```

or:

```math
[R][I] = [V]
```

Where:
- $[R]$ is the mesh resistance
- $[I]$ is the mesh currents
- $[V]$ is the voltage sources

#### Cramer's Rule
As the matrix is a square and non-singular matrix Cramer's Rule can be applied
using the following theorem:

```math
    \frac{I_1}{
        \begin{vmatrix}
            V_1        & R_1         & 0          & R_4 \\
            -V_2       & - R_1 - R_2 & R_2        & 0 \\
            0          & R_2         & -R_2 - R_3 & R_3 \\
            V_3        & 0           & R_3        & - R_3 - R_4
        \end{vmatrix}
    }

    =

    \frac{I_2}{
        \begin{vmatrix}
            -R_1 - R_4 & V_1         & 0          & R_4 \\
            R_1        & -V_2        & R_2        & 0 \\
            0          & 0           & -R_2 - R_3 & R_3 \\
            R_4        & V_3         & R_3        & - R_3 - R_4
        \end{vmatrix}
    }

    =

    \frac{I_3}{
        \begin{vmatrix}
            -R_1 - R_4 & R_1         & V_1        & R_4 \\
            R_1        & - R_1 - R_2 & -V_2       & 0 \\
            0          & R_2         & 0          & R_3 \\
            R_4        & 0           & V_3        & - R_3 - R_4
        \end{vmatrix}
    }

    =

    \frac{I_4}{
        \begin{vmatrix}
            -R_1 - R_4 & R_1         & 0          & V_1 \\
            R_1        & - R_1 - R_2 & R_2        & -V_2 \\
            0          & R_2         & -R_2 - R_3 & 0 \\
            R_4        & 0           & R_3        & V_3 \\
        \end{vmatrix}
    }

    =

    \frac{1}{
        \begin{vmatrix}
            -R_1 - R_4 & R_1         & 0          & R_4 \\
            R_1        & - R_1 - R_2 & R_2        & 0 \\
            0          & R_2         & -R_2 - R_3 & R_3 \\
            R_4        & 0           & R_3        & - R_3 - R_4
        \end{vmatrix}
    }
```

#### Finding the Determinant of a Matrix

We can use the Laplace expansion to calculate the determinant of the matrix, whereby we multiply each factor in the top row by its cofactor and determinant, then sum the result. This means, to calculate the determinant of a 4x4 matrix, we need to calculate the 3x3 minor determinant of each element in the top row, and each of these minors requires their respective 2x2 minors to be calculated. The mathematical formulae are shown below.

##### 2x2 Matrices
The Laplace expansion in the first row is:
```math
    \det(a) = |A| =
    \begin{vmatrix}
        a_{11} & a_{12} \\
        a_{21} & a_{22}
    \end{vmatrix}
    =
    a_{11} a_{22} - a_{12} a_{21}
```

##### 3x3 Matrices
The Laplace expansion in the first row is:
```math
    \det(A) = |A| =
        \begin{vmatrix}
            a_{11} & a_{12} & a_{13} \\
            a_{21} & a_{22} & a_{23} \\
            a_{31} & a_{32} & a_{33}
        \end{vmatrix}
        =
        a_{11}
        \begin{vmatrix}
            a_{22} & a_{23} \\
            a_{32} & a_{33}
        \end{vmatrix}
        - a_{12}
        \begin{vmatrix}
            a_{21} & a_{23} \\
            a_{31} & a_{33}
        \end{vmatrix}
        + a_{13}
        \begin{vmatrix}
            a_{21} & a_{22} \\
            a_{31} & a_{32}
        \end{vmatrix}
```

where you would then calculate the determinant of each of the 2x2 minor matrices for each factor ($a_{11}$, $a_{12}$ and
$a_{13}$).

##### 4x4 Matrices
The Laplace expansion in the first row is:
```math
    \det(A) = |A| =
    \begin{vmatrix}
        a_{11} & a_{12} & a_{13} & a_{14} \\
        a_{21} & a_{22} & a_{23} & a_{24} \\
        a_{31} & a_{32} & a_{33} & a_{34} \\
        a_{41} & a_{42} & a_{43} & a_{44}
    \end{vmatrix}
    =
    a_{11}
    \begin{vmatrix}
        a_{22} & a_{23} & a_{24} \\
        a_{32} & a_{33} & a_{34} \\
        a_{42} & a_{43} & a_{44}
    \end{vmatrix}
    - a_{12}
    \begin{vmatrix}
        a_{21} & a_{23} & a_{24} \\
        a_{31} & a_{33} & a_{34} \\
        a_{41} & a_{43} & a_{44}
    \end{vmatrix}
    + a_{13}
    \begin{vmatrix}
        a_{21} & a_{22} & a_{24} \\
        a_{31} & a_{32} & a_{34} \\
        a_{41} & a_{42} & a_{44}
    \end{vmatrix}
    - a_{14}
    \begin{vmatrix}
        a_{21} & a_{22} & a_{23} \\
        a_{31} & a_{32} & a_{33} \\
        a_{41} & a_{42} & a_{43}
    \end{vmatrix}
```
where you would then calculate the determinant of each of the 3x3 minor matrices for each factor ($a_{11}$, $a_{12}$,
$a_{13}$ and $a_{14}$).

### The Task
Calculate $I_1$, $I_2$, $I_3$ and $I_4$ for each row of values of $V_1$, $V_2$, $V_3$, $R_1$, $R_2$, $R_3$, and $R_4$
in the provided CSV file using mesh analysis. Store each result in another csv file so these values can be checked.

The task can be broken down as follows:
1. Read a row from the CSV file and store it as an array
2. Calculate the contents of the mesh resistance matrix ($[R]$) based on each row and store the result in a 2D array
3. Solve the matrix for $I_1$, $I_2$, $I_3$ and $I_4$ using Cramer's Rule and laplace expansion
4. Print the results in the following form using [`System.out.printf()`](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html):
```
Row: <row number>, I_1: <I_1 value>, I_2; <I_2 value>, I_3: <I_3 value>, I_4: <I_4 value>
```
5. Store each result in a 2D array
6. Read the next row until the end of the file is read
7. Save the results to another CSV file

### [Solutions](solutions/README.md)
