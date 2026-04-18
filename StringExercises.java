/*3b. String Exercise progams

Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().

Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():

Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
*/
package String_Functions;
import java.util.Scanner;

public class StringExercises {

    // Q1
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2
    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Q3
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Q4
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(reverseString(clean));
    }

    // Q5
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Exercises Menu ---");
            System.out.println("1. Check Null or Empty");
            System.out.println("2. Count Substring Occurrences");
            System.out.println("3. Reverse String");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Remove Whitespace");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    if (isNullOrEmpty(str1)) {
                        System.out.println("String is null or empty/whitespace.");
                    } else {
                        System.out.println("String is not empty.");
                    }
                    break;

                case 2:
                    System.out.print("Enter main string: ");
                    String str2 = sc.nextLine();
                    System.out.print("Enter substring: ");
                    String sub = sc.nextLine();
                    System.out.println("Occurrences: " + countOccurrences(str2, sub));
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String str3 = sc.nextLine();
                    System.out.println("Reversed String: " + reverseString(str3));
                    break;

                case 4:
                    System.out.print("Enter a string: ");
                    String str4 = sc.nextLine();
                    if (isPalindrome(str4)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not a Palindrome");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String str5 = sc.nextLine();
                    System.out.println("Without whitespace: " + removeWhitespace(str5));
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}