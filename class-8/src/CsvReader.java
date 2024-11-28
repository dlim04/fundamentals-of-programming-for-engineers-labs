import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {
    private static Scanner scanner;
    
    /**
     * Initialise a read from a CSV file.
     * @param pathname The location of the CSV file to be read
     * @throws FileNotFoundException File was not found at pathname
     */
    public static void startRead(String pathname) throws FileNotFoundException {
        scanner = new Scanner(new File(pathname));
    }

    /**
     * End the CSV file read.
     */
    public static void endRead() {
        scanner.close();
    }

    /**
     * Count the elements in a comma seperated string.
     * @param s A comma seperated string.
     * @return The number of elements in the comma seperated string
     */
    private static int countElements(String s) {
        int commaCount = 0;
        for (char c : s.toCharArray()) {
            if (c == ',') {
                commaCount++;
            }
        }

        return ++commaCount;
    }

    /**
     * Read the next row of strings in the CSV file.
     * @return An array containing the next row where each element is a column of the row in string format.
     */
    public static String[] nextRow() {
        if (!scanner.hasNextLine()) {
            return null;
        }

        String row = scanner.nextLine();
        String[] values = new String[countElements(row)];

        Scanner rowScanner = new Scanner(row);
        rowScanner.useDelimiter(",");
        for (int i = 0; i < values.length; i++) {
            values[i] = rowScanner.next();
        }

        rowScanner.close();
        return values;
    }

    /**
     * Read the next row of doubles in the CSV file.
     * @return An array containing the next row where each element is a column of the row in double format.
     */
    public static double[] nextDoubleRow() {
        if (!scanner.hasNextLine()) {
            return null;
        }

        String row = scanner.nextLine();
        double[] values = new double[countElements(row)];

        Scanner rowScanner = new Scanner(row);
        rowScanner.useDelimiter(",");
        for (int i = 0; i < values.length; i++) {
            values[i] = rowScanner.nextDouble();
        }

        rowScanner.close();
        return values;
    }
}
