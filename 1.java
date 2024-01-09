/**
 * Stringmethod
 */
public class Stringmethod {

  public static void main(String[] args) {

    // String class important methods

    // length()
    // Returns the length (number of characters) of the string.
    String str = "Hello, World!";
    int length = str.length(); // length is 13

    // charAt(int index)
    // Returns the character at the specified index.
    char charAtIndex = str.charAt(7); // charAtIndex is 'W'

    // concat(String str)
    // Concatenates the specified string to the end of the current string.
    String newStr = str.concat(" How are you?"); // newStr is "Hello, World! How are you?"

    // substring(int beginIndex)
    // Returns a substring starting from the specified index.
    String substring = str.substring(7); // substring is "World!"

    // substring(int beginIndex, int endIndex)
    // Returns a substring from beginIndex to endIndex (exclusive).
    String sub = str.substring(7, 12); // sub is "World"

    // toUpperCase()
    // Converts all characters in the string to uppercase.
    String upper = str.toUpperCase(); // upper is "HELLO, WORLD!"

    // toLowerCase()
    // Converts all characters in the string to lowercase.
    String lower = str.toLowerCase(); // lower is "hello, world!"

    // trim()
    // Removes leading and trailing whitespaces from the string.
    String spaced = "   Trim me!   ";
    String trimmed = spaced.trim(); // trimmed is "Trim me!"

    // startsWith(String prefix)
    // Checks if the string starts with the specified prefix.
    boolean startsWithHello = str.startsWith("Hello"); // true

    // endsWith(String suffix)
    // Checks if the string ends with the specified suffix.
    boolean endsWithWorld = str.endsWith("World!"); // true

    // contains(CharSequence sequence)
    // Checks if the string contains the specified sequence of characters.
    boolean containsHello = str.contains("Hello"); // true

    // equals(Object another)
    // Compares the content of two strings for equality.
    boolean isEqual = str.equals("hello, world!"); // false

    // equalsIgnoreCase(String another)
    // Compares the content of two strings for equality, ignoring case.
    boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!"); // true

    // replace(char oldChar, char newChar)
    // Replaces all occurrences of a specified character with another character.
    String replaced = str.replace('o', 'x'); // replaced is "Hellx, Wxrld!"

    // split(String regex)
    // Splits the string into an array of substrings based on the specified regular
    // expression.
    String[] words = str.split(", "); // words is {"Hello", "World!"}

    // indexOf(String str)
    // Returns the index of the first occurrence of the specified substring.
    int indexOfWorld = str.indexOf("World"); // indexOfWorld is 7

    // lastIndexOf(String str)
    // Returns the index of the last occurrence of the specified substring.
    int lastIndexOfo = str.lastIndexOf("o"); // lastIndexOfo is 8

    // isEmpty()
    // Returns true if the string is empty; otherwise, returns false.
    boolean isEmpty = str.isEmpty(); // false

    // startsWith(String prefix, int offset)
    // Checks if the string starts with the specified prefix beginning at the
    // specified index.
    boolean startsWithWorldAtOffset = str.startsWith("World", 7); // true

    // replace(CharSequence target, CharSequence replacement)
    // Replaces all occurrences of a specified substring with another substring.
    String replacedSubstring = str.replace("World", "Universe"); // replacedSubstring is "Hello, Universe!"

    // toLowerCase(Locale locale)
    // Converts all characters in the string to lowercase using the specified
    // locale.
    String lowerWithLocale = str.toLowerCase(Locale.US); // lowerWithLocale is "hello, world!"

    // toUpperCase(Locale locale)
    // Converts all characters in the string to uppercase using the specified
    // locale.
    String upperWithLocale = str.toUpperCase(Locale.US); // upperWithLocale is "HELLO, WORLD!"

    // toCharArray()
    // Converts the string to a character array.
    char[] charArray = str.toCharArray(); // charArray is {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd',
                                          // '!'}

    // valueOf(Object obj)
    // Returns the string representation of the specified object.
    String valueOfInt = String.valueOf(42); // valueOfInt is "42"

    System.out.println(charArray.toString());
  }
}
