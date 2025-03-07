import java.util.Scanner;
public class RemoveVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 
        String resultString = removeVowels(inputString);
        System.out.println("String after removing vowels: " + resultString);
        scanner.close();
    }
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder(); 
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            if (vowels.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
} 
