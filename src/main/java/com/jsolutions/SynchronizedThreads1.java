package com.jsolutions;

public class SynchronizedThreads1 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("A "+i +" "+ this.getName());
        }
    }

}

class SynchronizedThreads2 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("B "+i +" "+ this.getName());
        }
    }

}

class SynchronizedThreads3 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("C "+i +" "+ this.getName());
        }
    }

}

class SynchronizedThreads4 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("D "+i +" "+ this.getName());
        }
    }

}

class SynchronizedThreads5 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("E "+i +" "+ this.getName());
        }
    }

}