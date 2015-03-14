package com.rest.thread;

import java.util.Map;

/**
 * Created by amarjeet.singh on 15/12/14.
 */
public class Main {
    public static void main(String[] args) {
        Consumer[] consumers=new Consumer[]{
                new Consumer(),new Consumer(),new Consumer(),new Consumer()
        };
        for(Consumer c:consumers){
            new Thread(c).start();
        }
        for(Map.Entry<Integer,String> entry:Consumer.data.entrySet()){
            System.out.println(String.format("Final Data index is %s consumed by %s",entry.getKey(),entry.getValue()));
        }
    }
}
