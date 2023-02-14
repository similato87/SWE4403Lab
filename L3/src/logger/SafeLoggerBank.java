package logger;

import java.util.HashMap;
import java.util.HashSet;

public class SafeLoggerBank {
    private static HashSet<SafeLoggerBank> accountList;
    private int accountID;
    private int balance;

    private void makeWait() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private SafeLoggerBank(int ID) {
        this.accountID = ID;
    }

    public static synchronized SafeLoggerBank getAccount(int ID) {
        if (accountList == null)
            accountList = new HashSet<SafeLoggerBank>();
        for (SafeLoggerBank account : accountList) {
            if (account.accountID == ID) {
                return account;
            }
        }
        SafeLoggerBank newAccount = new SafeLoggerBank(ID);
        accountList.add(newAccount);
        newAccount.balance = 0;
        return newAccount;
    }

    @Override
    public String toString() {
        return "SafeLoggerBank{" +
                "accountID=" + accountID +
                ", balance=" + balance +
                '}';
    }

    public static synchronized void withdraw(int ID, int amount){
        SafeLoggerBank updatingAccount = getAccount(ID);
        updatingAccount.balance-=amount;
    }

    public static synchronized void deposit(int ID, int amount){
        SafeLoggerBank updatingAccount = getAccount(ID);
        updatingAccount.balance += amount;
    }

    public static synchronized void transfer(int transferOutAccountID, int transferInAccountID, int amount) {
        SafeLoggerBank transferOutAccount = getAccount(transferOutAccountID);
        SafeLoggerBank transferInAccount = getAccount(transferInAccountID);
        transferOutAccount.balance-=amount;
        transferInAccount.balance+=amount;
    }

}
