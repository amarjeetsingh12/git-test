package com.rest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by amarjeet.singh on 12/12/14.
 */
public class SegmentTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Set<Long> scannedNumbers=new HashSet<Long>();
        for(int i=0;i<n;i++){
            scannedNumbers.add(sc.nextLong());
        }
        int qNum=sc.nextInt();

    }
}
