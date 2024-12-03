import java.io.FileNotFoundException;

class CircuitSolverExtension {
    /**
     * Calculate the determinant of an n x n matrix.
     * @param a A matrix in a 2D array
     * @param n The width and height of the matrix
     * @return The determinant of the matrix
     */
    public static double det(double[][] a, int n) {
        // Base case where you have a 2x2 matrix
        if (n == 2) {
            return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        }

        double[] minorDets = new double[n];
        double[][] matrixBuffer = new double[n - 1][n - 1];

        // For each of the first row form the minor matrix
        for (int i = 0; i < n; i++) {

            // For each row (starting from the second row)
            for (int j = 1; j < n; j++) {
                int rowCounter = 0;

                // For each element in the row add it to the minor matirx
                // (excluding where the element is in the same column as the
                // first row factor)
                for (int k = 0; k < n; k++) {
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
            minorDets[i] = det(matrixBuffer, n - 1);
        }

        double determinant = 0.0;

        // Add together the factors multiplied by the minor determinants based on the
        // relevant cofactor for that minor determinant
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                determinant += a[0][i] * minorDets[i];
            } else {
                determinant -= a[0][i] * minorDets[i];
            }
        }
        return determinant;
    }

    /**
     * Use cramer's rule to solve the nth unknown x variable of a 1x4 matrix in the form:
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
        double[][] augmentedMatrix = new double[4][4];

        // Create the augmented matrix
        // For each row
        for (int i = 0; i < augmentedMatrix.length; i++) {
            // For each element copy it to the augmented matrix excluding the
            // column we're solving for
            for (int j = 0; j < augmentedMatrix.length; j++) {
                if (j == n) {
                    // In the column we're solving for replace the column with
                    // the B matrix
                    augmentedMatrix[i][j] = b[i]; 
                } else {
                    augmentedMatrix[i][j] = a[i][j];
                }
            }
        }

        return det(augmentedMatrix, 4) / detA;
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
     * Test the det() function.
     * @return true when test passes
     */
    public static boolean testDet() {
        boolean testPassed = true;
        double[][] testMatrix1 = {{3, 2},
                                  {8, 9}};
        
        double testResult1 = det(testMatrix1, 2);

        if (testPassed) {
            testPassed = testResult1 == 11.0;
        }

        System.out.printf("det() of [3 2] returned: %.2f\n          8 9\n", testResult1);

        double[][] testMatrix2 = {{3, 2, 7},
                                  {8, 9, 2},
                                  {6, 1, 4}};
        
        double testResult2 = det(testMatrix2, 3);
        
        if (testPassed) {
            testPassed = testResult2 == -260.0;
        }

        System.out.printf("det() of  3 2 7  returned: %.2f\n         [8 9 2]\n          6 1 4\n", testResult2);

        double[][] testMatrix3 = {{3, 2, 7, 4},
                                  {8, 9, 2, 1},
                                  {6, 1, 4, 11},
                                  {3, 5, 2, 8}};

        double testResult3 = det(testMatrix3, 4);
        
        if (testPassed) {
            testPassed = testResult3 == -2630.0;
        }

        System.out.printf("det() of  3 2 7 4   returned: %.2f\n         [8 9 2 1 ]\n          6 1 4 11\n          3 5 2 8\n", testResult3);

        if (testPassed) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        return testPassed;
    }

    public static void main(String[] args) {
        // // Determinant function tests
        // testDet();

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

            double detR = det(rMatrix, 4);

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
