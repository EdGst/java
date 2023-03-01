package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class ClasseTest implements Runnable {

    public void run() {
        String[][] chiffre = new String[10][3];

        chiffre[8] = """
                 _.
                |_|
                |_|
                """.split("\n");
        chiffre[2] = """
                 _.
                 _|
                |_
                """.split("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(chiffre[8][i] + "  " + chiffre[2][i]);
        }
    }
}