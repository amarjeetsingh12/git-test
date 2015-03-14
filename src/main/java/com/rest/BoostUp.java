package com.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amarjeet.singh on 08/12/14.
 */
public class BoostUp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(""));
        PrintWriter writer = new PrintWriter(System.out);
        int testCases = scanner.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            int size = scanner.nextInt();
            int[][] matrix = new int[size][];
            for (int rc = 0; rc < size; rc++) {
                matrix[rc] = new int[size];
                for (int cc = 0; cc < size; cc++) {
                    matrix[rc][cc] = scanner.nextInt();
                }
            }
            int[][] destArray = new int[size][size];
            for (int i = 0; i < size; i++) {
                Arrays.fill(destArray[i], -1);
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int startRow=i,startCol=j,counter=0;
                    while (true) {
                        if (destArray[startRow][startCol] != -1) {
                            destArray[i][j]=counter+destArray[startRow][startCol];
                        }else{

                        }
                    }
                }
            }

        }

    }
    public int checkNeighbour(int[] matrix[], int row,int col){
      return 0;
    }
}
