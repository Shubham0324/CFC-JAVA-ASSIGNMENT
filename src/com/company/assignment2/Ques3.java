package com.company.assignment2;

public class Ques3 {

    public static void main(String[] args) {
        System.out.print("Enter Character : ");
        char characterInput = Ques1.sc.next().charAt(0);
        System.out.println(caseCheck(characterInput));
    }

    public static String caseCheck(char characterInput){
        return 65 <= characterInput && characterInput <= 90 ? "Uppercase"
                : 97 <= characterInput && characterInput <= 122 ? "LowerCase"
                :"Not A Alphabetic Character";

    }
}
