import java.util.Scanner;
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Collatz sequence for " + number + ":");
        while (number != 1) {
            System.out.print(number + " "); 
            if (number % 2 == 0) {
                number /= 2;  
            } 
else {
                number = number * 3 + 1; 
            }
        }
        System.out.println(number);
        scanner.close();
    }
}
