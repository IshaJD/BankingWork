import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Bank b = new Bank(null, 0);
        b.Menu();
    }
}

class Bank {
    private String accountNumber;
    private long balance;

    Bank(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBlance() {
        return balance;
    }

    public void DepositAmount(long depositamount) {
        balance += depositamount;
        System.out.println(
                depositamount + " SUCCESFULLY DEPOSITED IN YOUR BANK ACCOUNT  AVAILABLE BALANCE = $" + balance);
        Menu();
    }

    public void WithdrawAmount(long withdrawlamount) {

        balance = balance - withdrawlamount;
        if (balance > 0)
            System.out.println(withdrawlamount + " WITHDRAWAN AVAILABLE BALANCE = $" + balance);
        else {
            System.out.println(" INSUFFICIENT BALANCE ");
        }
        Menu();
    }

    public void checkAvailableBalance() {
        System.out.println(" BALANCE AVAILABLE = $ " + balance);
        Menu();
    }

    public void exit() {
        System.out.println(" HAVE A NICE DAY ");
        return;
    }

    public void Menu() {
        System.out.println(" ***********WELCOME TO BHARAT BANK *********** ");

        System.out.println(" CHOOSE OPERATIONS - ");
        System.out.println(" 1) WITHDRAW AMOUNT ");
        System.out.println(" 2) DEPOSIT AMOUNT ");
        System.out.println(" 3)CHECK AVAILABLE BALANCE ");
        System.out.println(" 4) EXIT ");

        System.out.println(" ENTER THE CHOICE ");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        switch (ch) {

            case 1:
                System.out.println(" ENTER THE AMOUNT :");
                long x = s.nextLong();
                WithdrawAmount(x);
                break;
            case 2:
                System.out.println(" ENTER THE AMOUNT :");
                long x1 = s.nextLong();
                DepositAmount(x1);
                break;
            case 3:
                checkAvailableBalance();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println(" INVALID INPUT ");
                break;
        }
        s.close();
    }
}
