/**
 * Stringmethod
 */
public class Stringmethod {

  public static void main(String[] args) {

    // String class important methods
    String Str = "Hello Word";
    // Length()
    // Returns the length (number of characters) of the string.
    int Length = Str.length(); // length is 10
    // System.out.println(Length);

    // charAt(int index)
    // Returns the length (number of characters) of the string.
    char CharINdex = Str.charAt(7);// charAtIndex is 'o'
    // System.out.println(CharINdex);

    // concat(String str)
    // Concatenates the specified string to the end of the current string.
    String newstr = Str.concat("How are you");
    // System.out.println(newstr); // newStr is "Hello, World! How are you?"

    // substring(int beginIndex, int endIndex)
    // Returns a substring from beginIndex to endIndex (exclusive).
    String substring = Str.substring(6); // substring is "word"
    // System.out.println(substring);

    // substring(int beginIndex, int endIndex)
    // Returns a substring from beginIndex to endIndex (exclusive).
    String sub = Str.substring(6, 10);
    // System.out.println(sub);

    // toUppercase
    // Converts all characters in the string to uppercase.
    String upper = Str.toUpperCase(); // 'HELLO WORD'
    // System.out.println(upper);

    // toLowercase
    // Converts all characters in the string to lowercase.
    String lower = Str.toLowerCase();// String peint "hello word"
    System.out.println(lower);

    // trim()
    // Removes leading and trailing whitespaces from the string.
    String spaced = "   trim me! ";
    String trimed = spaced.trim();// trimmed is "Trim me!"
    System.out.println(trimed);

    // startsWith(String prefix)
    // Checks if the string starts with the specified prefix.
    boolean startwith = Str.startsWith("Hello"); // true
    System.out.println(startwith);

    
    // endsWith(String suffix)
    // Checks if the string ends with the specified suffix.
    boolean endwith=Str.endsWith("Word");//true 
    System.out.println(endwith);

        // contains(CharSequence sequence)
    // Checks if the string contains the specified sequence of characters.
    boolean contains=Str.contains("Hello"); //true
    System.out.println(contains);

    
  }
}
