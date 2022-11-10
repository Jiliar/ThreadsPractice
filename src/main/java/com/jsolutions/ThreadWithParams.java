package com.jsolutions;

public class ThreadWithParams extends Thread{

    private int num;

    public ThreadWithParams(String threadName){
       super(threadName);
    }

    public ThreadWithParams(int num){
        this.num = num;
    }

    @Override
    public void run(){
        for(int i = 0; i <= num; i++){
            System.out.println(i +" "+ this.getName());
        }
    }

    public void setNum(int num) {
        this.num = num;
    }
}
