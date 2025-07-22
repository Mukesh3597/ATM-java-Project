
//import java.util.Scanner;
import java.util.*;

class ATM {
    float balance;
    int PIN = 8192;

    public void checkPIN() {
        System.out.println("enter your PIN");
        Scanner s = new Scanner(System.in);
        int enterPIN = s.nextInt();
        if (enterPIN == PIN) {
            menu();
        } else {
            System.out.println("enter your valid pin");
            checkPIN();
        }
    }

    public void menu() {
        System.out.println("enter your choice");
        System.out.println("1.check balance");
        System.out.println("2.widthrow");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        Scanner s = new Scanner(System.in);
        int opt = s.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            widthrow();
        } else if (opt == 3) {
            Deposit();
        } else if (opt == 4)
            return;
        else {
            System.out.println("enter valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance" + balance);
        menu();
    }

    public void widthrow() {
        System.out.println("enter your balance");
        Scanner s = new Scanner(System.in);
        float amount = s.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("widthrow is successfuly");
        }
        menu();
    }

    public void Deposit() {
        System.out.println("enter your Balance");
        Scanner s = new Scanner(System.in);
        float amount = s.nextFloat();
        balance = balance + amount;
        System.out.println("Deposit is successfuly");
        menu();
    }

}

public class First {
    public static void main(String[] args) {
        ATM s = new ATM();
        s.checkPIN();

    }

}
