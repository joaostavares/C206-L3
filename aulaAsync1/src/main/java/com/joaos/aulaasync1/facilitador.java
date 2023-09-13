package com.joaos.aulaasync1;

public class facilitador {

    //criei um metodo aparte pra evitar que a main esteja muito cheia
    public static Ninja[] autoCriador(){
        Ninja[] ninjasAuto = new Ninja[6];
        Ninja ninja1 = new Ninja("Kakashi Hatake", 30, "Anbu", "S");
        ninjasAuto[0] = ninja1;
        Ninja ninja2 = new Ninja("Naruto Uzumaki", 12, "Genin", "B");
        ninjasAuto[1] = ninja2;
        Ninja ninja3 = new Ninja("Sasuke Uchiha", 12, "Chunnin", "B");
        ninjasAuto[2] = ninja3;
        Ninja ninja4 = new Ninja("Sakura Haruno", 12, "Genin", "B");
        ninjasAuto[3] = ninja4;
        Ninja ninja5 = new Ninja("Asuma Sarutobi", 30, "Anbu", "S");
        ninjasAuto[4] = ninja5;
        Ninja ninja6 = new Ninja("Itachi Uchiha", 25, "Anbu", "S");
        ninjasAuto[5] = ninja6;

        return ninjasAuto;
    }
}
