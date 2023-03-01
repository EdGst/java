package be.technifutur.logiqueToJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static be.technifutur.logiqueToJava.FonctionDichotomie.dichotomie;
import static be.technifutur.logiqueToJava.FonctionDichotomie.position;

public class TableauDichotomie implements Runnable {

    public void run() {

        int taille;


        Scanner scan = new Scanner(System.in);         /// Saisie de la taille du tableau
        System.out.println("Taille du tableau ?");     /// Scanner un nombre
        String input = scan.nextLine();                // Saisir input             ///
        taille = Integer.parseInt(input);

        int[] tab = new int[taille];

        int nbr;
        Scanner scannbr = new Scanner(System.in);      /// Saisie du nombre à rechercher
        System.out.println("Nombre à rechercher ?");     /// Scanner un nombre
        String inputnbr = scan.nextLine();             /// Saisir input             ///
        nbr = Integer.parseInt(inputnbr);

        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(200);

        }

        Arrays.sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("La position du nombre : " + dichotomie(tab, nbr));
        System.out.println();
        System.out.println("La position(v2) du nombre: " + position(tab,nbr));


        System.out.println("\n\n\n");

    }
}