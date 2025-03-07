import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
