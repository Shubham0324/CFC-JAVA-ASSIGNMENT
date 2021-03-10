package com.company.assinment3;

public class Ques2 extends Ques1 {
    public static void main(String[] args) {

        row = sc.nextInt();
        col = sc.nextInt();
        getMatrix(row,col);
        printMatrix();
    }
    private static void printMatrix(){
        for (int i = 0; i < col; i++) {
            int temp = i % 2 == 0 ? row - 1 : 0;
            for (int j = row - 1; j >= 0   ; j--) {
                System.out.print(matrix[i][ Math.abs(temp- j)] + " ");
            }
        }
    }
}
