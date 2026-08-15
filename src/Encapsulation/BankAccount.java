package Encapsulation;


//Encapsulation means to bind both data and method with in the class
public class BankAccount {
    private double balance;
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(500);
//        System.out.println("I am BankAccount");
//    }


//    ===============
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    //now we use getter ans shetter
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(1013160);
        bankAccount.deposit(94615410);
        System.out.println(bankAccount.getBalance());

    }

}
//=====Example =====
//public class bnkacnt{
//    public double balance;
//
//    public static void main(String[] args) {
//        bnkacnt b = new bnkacnt();
//        b.balance = 100;
//        System.out.println("The balance is: " + b.balance); .//so in this class both method and data in same class
////        but not achive data hiding ..anyone can acces data ..to avoid that problem we use private and getter and setter
//    }
//}