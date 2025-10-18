//dominic
public class Main {
    static class BankAccount {//class
        String accountNumber;
        String accountName;
        double balance;
        
        //counstructor
        public BankAccount(String accountNumber, String accountName, double balance) {
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.balance = balance;
        }

        public void deposit(double amount) {//methods
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited Amount: " + amount);
            } else {
                System.out.println("Invalid amount");
            }
        }

        public void withdraw(double amount) { //method
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn Amount: " + amount);
            } else {
                System.out.println("Not enough balance or invalid amount!");
            }
        }

        public void displayInfo() { //method
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Name: " + accountName);
            System.out.println("Current Balance: " + balance);
            System.out.println("--------------------------");
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) { //main method
        BankAccount account = new BankAccount("12345", "Dominic", 100000);
        account.displayInfo();
        
        account.deposit(5000);
        account.displayInfo();
        
        account.withdraw(2000);
        account.displayInfo();
    }
}
