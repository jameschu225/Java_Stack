public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount(100,300);
        BankAccount bank3 = new BankAccount(6000,30);
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        bank1.deposit("checking", 300);
        System.out.println("bank1 total: " + bank1.getTotal());
        bank1.deposit("savings", 40);
        System.out.println("bank1 total: " + bank1.getTotal());
        System.out.println("bank1 checking: " + bank1.getCheckingBalance());
        System.out.println("bank1 checking: " + bank1.getSavingsBalance());

        bank2.deposit("checking", 5000);
        System.out.println("bank2 total: " + bank2.getTotal());
        bank2.deposit("savings", 400);
        System.out.println("bank2 total: " + bank2.getTotal());
        System.out.println("bank1 checking: " + bank2.getCheckingBalance());
        System.out.println("bank1 checking: " + bank2.getSavingsBalance());

        bank3.deposit("checking", 5);
        System.out.println("bank3 total: " + bank3.getTotal());
        bank3.deposit("savings", 0);
        System.out.println("bank3 total: " + bank3.getTotal());
        System.out.println("bank1 checking: " + bank3.getCheckingBalance());
        System.out.println("bank1 checking: " + bank3.getSavingsBalance());
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        bank1.withdraw("checking", 400);
        System.out.println("bank1 total: " + bank1.getTotal());
        bank1.withdraw("savings", 10);
        System.out.println("bank1 total: " + bank1.getTotal());
        System.out.println("bank1 checking: " + bank1.getCheckingBalance());
        System.out.println("bank1 checking: " + bank1.getSavingsBalance());

        bank2.withdraw("checking", 200);
        System.out.println("bank2 total: " + bank2.getTotal());
        bank2.withdraw("savings", 1000);
        System.out.println("bank2 total: " + bank2.getTotal());
        System.out.println("bank1 checking: " + bank2.getCheckingBalance());
        System.out.println("bank1 checking: " + bank2.getSavingsBalance());

        bank3.withdraw("checking", 200);
        System.out.println("bank3 total: " + bank3.getTotal());
        bank3.withdraw("savings", 5);
        System.out.println("bank3 total: " + bank3.getTotal());
        System.out.println("bank1 checking: " + bank3.getCheckingBalance());
        System.out.println("bank1 checking: " + bank3.getSavingsBalance());
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts());
        System.out.println("$" + BankAccount.getTotalMoney());
        System.out.println("bank1 account#:" + bank1.getAccountNumber());
        System.out.println("bank2 account#:" + bank2.getAccountNumber());
        System.out.println("bank3 account#:" + bank3.getAccountNumber());

    }
}