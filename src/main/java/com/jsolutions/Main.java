package com.jsolutions;

public class Main {

//https://www.youtube.com/watch?v=a_BoqsnVR2U
    public static void main(String[] args){
        Main m = new Main();
        //m.extendsThread();
        //m.implementsRunneable();
        //m.threadWithParams();
        //m.threadStates();
        //m.synchronizedThreads();
        //m.threadLocalExample();
        m.inheritableThreadLocalExample();
    }


    public void extendsThread(){
        System.out.println("extends Thread");
        Thread thread1 = new ExtendsExample("Process 1");
        Thread thread2 = new ExtendsExample("Process 2");
        thread1.start();
        thread2.start();
    }


    public void implementsRunneable(){
        System.out.println("Implements Runnable");
        Thread thread3 = new Thread(new ImplementsExample("Process 3"));
        Thread thread4 = new Thread(new ImplementsExample("Process 4"));
        thread3.start();
        thread4.start();
    }

    public void threadWithParams(){
        System.out.println("Thread with Params");
        ThreadWithParams thread5 = new ThreadWithParams("Process 5");
        thread5.setNum(5);
        ThreadWithParams thread6 = new ThreadWithParams("Process 6");
        thread6.setNum(7);
        ThreadWithParams thread7 = new ThreadWithParams("Process 7");
        thread5.start();
        thread6.start();
    }

    public void threadStates(){
        System.out.println("--- Thread states ---");
        System.out.println("State 1: New");
        ThreadStates thread8 = new ThreadStates();
        System.out.println("State 2: Runneable");
        thread8.start();
        System.out.println("State 3: Blocked");

        try {
            thread8.sleep(1000); // needs to manage InterruptedException
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("State 4: Died");
        thread8.stop(); //Deprecated method
    }


    public void synchronizedThreads(){
        SynchronizedThreads1 thread1 = new SynchronizedThreads1();
        SynchronizedThreads2 thread2 = new SynchronizedThreads2();
        SynchronizedThreads3 thread3 = new SynchronizedThreads3();
        SynchronizedThreads4 thread4 = new SynchronizedThreads4();
        SynchronizedThreads5 thread5 = new SynchronizedThreads5();

        thread1.start();
        this.sleepThread(thread1, 1000);
        thread2.start();
        this.sleepThread(thread2, 1000);
        thread3.start();
        this.sleepThread(thread3, 1000);
        thread4.start();
        this.sleepThread(thread4, 1000);
        thread5.start();
        this.sleepThread(thread5, 1000);

    }

    public void sleepThread(Thread thread, int milis){
        try {
            thread.sleep(milis); // needs to manage InterruptedException
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void threadLocalExample(){
        ThreadLocalExample t = new ThreadLocalExample();
        t.runThreadLocalExample();
    }

    public void inheritableThreadLocalExample(){
        InheritableThreadLocalExample t = new InheritableThreadLocalExample();
        t.runInheritableThreadLocalExample();
    }


}