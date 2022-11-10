package com.jsolutions;

public class ExtendsExample extends Thread {

    public ExtendsExample(String msg){
        super(msg);
    }

    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(this.getName());
        }
    }

}
