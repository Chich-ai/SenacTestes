package org.example;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        run();
    }  public static void run() {
        Scanner scan = new Scanner(System.in);
        int pontos = 0;

        String resposta;

        System.out.printf("Bem-vindos ao meu Quiz!!!!\n\n" +
                "Pergunta 1: Qual meu jogo favorito do momento?\n\n" +
                "a- Poop Simulator do PS4\n" +
                "b- Project Sekai\n" +
                "c- 5D Chess with Multiverse Time Travel\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("b") || resposta.equals("b-")) {
            System.out.println("Resposta certa! Uau!! Nem parece que eu só jogo isso o tempo todo :)\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :(\n");
        }

        System.out.println("Quais as minhas top 3 cores favoritas?\n\n" +
                "a- Marrom, Preto, Branco\n" +
                "b- EU AMO TODAS IGUALMENTE.\n" +
                "c- Azul, Amarelo, Roxo\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("c") || resposta.equals("c-")) {
            System.out.println("Resposta certa! Como vc sabia dessa?\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :((\n");
        }

        System.out.println("Quais os meus passatempos?\n\n" +
                "a- Planejar minha dominação mundial, jogar ProSeka\n" +
                "b- Coletar mangás, jogar ProSeka, ouvir música\n" +
                "c- Fotossíntese (me entrego à Terra e deixo ela e o sol me consumirem), jogar ProSeka\n\n" +
                "Resposta: ");

        resposta = scan.nextLine();

        System.out.println();
        if(resposta.equals("a") || resposta.equals("b")){
            System.out.println("Resposta correta! Muahaha\n");
            pontos++;
        }
        else {
            System.out.println("Resposta errada :(((\n");
        }

        System.out.println("Você acertou " + pontos + " perguntas!\n\n" +
                "Obrigado por participar desse Quiz sem noção ;)");
    }
}