import java.util.Scanner;
public class SmallAndLargeDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); 
        int[] result = findDigit(number);
        System.out.println("Smallest digit: " + result[0]);
        System.out.println("Largest digit: " + result[1]);
        scanner.close();
    }
    public static int[] findDigit(long number) {
        int smallest = 9; 
        int largest = 0;   
        while (number > 0) {
            int digit = (int)(number % 10);
            if (digit < smallest) {
                smallest = digit;
            }
            if (digit > largest) {
                largest = digit;
            }
            
            number /= 10;
        }

        return new int[]{smallest, largest};
    }
}
