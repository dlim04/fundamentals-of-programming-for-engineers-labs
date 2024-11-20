# Fundamentals of Programming for Engineers, Lab 7

## Exercise 4 - Lyric Builder

The following Java code should be used to construct the lyrics to a well-known
Christian song.

Char arrays are given with the relevent lyrics to each line of the song.

You are to combine these lines together into a large char array, called
`lyrics_buffer`.
You must create the code for the `stringBuilder` function, which has been
started for you.
You should add the lines in the order of \( 1, 2, 1, 2, 3, 4, 5, 2 \) to get
the correct result.

The lyrics will then be printed at the end of execution.

Tip: When modifying the `stringBuilder` function, it may be helpful to refer
to the comments above the function to understand what each argument is
supposed to be used for.

## Original Code

```java
public class LyricBuilder {
    /**
     * Add string 2 to string 1.
     * @param string1 - The original string which should be extended with more data
     * @param string1_ptr - The index of string 1 that writing should begin at
     * @param string2 - The string to be added to string 1
     * @param string2_length - The number of characters in string 2
     * @return The next index of string 1 which has not been written to yet
     */
    public static int stringBuilder(char[] string1, int string1_ptr, char[] string2, int string2_length) {
        // TODO: Implement function such that string 2 gets added to string 1

        return string1_ptr;
    }

    public static void main(String[] args) {
        System.out.println();
        int lyrics_buffer_length = 1000;
        char[] lyrics_buffer = new char[lyrics_buffer_length];

        char[] line1 = {'H', 'o', 's', 'a', 'n', 'n', 'a', ',', ' ', 'H', 'o', 's', 'a', 'n', 'n', 'a', ','};
        char[] line2 = {'H', 'o', 's', 'a', 'n', 'n', 'a', ' ', 'i', 'n', ' ', 't', 'h', 'e', ' ', 'h', 'i', 'g', 'h', 'e', 's', 't', '!'};
        char[] line3 = {'L', 'o', 'r', 'd', ',', ' ', 'w', 'e', ' ', 'l', 'i', 'f', 't', ' ', 'u', 'p', ' ', 'Y', 'o', 'u', 'r', ' ', 'n', 'a', 'm', 'e', ','};
        char[] line4 = {'W', 'i', 't', 'h', ' ', 'h', 'e', 'a', 'r', 't', 's', ' ', 'f', 'u', 'l', 'l', ' ', 'o', 'f', ' ', 'p', 'r', 'a', 'i', 's', 'e', ','};
        char[] line5 = {'B', 'e', ' ', 'e', 'x', 'a', 'l', 't', 'e', 'd', ',', ' ', 'O', ' ', 'L', 'o', 'r', 'd', ' ', 'm', 'y', ' ', 'G', 'o', 'd', ','};

        // TODO: Use the stringBuilder function to combine the lyrics to this song using the lines given
        //  The line order is: 1, 2, 1, 2, 3, 4, 5, 2

        for (int i = 0; i < lyrics_buffer_length; i++) {
            System.out.print(lyrics_buffer[i]);
        }
    }
}
```

### Expected Output

The following lyrics are expected to be printed:

```
Hosanna, Hosanna,
Hosanna in the highest!
Hosanna, Hosanna,
Hosanna in the highest!

Lord, we lift up Your name,
With hearts full of praise,
Be exalted, O Lord my God,
Hosanna in the highest!
```
