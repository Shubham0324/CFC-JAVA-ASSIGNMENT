package com.company.assignment4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length - 1; i++) {
            stringBuilder.append(str[i]);
            if (str[i] == str[i +1]){
                stringBuilder.append("-");
            }
        }

        stringBuilder.append(str[str.length-1]);
        System.out.println(stringBuilder);
        funRun(3);
    }
    private static void funRun(int x) {
        if ((x >> 1) == 1) {
            System.out.println("Yay");
        }
        int[] res ={1,2,3,4,5,6,7,8,9};
        int i = 1;
        while(i < res.length) {
           res[i] = res[i-1];
           i++;
        }
    }

}

