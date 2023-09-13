package com.joaos.aulaasync1;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;

    //Eu usaria arraylist pela mobilidade de não precisar definir um tamanho maximo de ninjas, mas pra seguir os parametros atuais do exercicio, vou usar array
    Ninja[] ninjas = new Ninja[70];

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    //Eu criei alguns ninjas iniciais pra facilitar a execuçao mas iniciei do zero para manter o codigo como se isso não existisse
    public void adicionarNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de moradores: " + this.qtdMoradores);
        System.out.println("Região: " + this.regiao);
        System.out.println("Ninjas: ");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                System.out.println("--------------------");
                ninjas[i].mostraInfo();
            }
        }
    }

    public void rankingS() {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                if (ninjas[i].ranking.equals("S")) {
                   System.out.println (ninjas[i].nome);
                }
            }
        }
    }

    public void qtdTitulos() {
        int qtdGennin = 0;
        int qtdChunnin = 0;
        int qtdAnbu = 0;
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                switch (ninjas[i].titulo) {
                    case "Genin":
                        qtdGennin++;
                        break;
                    case "Chunnin":
                        qtdChunnin++;
                        break;
                    case "Anbu":
                        qtdAnbu++;
                        break;
                }
            }
        }
        System.out.println("Genins: " + qtdGennin);
        System.out.println("Chunins: " + qtdChunnin);
        System.out.println("Anbus: " + qtdAnbu);
    }


}
