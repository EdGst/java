package be.technifutur.decouverte.structure;

import java.util.Scanner;

public class Stagiaires {

    public static void main(String[] args) {

        Personne[] stagiaires = new Personne[4];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < stagiaires.length ; i++) {

            stagiaires[i] = new Personne();
            System.out.println("Nom : ");
            stagiaires[i].nom = scan.nextLine();

            stagiaires[i] = new Personne();
            System.out.println("Prénom : ");
            stagiaires[i].prenom = scan.nextLine();

            stagiaires[i].naissance = new MyDate();

            System.out.println("Date de naissance : ");
            System.out.println("Jour : ");
            stagiaires[i].naissance.jour = Integer.parseInt(scan.nextLine());
            System.out.println("Mois : ");
            stagiaires[i].naissance.mois = Integer.parseInt(scan.nextLine());
            System.out.println("An : ");
            stagiaires[i].naissance.an = Integer.parseInt(scan.nextLine());


        }
        for (int i = 0; i < stagiaires.length ; i++) {
            System.out.println(stagiaires[i].nom + " " + stagiaires[i].prenom + " est né le " +
                    stagiaires[i].naissance.jour + "/" + stagiaires[i].naissance.mois + "/" + stagiaires[i].naissance.an);

        }
        for (int i = 0; i < stagiaires.length ; i++) {
            System.out.println(stagiaires[i].nom + " " + stagiaires[i].prenom + " est né le " +
                    stagiaires[i].naissance.jour + "/" + stagiaires[i].naissance.mois + "/" + stagiaires[i].naissance.an);

        }

        for (int i = 0; i < stagiaires.length; i++) {
            System.out.printf("%s %s est né le %d/%d/%d\n", stagiaires[i].nom,
                    stagiaires[i].prenom, stagiaires[i].naissance.jour, stagiaires[i].naissance.mois, stagiaires[i].naissance.an);
        }




    }
}
