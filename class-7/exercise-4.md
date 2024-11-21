# Fundamentals of Programming for Engineers, Lab 7

## Exercise 4 - Lyric Builder

The following Java code should be used to construct the lyrics to a well-known
Two Door Cinema Club song.

Char arrays are given with the relevent lyrics to each part of the chorus.

You are to combine these lines together into a large char array, called
`lyricsBuffer`.
You must create the code for the `cStringAppend` function, which has been
started for you.
You should add the lines in the order of \( 1, 2, 2, 3, 4, 5, 6, 5, new line, 1, 2, 2, 3, 4, 5, 6, 5 \) to get
the correct result.

The lyrics will then be printed at the end of execution.

> [!TIP]
> When modifying the `cStringAppend` function, it may be helpful to refer
to the comments above the function to understand what each argument is
> supposed to be used for.

## Original Code

```java
public class LyricBuilder {
    /**
     * Prints out a c-style string in Java.
     *
     * Prints out each character within a char array in a loop until a null character is found.
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
        // TODO: Implement function such that string 2 gets added to string 1

        return string1Ptr;
    }

    public static void main(String[] args) {
        System.out.println();
        int lyricsBufferLength = 1000;
        char[] lyricsBuffer = new char[lyricsBufferLength];


        char[] part1 = "And I can tell just what you want\n".toCharArray();
        char[] part2 = "You don't want to be alone\n".toCharArray();
        char[] part3 = "And I can't say it's what you know\n".toCharArray();
        char[] part4 = "But ".toCharArray();
        char[] part5 = "you've known it the whole time\n".toCharArray();
        char[] part6 = "Yeah, ".toCharArray();
        char[] newLine = {'\n'};
        // TODO: Use the cStringAppend function to combine the lyrics to this song using the parts given
        //  The part order is: 1, 2, 2, 3, 4, 5, 6, 5, new line, 1, 2, 2, 3, 4, 5, 6, 5

        cStringPrintln(lyricsBuffer);
    }
}
```

### Expected Output

The following lyrics are expected to be printed:

```
And I can tell just what you want
You don't want to be alone
You don't want to be alone
And I can't say it's what you know
But you've known it the whole time
Yeah, you've known it the whole time

And I can tell just what you want
You don't want to be alone
You don't want to be alone
And I can't say it's what you know
But you've known it the whole time
Yeah, you've known it the whole time
```
