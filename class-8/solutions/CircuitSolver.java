import java.io.FileNotFoundException;

class CircuitSolver {
    /**
     * Calculate the determinant of a 2x2 matrix.
     * @param a A 2x2 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det2(double[][] a) {
        return a[0][0] * a[1][1] - a[0][1] * a[1][0];
    }

    /**
     * Calculate the determinant of a 3x3 matrix.
     * @param a A 3x3 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det3(double[][] a) {
        double[] minorDets = new double[3];
        double[][] matrixBuffer = new double[2][2];

        // For each of the first row form the minor matrix
        for (int i = 0; i < 3; i++) {

            // For each row (starting from the second row)
            for (int j = 1; j < 3; j++) {
                int rowCounter = 0;

                // For each element in the row add it to the minor matirx
                // (excluding where the element is in the same column as the
                // first row factor)
                for (int k = 0; k < 3; k++) {
                    if (k == i){
                        // Exclude the element as it's in the same column as
                        // first row factor
                        continue;
                    }
                    matrixBuffer[j - 1][rowCounter] = a[j][k];
                    rowCounter++;
                }
            }
            // Calculate the determinant of the minor matrix and store in minorDets
            minorDets[i] = det2(matrixBuffer);
        }
        return a[0][0] * minorDets[0] - a[0][1] * minorDets[1] + a[0][2] * minorDets[2];
    }

    /**
     * Calculate the determinant of a 4x4 matrix.
     * @param a A 4x4 matrix in a 2D array
     * @return The determinant of the matrix
     */
    public static double det4(double[][] a) {
        double[] minorDets = new double[4];
        double[][] matrixBuffer = new double[3][3];

        // For each of the first row form the minor matrix
        for (int i = 0; i < 4; i++) {

            // For each row (starting from the second row)
            for (int j = 1; j < 4; j++) {
                int rowCounter = 0;

                // For each element in the row add it to the minor matirx
                // (excluding where the element is in the same column as the
                // first row factor)
                for (int k = 0; k < 4; k++) {
                    if (k == i){
                        // Exclude the element as it's in the same column as
                        // first row factor
                        continue;
                    }
                    matrixBuffer[j - 1][rowCounter] = a[j][k];
                    rowCounter++;
                }
            }
            // Calculate the determinant of the minor matrix and store in minorDets
            minorDets[i] = det3(matrixBuffer);
        }
        return a[0][0] * minorDets[0] - a[0][1] * minorDets[1] + a[0][2] * minorDets[2] - a[0][3] * minorDets[3];
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
        double[][] matrix = new double[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == n) {
                    matrix[i][j] = b[i]; 
                } else {
                    matrix[i][j] = a[i][j];
                }
            }
        }

        return det4(matrix) / detA;
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
        double[][] R = {{-rValues[0] - rValues[3], rValues[0], 0, rValues[3]},
                        {rValues[0], -rValues[0] - rValues[1], rValues[1], 0},
                        {0, rValues[1], -rValues[1] - rValues[2], rValues[2]},
                        {rValues[3], 0, rValues[2], -rValues[2] - rValues[3]}};
        return R;
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
        double[] output = {vValues[0], -vValues[1], 0, vValues[2]};

        return output;
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

        System.out.printf("det3() of  3 2 7  returned: %.2f\n          [8 9 2]\n           6 1 4\n", testResult);

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

        System.out.printf("det4() of  3 2 7 4   returned: %.2f\n          [8 9 2 1 ]\n           6 1 4 11\n           3 5 2 8\n", testResult);

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

        double[][] solutions = new double[100][4];

        try {
            CsvReader.startRead("class-8/circuit-values.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Discard the header row
        CsvReader.nextRow();
        
        for (int i = 0; i < 100; i++) {
            // Load in the row from the CSV
            double[] values = CsvReader.nextDoubleRow();

            // Store the V values in an array
            double[] vValues = new double[3];
            for (int j = 0; j < vValues.length; j++) {
                vValues[j] = values[j];
            }

            double[] vMatrix = populateV(values);

            // Store the R values in an array
            double[] rValues = new double[4];
            for (int j = vValues.length; j < values.length; j++) {
                rValues[j - vValues.length] = values[j];
            }

            double[][] rMatrix = populateR(rValues);

            double detR = det4(rMatrix);

            // Solve for all unknowns (i.e. I_1, I_2, I_3 and I_4)
            for (int j = 0; j < 4; j++) {
                solutions[i][j] = solve(rMatrix, detR, vMatrix, j);
            }

            System.out.printf("Row: %03d,\t\tI_1: %.2f,\tI_2: %.2f,\tI_3: %.2f,\tI_4: %.2f\n",
                              i + 1, solutions[i][0], solutions[i][1], solutions[i][2], solutions[i][3]);
        }

        CsvReader.endRead();

        try {
            CsvWriter.startWrite("cicuit-solutions.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] headers = {"I_1", "I_2", "I_3", "I_4"};
        CsvWriter.writeRow(headers);

        for (double[] ds : solutions) {
            CsvWriter.writeDoubleRow(ds);
        }

        CsvWriter.endWrite();
    }
}
