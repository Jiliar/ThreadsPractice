package com.jsolutions;

public class ImplementsExample implements Runnable{

    private String msg;

    public ImplementsExample(String msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(this.msg);
        }
    }
}
