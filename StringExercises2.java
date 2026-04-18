/*3c. String Exercise progams
Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()

Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
*/
package String_Functions;
import java.util.Scanner;
import java.util.Random;

public class StringExercises2 {

    // Q6
    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    // Q7
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Q8
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.charAt(rand.nextInt(chars.length()));
        }
        return result;
    }

    // Q10
    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Exercises (Q6–Q10) ---");
            System.out.println("1. Capitalize Words");
            System.out.println("2. Truncate String");
            System.out.println("3. Check Numeric");
            System.out.println("4. Generate Random String");
            System.out.println("5. Count Words");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    System.out.println("Result: " + capitalizeWords(sc.nextLine()));
                    break;

                case 2:
                    System.out.print("Enter string: ");
                    String str = sc.nextLine();
                    System.out.print("Enter length: ");
                    int len = sc.nextInt();
                    System.out.println("Result: " + truncate(str, len));
                    break;

                case 3:
                    System.out.print("Enter string: ");
                    System.out.println(isNumeric(sc.nextLine()) ? "Numeric" : "Not Numeric");
                    break;

                case 4:
                    System.out.print("Enter length: ");
                    System.out.println("Random: " + generateRandomString(sc.nextInt()));
                    break;

                case 5:
                    System.out.print("Enter string: ");
                    System.out.println("Word Count: " + countWords(sc.nextLine()));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}