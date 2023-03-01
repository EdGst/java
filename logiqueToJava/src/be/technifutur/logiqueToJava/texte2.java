package be.technifutur.logiqueToJava;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class texte2 implements Runnable {

    public void run() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez saisir un mot :");
        String texte = scan.nextLine();
        System.out.println("Vous avez saisi : " + texte);

        String[] tabTexte = texte.split(" ");

        int longMot = 0;
        int cpt = 1;

        System.out.println("\n\n\n");

        while (cpt <= 3)

        {
            if (cpt % 2 != 0) {
                for (int i = 0; i < tabTexte.length; i++) {
                    System.out.print("+");
                    longMot = tabTexte[i].length();
                    for (int k = 0; k < longMot; k++) {

                        System.out.print("-");
                    }

                }
                System.out.print("+");
            } else {
                for (int i = 0; i < tabTexte.length; i++) {

                    System.out.print("|" + tabTexte[i]);
                    if (i == tabTexte.length - 1) {
                        System.out.print("|");
                    }

                }
            }
            System.out.println();

            cpt++;
        }

        System.out.println("\n\n\n");
        System.out.println(longMot);
    }
}