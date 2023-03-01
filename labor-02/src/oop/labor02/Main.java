package oop.labor02;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("OTP00001");

        System.out.println(bankAccount1.getAccountNumber()+": "+bankAccount1.getBalance());
        bankAccount1.deposit(-23);
        bankAccount1.deposit(1000);
        System.out.println(bankAccount1);

        //5
        boolean result1 = bankAccount1.withdraw(500);
        if ( !result1 ){
            System.out.println("YOU DON'T HAVE (that much) MONEY. GO WORK!");
        }
        System.out.println(bankAccount1);

        //7
        boolean result2 = bankAccount1.withdraw(1000);
        if ( !result2 ){
            System.out.println("YOU DON'T HAVE (that much) MONEY (still). GO WORK!");
        }
        System.out.println(bankAccount1);

        //9
        BankAccount bankAccount2 = new BankAccount("OTP00002");
        System.out.println(bankAccount2);

        //11 Deposit 2000 EUR (I guess it meant for the second account. ^^
        bankAccount2.deposit(2000);
        System.out.println(bankAccount2);
    }
}