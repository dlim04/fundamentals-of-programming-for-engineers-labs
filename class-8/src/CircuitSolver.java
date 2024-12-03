import java.io.FileNotFoundException;

class CircuitSolver {
    /**
     * Calculate the determinant of a 2x2 matrix.
     * @param a A 2x2 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det2(double[][] a) {
        return 0;
    }

    /**
     * Calculate the determinant of a 3x3 matrix.
     * @param a A 3x3 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det3(double[][] a) {
        return 0;
    }

    /**
     * Calculate the determinant of a 4x4 matrix.
     * @param a A 4x4 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det4(double[][] a) {
        return 0;
    }

    /**
     * Use cramer's rule to solve the nth unknown x variable in the form:
     * 
     * A • x = B
     * 
     * I.e. n = 1 would solve x_1 given matrix A and matrix B
     * 
     * @param a The matrix A
     * @param detA The determinant of matrix A
     * @param b The matrix B
     * @param n The nth unknown x variable to solve for
     * @return x_n
     */
    public static double solve(double[][] a, double detA, double[] b, int n) {
        return 0;
    }

    /**
     * Populate the R matrix with the following form:
     * 
     *      -R_1-R_4 R_1      0        R_4
     * R = [R_1      -R_1-R_2 R_2      0       ]
     *      0        R_2      -R_2-R_3 R_3
     *      R_4      0        R_3      -R_3-R_4
     * 
     * @param rValues A length 4 array of R values R_1, R_2, R_3 and R_4
     * @return the R matrix as an array
     */
    public static double[][] populateR(double[] rValues) {
        return null;
    }

    /**
     * Populate the V matrix with the form:
     * 
     *      V_1
     * V = [-V_2]
     *      0
     *      V_3
     * 
     * @param vValues A length 3 array of V values V_1, V_2 and V_3
     * @return The V matrix as an array
     */
    public static double[] populateV(double[] vValues) {
        return null;
    }

    /**
     * Test the det2() function.
     * @return true when test passes
     */
    public static boolean testDet2() {
        double[][] testMatrix = {{3, 2},
                                 {8, 9}};
        
        double testResult = det2(testMatrix);
        boolean testPassed = testResult == 11.0;

        System.out.printf("det2() of [3 2] returned: %.2f\n           8 9\n", testResult);

        if (testPassed) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        return testPassed;
    }

    /**
     * Test the det3() function.
     * @return true when test passes
     */
    public static boolean testDet3() {
        double[][] testMatrix = {{3, 2, 7},
                                 {8, 9, 2},
                                 {6, 1, 4}};
        
        double testResult = det3(testMatrix);
        boolean testPassed = testResult == -260.0;

        System.out.printf("det2() of  3 2 7  returned: %.2f\n          [8 9 2]\n           6 1 4\n", testResult);

        if (testPassed) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        return testPassed;
    }

    /**
     * Test the det4() function.
     * @return true when test passes
     */
    public static boolean testDet4() {
        double[][] testMatrix = {{3, 2, 7, 4},
                                 {8, 9, 2, 1},
                                 {6, 1, 4, 11},
                                 {3, 5, 2, 8}};

        double testResult = det4(testMatrix);
        boolean testPassed = testResult == -2630.0;

        System.out.printf("det2() of  3 2 7 4   returned: %.2f\n          [8 9 2 1 ]\n           6 1 4 11\n           3 5 2 8\n", testResult);

        if (testPassed) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        return testPassed;
    }

    public static void main(String[] args) {
        // // Determinant function tests
        // testDet2();
        // testDet3();
        // testDet4();
    }
}
