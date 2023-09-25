package Polymorphism;

abstract class ABCBank {
    abstract void openAccount();
    abstract void closeAccount();
    public void message() {
        System.out.println("Welcome to ABC Bank");
    }
}
abstract class BankAccount extends ABCBank {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();


}
class SavingAccount extends BankAccount {

    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Account");

    }

    @Override
    void balance() {
        System.out.println("Balance in Saving Account");

    }

    @Override
    void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Account");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
SavingAccount savingAccount = new SavingAccount();
savingAccount.deposit();
savingAccount.withdraw();
savingAccount.balance();
savingAccount.openAccount();
savingAccount.closeAccount();

savingAccount.message();
    }
}
