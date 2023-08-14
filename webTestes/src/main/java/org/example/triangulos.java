package org.example;

import java.util.Scanner;

public class triangulos {

    public static void run() {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o valor do primeiro lado do triângulo: ");

        Double primeiroLado = scan.nextDouble();

        System.out.println();
        System.out.printf("Agora insira o valor do segundo lado: ");

        Double segundoLado = scan.nextDouble();

        System.out.println();
        System.out.printf("Por último, insira o valor do terceiro lado: ");

        Double terceiroLado = scan.nextDouble();

        System.out.println();
        if(primeiroLado.equals(segundoLado) && segundoLado.equals(terceiroLado)) {
            System.out.println("O seu triângulo é equilátero.");
        }
        else if (primeiroLado.equals(segundoLado) || primeiroLado.equals(terceiroLado) || segundoLado.equals(terceiroLado)) {
            System.out.println("O seu triângulo é isóceles.");
        }
        else {
            System.out.println("O seu triângulo é escaleno.");
        }

        System.out.println();
        run();
    }

}
