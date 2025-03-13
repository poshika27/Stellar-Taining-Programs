import java.util.Scanner;

public class BankManagement { 

    static class Account {
        int accountNumber;
        String accountHolder;
        double balance;

        Account(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance;
        }
    }

    static Account accounts[] = new Account[100]; 
    static int accountCount = 0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    viewAccounts();
                    break;
                case 3:
                    depositMoney(sc);
                    break;
                case 4:
                    withdrawMoney(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        accounts[accountCount++] = new Account(accNo, name, balance);
        System.out.println("Account created successfully.");
    }

    private static void viewAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("\n--- List of Accounts ---");
            for (int i = 0; i < accountCount; i++) {
                System.out.println(accounts[i]);
            }
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        double amount = scanner.nextDouble();
        boolean found = false;

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNo) {
                accounts[i].balance += amount;
                System.out.println("Deposit successful. New Balance: $" + accounts[i].balance);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = scanner.nextDouble();
        boolean found = false;

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNo) {
                if (accounts[i].balance >= amount) {
                    accounts[i].balance -= amount;
                    System.out.println("Withdrawal successful. Remaining Balance: $" + accounts[i].balance);
                } else {
                    System.out.println("Insufficient balance.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }
}


