package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class Texte implements Runnable {

    public void run() {

        Scanner scan = new Scanner(System.in);
        int cpt = 0;
        int premierpos = 0;
        int dernierpos = 0;

        System.out.println("Veuillez saisir un mot :");
        String texte = scan.nextLine();
        System.out.println("Vous avez saisi : " + texte);

        int longueurtexte = texte.length();

        System.out.println("Veuillez saisir un caractère :");
        char caract = scan.nextLine().charAt(0);
        System.out.println("Vous avez saisi : " + caract);

        for (int i = 0; i < longueurtexte; i++) {
            if (texte.charAt(i) == caract) {
                cpt++;

                if (cpt == 1) {
                    premierpos = i;
                }

                dernierpos = i;
            }
        }

        System.out.println("La lettre se trouve en position : " + premierpos);
        System.out.println("La lettre se trouve en position : " + dernierpos);

    }
}