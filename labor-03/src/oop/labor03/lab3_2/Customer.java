package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.numAccounts=0;

    }

    public void addAccount(BankAccount account) {
        if(numAccounts<MAX_ACCOUNTS){
            accounts[numAccounts]=account;
            numAccounts++;
        } else{
            System.out.println("You have reached the MAXIMUM number of accounts at this bank.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<this.numAccounts;i++)
            if(accounts[i].getAcountNumber().equals(accountNumber))
                return accounts[i];

        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public String getFistName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAcount(String accountNumber){
//                this.account = null;
        int index=-1;
        for(int i=0;i<this.numAccounts;i++)
            if(accounts[i].getAcountNumber().equals(accountNumber)) {
                accounts[i] = null;
                index=i;
                break;
            }
        if (index>-1){
            System.arraycopy(accounts, index + 1, accounts, index, this.numAccounts - 1 - index);
            accounts[this.numAccounts-1]=null;
            numAccounts--;
        }
        else System.out.println("There was no Account found!");
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }
}