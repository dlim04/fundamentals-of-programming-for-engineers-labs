# Fundamentals of Programming for Engineers, Lab 7

## Solutions

### Exercise 4
```java
public class LyricBuilder {
    /**
     * Prints out a c-style string in Java.
     * 
     * Prints out each charachter within a char array until a null character is found.
     * @param cString - The c-string to be printed
     */
    public static void cStringPrintln(char[] cString) {
        for (int i = 0; cString[i] != '\u0000'; i++) {
            System.out.print(cString[i]);
        }
        System.out.println();
    }

    /**
     * Appends one c-string to another starting from the index string1_ptr.
     * @param string1 - The original c-string which should be extended with more data
     * @param string1Ptr - The index of string 1 that writing should begin at
     * @param string2 - The string to be added to string 1
     * @param string2Length - The number of characters in string 2
     * @return The next index of string 1 which has not been written to yet
     */
    public static int cStringAppend(char[] string1, int string1Ptr, char[] string2, int string2Length) {
        for (int i = 0; i < string2Length; i++) {
            string1[string1Ptr] = string2[i];
            string1Ptr++;
        }
        return string1Ptr;
    }

    public static void main(String[] args) {
        int lyricsBufferLength = 1000;
        char[] lyricsBuffer = new char[lyricsBufferLength];
        System.out.println();

        char[] part1 = "And I can tell just what you want\n".toCharArray();
        char[] part2 = "You don't want to be alone\n".toCharArray();
        char[] part3 = "And I can't say it's what you know\n".toCharArray();
        char[] part4 = "But ".toCharArray();
        char[] part5 = "you've known it the whole time\n".toCharArray();
        char[] part6 = "Yeah, ".toCharArray();
        char[] newLine = {'\n'};


        // TODO: Use the cStringAppend function to combine the lyrics to this song using the parts given
        //  The part order is: 1, 2, 2, 3, 4, 5, 6, 5, new line, 1, 2, 2, 3, 4, 5, 6, 5
        System.out.println();
        int lyricsBufferPtr = cStringAppend(lyricsBuffer, 0, part1, part1.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part2, part2.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part2, part2.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part3, part3.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part4, part4.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part5, part5.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part6, part6.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part5, part5.length);

        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, newLine, newLine.length);

        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part1, part1.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part2, part2.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part2, part2.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part3, part3.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part4, part4.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part5, part5.length);
        lyricsBufferPtr = cStringAppend(lyricsBuffer, lyricsBufferPtr, part6, part6.length);
        cStringAppend(lyricsBuffer, lyricsBufferPtr, part5, part5.length);

        cStringPrintln(lyricsBuffer);
    }
}
```
