public class Main {

    public static void main(String[] args) {

//        Account account = new Account(1122, 20000);
//        account.setAnnualInterestRate(4.5);
//        account.withdraw(2500);
//        account.deposit(3000);
//
//        System.out.println(account);
//
//        Account account1 = new Account(123, 1500);
//        SavingsAccount savingsAccount = new SavingsAccount(234, 3000);
//        CheckingAccount checkingAccount = new CheckingAccount(111, 2000, 500);
//
//        checkingAccount.withdraw(1000);
//        System.out.println(checkingAccount);
//
//        System.out.println();
//
//        checkingAccount.withdraw(1500);
//        System.out.println(checkingAccount);
//
//        System.out.println();
//
//        checkingAccount.withdraw(2000);
//        System.out.println(checkingAccount);
//
//        System.out.println();

        AccountWithTransactions account = new AccountWithTransactions("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30, "cash");
//        account.printTransactions();
//        System.out.println();

        account.deposit(40, "cash");
//        account.printTransactions();
//        System.out.println();

        account.deposit(50, "cash");
//        account.printTransactions();
//        System.out.println();

        account.withdraw(5, "bay");
//        account.printTransactions();
//        System.out.println();

        account.withdraw(4, "netflix");
//        account.printTransactions();
//        System.out.println();

        account.withdraw(2, "cat");
        account.printSummary();
        System.out.println();

    }
}
