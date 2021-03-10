package com.company.assinment3;

import java.util.Scanner;

public class Ques1 {
    static int[][] matrix;
    static int row, col;
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        row = sc.nextInt();
        col = sc.nextInt();
        getMatrix(row, col);
        printVerticalWave();

    }

    protected static void getMatrix(int row, int col){
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void printVerticalWave(){

        for (int i = 0; i < col; i++) {
            int temp = i % 2 == 0 ? row - 1 : 0;
            for (int j = row - 1; j >= 0   ; j--) {
                System.out.print(matrix[ Math.abs(temp- j)][i] + " ");
            }
        }
    }
}
