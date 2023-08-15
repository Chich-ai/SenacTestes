package com.senac.bugs;

import java.util.Arrays;
import java.util.List;

public class FindNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int numberToFind = 4;
        int index = numbers.indexOf(numberToFind);
        if (index != -1) {
            System.out.println("O número " + numberToFind + " foi encontrado na posição " + index);
        } else {
            System.out.println("O número " + numberToFind + " não foi encontrado");
        }
    }

}