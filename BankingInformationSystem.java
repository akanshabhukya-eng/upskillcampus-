
public class BankingInformationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Banking Information System");
        int balance = 1000;

        // Deposit
        balance += 500;
        System.out.println("Balance after deposit: " + balance);

        // Withdraw
        balance -= 300;
        System.out.println("Balance after withdrawal: " + balance);
    }
}
