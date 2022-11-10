package com.jsolutions;

public class ThreadLocalExample {

    public void runThreadLocalExample(){

        ThreadLocal<String> threadLocal1 = new ThreadLocal<>();

        Thread thread1 = new Thread(()->{
            threadLocal1.set("Thread 1");
           try{
               Thread.sleep(2000);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
            String value1 = threadLocal1.get();
            System.out.println(value1);
        });

        //Removing Value
        Thread thread2 = new Thread(()->{
            threadLocal1.set("Thread 2");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            threadLocal1.remove();
            String value2 = threadLocal1.get();
            System.out.println(value2);
        });

        Thread thread3 = new Thread(()->{
            threadLocal1.set("Thread 3");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            String value3 = threadLocal1.get();
            System.out.println(value3);
        });

        //ThreadLocal with Init Value
        ThreadLocal<MyObject> threadLocal2 =
          new ThreadLocal<>(){
                protected MyObject initialValue(){
                  return new MyObject();
                }
        };

        //Another way to create Thread Local
        ThreadLocal<MyObject> threadLocal3 =
                ThreadLocal.withInitial(()->{
                    return new MyObject();
                });

        Thread thread4 = new Thread(()->{
            System.out.println("ThreadLocal2: " + threadLocal2.get());
            System.out.println("ThreadLocal3: " + threadLocal3.get());
        });

        Thread thread5 = new Thread(()->{
            System.out.println("ThreadLocal2: " + threadLocal2.get());
            System.out.println("ThreadLocal3: " + threadLocal3.get());
        });


        //Set value lazily in Java ThreadLocal - You can have conflicts when you use this way, its recommended to use
        // Threadlocal when you are init the subprocess.
        ThreadLocal<String> threadLocal4 = new ThreadLocal<>();
        String value = threadLocal4.get();
        if(value == null){
            threadLocal4.set("Lazyly set value");
            value = threadLocal4.get();
        }

        System.out.println(value);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}

class MyObject{

}
