package logger;

import java.time.LocalTime;

public class Demo {
    public static void main(String[] args) {

        // 1a part
//        Logger logger1 = new Logger("test.txt");
//        Logger logger2 = new Logger("test.txt");
//
//        logger1.write("lg1msg");
//        logger2.write("lg2msg");
//
//        Logger logger3 = new Logger("test3.txt");
//        Logger logger4 = new Logger("test4.txt");
//        logger3.write("lg3msg");
//        logger4.write("lg4msg");

        //1b part
//        LoggerSingleton singleton = LoggerSingleton.getInstance("A");
//        LoggerSingleton anotherSingleton = LoggerSingleton.getInstance("B");
//        LoggerSingleton firstSingleton = LoggerSingleton.getInstance("A");
//        if (singleton.equals(anotherSingleton)){
//            System.out.println("different singletons are same");
//        }
//        else {
//            System.out.println("different singletons are different");
//        }
//        if (singleton.equals(firstSingleton)){
//            System.out.println("the same singleton are same");
//        }
//        else {
//            System.out.println("the same singleton are different");
//        }

        //1c part
//        LoggerBank aliceAccount = LoggerBank.getAccount(1);
//        LoggerBank bobAccount = LoggerBank.getAccount(2);
//        System.out.println(String.format("Initially, Alice: %s\tBob: %s",aliceAccount,bobAccount));
//        LoggerBank.deposit(1,500);
//        LoggerBank.deposit(2,1000);
//        System.out.println(String.format("After depositing, Alice: %s\tBob: %s",aliceAccount,bobAccount));
//        LoggerBank.withdraw(2,300);
//        System.out.println(String.format("After withdrawing, Alice: %s\tBob: %s",aliceAccount,bobAccount));
//        LoggerBank.transfer(2,1,100);
//        System.out.println(String.format("After transferring, Alice: %s\tBob: %s",aliceAccount,bobAccount));
        //1e
//        Runnable transfer1 = () -> LoggerBank.transfer(1, 2, 500);
//        Runnable transfer2 = () -> LoggerBank.transfer(2, 1, 300);
//
//        Thread thread1 = new Thread(transfer1);
//        Thread thread2 = new Thread(transfer2);
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        LocalTime time = LocalTime.now();
//        System.out.println("Current time: " + time);
//        System.out.println(LoggerBank.getAccount(1).toString());
//        System.out.println(LoggerBank.getAccount(2).toString());


        //1g
        Runnable transfer1 = () -> SafeLoggerBank.transfer(1, 2, 500);
        Runnable transfer2 = () -> SafeLoggerBank.transfer(2, 1, 300);

        Thread thread1 = new Thread(transfer1);
        Thread thread2 = new Thread(transfer2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        System.out.println(SafeLoggerBank.getAccount(1).toString());
        System.out.println(SafeLoggerBank.getAccount(2).toString());

    }
}
