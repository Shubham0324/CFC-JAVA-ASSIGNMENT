package com.company.assignment1;

import java.util.Scanner;

public class Ques2 {

    final static Scanner sc = new Scanner(System.in);

    private int amount;
    private float rate;
    private int time;

    public void setAmount(int amountbyUser) {
        amount = amountbyUser;
    }
    public void setRate (int rateByUser) {
        rate = rateByUser;
    }
    public void setTime (int timeByUser) {
        time = timeByUser;
    }
    public int getAmount () {
        return amount;
    }
    public float getRate () {
        return rate;
    }
    public int getTime () {
        return time;
    }
    static float getInterest (int amount, float rate, int time ) {
        return amount * rate * time;
    }

    public static void main(String[] args) {
        Ques2 acs = new Ques2();
        System.out.println("Welcome to Interest Calculator");
        System.out.print("Enter Amount: ");
        acs.setAmount(sc.nextInt());
        System.out.print("Enter Rate: ");
        acs.setRate(sc.nextInt());
        System.out.print("Enter Time: ");
        acs.setTime(sc.nextInt());
        System.out.printf("Your Interest is %.2f %n", getInterest(acs.getAmount(),acs.getRate(), acs.getTime()));
    }
}
