import java.util.*;

class First {
    float balance = 0.0f;
    int pin = 8520;

    public void pinCheck() {
        System.out.println("Enter your PIN number");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin number");
        }
    }

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Enter a valid choice");
                menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance is " + balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if (amt > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amt;
            System.out.println("Withdrawal successful");
        }
        menu();
    }

    public void deposit() {
        System.out.println("Enter the amount ");
        Scanner sc = new Scanner(System.in);
        float dAmt = sc.nextFloat();
        balance = balance + dAmt;
        System.out.println("Deposit successful");
        menu();
    }

    public void exit() {
        System.out.println("Punha padhare (Visit again)");
    }
}

public class ATM {
    public static void main(String[] args) {
        First obj = new First();
        obj.pinCheck();
    }
}
