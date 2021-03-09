package com.company.assignment2;

public class Ques15 extends Ques14{
    public static void main(String[] args) {
        System.out.print("Enter Number of Elements : ");
        int elemValue = Ques2.sc.nextInt();
        makeArray(elemValue);
        System.out.print("Enter Target Value : ");
        int target = Ques2.sc.nextInt();
        System.out.println("Pairs are as follows : ");
        findingPair(target);
    }

    public static void findingPair(int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target){
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }
    }
}
