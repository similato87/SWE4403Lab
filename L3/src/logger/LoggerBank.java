package logger;

import java.util.HashMap;
import java.util.HashSet;

public class LoggerBank {
    private static HashSet<LoggerBank> accountList;
    private int accountID;
    private int balance;

    private void makeWait() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private LoggerBank(int ID) {
        this.accountID = ID;

    }

    public static LoggerBank getAccount(int ID) {
        if (accountList == null)
            accountList = new HashSet<LoggerBank>();
        for (LoggerBank account : accountList) {
            if (account.accountID == ID) {
                return account;
            }
        }
        LoggerBank newAccount = new LoggerBank(ID);accountList.add(newAccount);
        newAccount.balance = 0;
        return newAccount;
    }

    @Override
    public String toString() {
        return "LoggerBank{" +
                "accountID=" + accountID +
                ", balance=" + balance +
                '}';
    }

    public static void withdraw(int ID, int amount){
        LoggerBank updatingAccount = getAccount(ID);
        updatingAccount.balance-=amount;
    }

    public static void deposit(int ID, int amount){
        LoggerBank updatingAccount = getAccount(ID);
        updatingAccount.balance += amount;
    }

    public static void transfer(int transferOutAccountID, int transferInAccountID, int amount) {
        LoggerBank transferOutAccount = getAccount(transferOutAccountID);
        LoggerBank transferInAccount = getAccount(transferInAccountID);
        transferOutAccount.balance-=amount;
        transferInAccount.balance+=amount;
    }

}