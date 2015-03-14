package com.rest.thread;

import com.rest.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by amarjeet.singh on 15/12/14.
 */
public class Consumer implements Runnable,Comparable {
    String name;
    public static Map<Integer,String> data =new ConcurrentHashMap<Integer, String>(){{
        put(0,"unused");
        put(1,"unused");
        put(2,"unused");
        put(3,"unused");
        put(4,"unused");
        put(5,"unused");
    }};

    public void get(){
        System.out.println(name);
    }

    @Override
    public void run() {
        while(true){
            try {
                data.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<Integer> lst=new Vector<Integer>();
            lst.add(23);
            int index=Consumer.isAvailable();
            if(index==-1)break;
            try {
                consume(index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.notifyAll();
        }
    }

    public static int  isAvailable(){
        for(Map.Entry<Integer,String> entry:data.entrySet()){
                if(entry.getValue().equalsIgnoreCase("unused")){
                    return entry.getKey();
                }
        }
        return -1;
    }
    public static boolean consume(int index) throws InterruptedException {
        Thread.sleep(200);
        data.put(index,Thread.currentThread().getName());
        System.out.println(String.format("Index %s is consumed by %s",index,Thread.currentThread().getName()));
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
