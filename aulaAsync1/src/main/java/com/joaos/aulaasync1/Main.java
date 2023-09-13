package com.joaos.aulaasync1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aldeia vilaDaFolha = new Aldeia("Vila da Folha", 1000, "País do Fogo");

        //essa parte pode ser removida caso queira criar todos os ninjas manualmente
        Ninja[] ninjasAuto;
        ninjasAuto = facilitador.autoCriador();
        for (Ninja ninja : ninjasAuto) {
            vilaDaFolha.adicionarNinja(ninja);
        }

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        while(opcao != -0){
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade: ");
                    int idade = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o ranking: ");
                    String ranking = sc.nextLine();
                    Ninja ninja = new Ninja(nome, idade, titulo, ranking);
                    vilaDaFolha.adicionarNinja(ninja);
                    System.out.println("Ninja adicionado com sucesso!");
                    break;
                case 2:
                    vilaDaFolha.mostraInfo();
                    break;
                case 3:
                    vilaDaFolha.rankingS();
                    break;
                case 4:
                    vilaDaFolha.qtdTitulos();
                    break;
            }

        }


    }
}