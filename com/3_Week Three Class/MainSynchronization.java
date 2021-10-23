package com;

public class MainSynchronization {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new MyThread(table);
        Thread t2 = new Thread(new MyThread2());

        t1.start();
        t2.start();

    }
    
}
