package com.company.assignment2;


public class Ques14 {
    public static int[] array;

    public static void main(String[] args) {
        System.out.print("Enter Number of Elements : ");
        int elemValue = Ques2.sc.nextInt();
        makeArray(elemValue);
        System.out.print("Enter Target Value : ");
        int target = Ques2.sc.nextInt();
        System.out.println("Pairs are as follows : ");
        findingPair(target);
    }

    protected static void makeArray(int elemValue){
        array = new int[elemValue];
        int count = 0;

        while (count < elemValue){
            array[count] = Ques2.sc.nextInt();
            count++;
        }
    }

    private static void findingPair(int target){
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }

    }


}
