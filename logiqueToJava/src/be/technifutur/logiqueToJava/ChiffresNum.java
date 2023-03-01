package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class ChiffresNum implements Runnable {

    public void run() {

        System.out.println("\n\n\n"); // passage de ligne à l'affichage

        // Variables
        int nbr;
        int mod;

        // Saisie utilisateur
        Scanner scan = new Scanner(System.in); ///
        System.out.println("Saisir un chiffre à afficher en numérique : "); /// Scanner un nombre
        String input = scan.nextLine(); // Saisir input ///
        nbr = Integer.parseInt(input);

        int taille = input.length();
        int[] tab = new int[taille];
        for (int i = taille - 1; i >= 0; i--) {

            mod = nbr % 10;
            tab[i] = mod;
            nbr = nbr / 10;

        }

        for (int i = 0; i < taille; i++) {
            System.out.print(tab[i]);
        }

        System.out.println();

        String[][] affChiffre = affichageNum();
        int choix = 0;

        for (int k = 0; k < 3; k++) { // boucle sur chaque ligne
            for (int i = 0; i < taille; i++) { // boucle sur chaque chiffre
                choix = tab[i];

                System.out.print(affChiffre[choix][k] + "  "); // affichage de la ligne k du chiffre i
            }
            System.out.println(); // passage à la ligne suivante
        }
        System.out.println("\n\n\n");
    }

    public String[][] affichageNum() {
        String[][] chiffre = new String[10][3];

        chiffre[1] = """
                  |
                  |
                  |
                """.split("\n");

        chiffre[2] = """
                 ___ 
                  __|
                |___ 
                """.split("\n");

        chiffre[3] = """
                 ___ 
                  __|
                 ___|
                """.split("\n");

        chiffre[4] = """
                |   |
                |___|
                    |
                """.split("\n");

        chiffre[5] = """
                 ___  
                |___  
                 ___|
                """.split("\n");
        chiffre[6] = """
                  ___ 
                 |___ 
                |___|
                """.split("\n");

        chiffre[7] = """
                 ___ 
                   _|
                    |
                """.split("\n");

        chiffre[8] = """
                 ___ 
                |___|
                |___|
                """.split("\n");

        chiffre[9] = """
                  ___ 
                 |___|
                 ___|
                """.split("\n");
        chiffre[0] = """
                 ___ 
                |   |
                |___|
                """.split("\n");

        return chiffre;

    }
}

