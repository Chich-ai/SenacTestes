package org.example;

public class PositivoNegativo {
    public static String avalia(double n1){
        if (n1 > 0){
            return "positivo";
        } else if (n1 < 0){
            return "negativo";
        } else {
            return "zero";
        }
    }
}
