EXP.NO:3
DATE:11-08-26
                           STRING OPERATIONS
Aim:
To perform various String operations in Java using built-in String methods.
    
Algorithm:
1.	Create a String "Hello Java".
2.	Find its length using length().
3.	Access a character using charAt().
4.	Convert the String to uppercase and lowercase.
5.	Extract a substring using substring().
6.	Perform concatenation using concat().
7.	Check whether the String contains a particular word.
8.	Find character positions using indexOf() and lastIndexOf().
9.	Replace a word using replace().
10.	Check the starting and ending text using startsWith() and endsWith().
11.	Compare two Strings using equals().
12.	Remove extra spaces using trim().
13.	Display all the results.
    
Code:
    public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}

Output:
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java
    
Result:
Thus, various String operations are successfully performed using Java String methods.
