package com.jsolutions;

public class InheritableThreadLocalExample extends Thread{

    public void runInheritableThreadLocalExample(){

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        //Threads Locals can share values with childs threads using InheritableThreadLocal
        Thread thread1 = new Thread(()->{
            System.out.println("====== Thread 1 ======");
            threadLocal.set("Thread 1 - ThreadLocal");
            inheritableThreadLocal.set("Thread 1 - InheritableThreadLocal");

            System.out.println(threadLocal.get());
            System.out.println(inheritableThreadLocal.get());

            Thread childThread = new Thread(()->{
                System.out.println("======= ChildThread ======");
                System.out.println(threadLocal.get());
                System.out.println(inheritableThreadLocal.get());
            });

            childThread.start();

        });

        thread1.start();
    }

}
