import java.text.DecimalFormat;
import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private String accountNumber;
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
        totalMoney += this.checkingBalance + this.savingsBalance;
        accountNumber = setAccountNumber();
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        totalMoney += this.checkingBalance + this.savingsBalance;
        accountNumber = setAccountNumber();

    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

        public void setCheckingBalance(double amount){
            this.checkingBalance = amount;
    }

        public double getSavingsBalance(){
        return this.savingsBalance;
    }

        public void setSavingsBalance(double amount){
            this.savingsBalance = amount;
    }

    public static int getAccounts(){
        return BankAccount.accounts;
    }

    public static void setAccounts(int numberOfAccount){
        BankAccount.accounts = numberOfAccount;
    }

    public double getTotal(){
        double total =0;
        total = savingsBalance + checkingBalance;
        return total;
    }

    public static double getTotalMoney(){
        return BankAccount.totalMoney;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    // METHODS
    private String setAccountNumber(){
        Random randMachine = new Random();
        String account =""; 
        for (int i=0; i<10; i++){
            int number = randMachine.nextInt(10);
            account += Integer.toString(number);
        }
        return account;
    }
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(String accountType, double depositAmount){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
        if (accountType == "checking"){
            this.checkingBalance += depositAmount;
            String output = myFormatter.format(getTotal());
            System.out.println(output); 
        } else if (accountType == "savings"){
            this.savingsBalance += depositAmount;
            String output = myFormatter.format(getTotal());
            System.out.println(output); 
        }
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
        public void withdraw(String accountType, double withdrawAmount){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
        if (accountType == "checking" && withdrawAmount<=getCheckingBalance()){
            this.checkingBalance -= withdrawAmount;
            String output = myFormatter.format(getTotal());
            System.out.println(output); 
        } else if (accountType == "savings" && withdrawAmount<=getSavingsBalance()){
            this.savingsBalance -= withdrawAmount;
            String output = myFormatter.format(getTotal());
            System.out.println(output); 
        } else {
            System.out.println(accountType + "insufficient funds"); 
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.println("$" + getCheckingBalance());
        System.out.println("$" + getSavingsBalance());
        System.out.println("$" + getTotal());
    }
}