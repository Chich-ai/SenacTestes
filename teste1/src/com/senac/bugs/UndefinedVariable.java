package com.senac.bugs;

public class UndefinedVariable {

    public static void main(String[] args) {
        int number = 10;
        int undefinedVariable = number + 10;
        System.out.println(undefinedVariable);
    }
}
