package org.example;

import java.util.Scanner;

public class cantina {
    public static void run() {
        Scanner scan = new Scanner(System.in);

        int resp1, resp2;

        System.out.printf("Responda com 1 [sim] ou 2 [não]:" +
                "\n\nVocê está com fome?");
        resp1 = scan.nextInt();

        System.out.printf("\nVocê tem dinheiro?");
        resp2 = scan.nextInt();

        System.out.println();

        if(resp1 == 1 && resp2 == 1) {
            System.out.printf("Bora pra cantina, eu quero pão de queijo~");
        }
        else if(resp1 == 2){
            System.out.printf("Guardac o dinheiro pra gastar em joguinhos online");
        }
        else if(resp2 == 2){
            System.out.printf("SÉRIO??? NADA???");
        }
        else if(resp1 == 2 && resp2 == 2){
            System.out.printf("Que bom! Agora bora jogar ProSeka");
        }
    };
}