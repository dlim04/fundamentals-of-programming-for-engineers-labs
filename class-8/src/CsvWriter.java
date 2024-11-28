import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvWriter {
    private static PrintWriter printWriter;

    /**
     * Initialise a write to a CSV file.
     * @param pathname The location of the CSV file to be read
     * @throws FileNotFoundException
     */
    public static void startWrite(String pathname) throws FileNotFoundException {
        printWriter = new PrintWriter(new File(pathname));
    }


    /**
     * End the CSV file write.
     */
    public static void endWrite() {
        printWriter.close();
    }

    /**
     * Convert an array of strings to a comma seperated string.
     * @param data An array of strings
     * @return A comma seperated string all the elements in data
     */
    private static String convertToCsv(String[] data) {
        return Stream.of(data).collect(Collectors.joining(","));
    }

    /**
     * Write an array of strings to a CSV file.
     * @param row An array of strings to be written.
     */
    public static void writeRow(String[] row) {
        printWriter.println(convertToCsv(row));
    }

    /**
     * Write an array of doubles to a CSV file.
     * @param row An array of doubles to be written.
     */
    public static void writeDoubleRow(double[] row) {
        String[] row_buffer = new String[row.length];

        for (int i = 0; i < row.length; i++) {
            row_buffer[i] = String.format("%.2f", row[i]);
        }
        printWriter.println(convertToCsv(row_buffer));
    }
}