package com.company.assignment2;

import java.util.Scanner;

public class Ques2 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your Friendly Calc: Pattern to input\n Num-1 operation Num-2");
        System.out.println("Answer : " + calc(sc.nextInt(), sc.next(), sc.nextInt() ));
    }

    private static int calc(int input1, String operation, int input2) {
        switch (operation) {
            case "+":
                return input1 + input2;
            case "-":
                return input1 - input2;
            case "*":
                return input1 * input2;
            case "/":
                    if (input2 != 0){
                        return input1 / input2;
                    }
                System.out.println("Cannot Divide by zero");
                    return 0;
            default:
                System.out.println("Wrong Input");
        }
        return 0;
    }

}
