package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class TestList implements Runnable {
    @Override
    public void run() {

        int position = 1;
        MyList laList = null;

        int taille = longueur(laList);
        System.out.println(taille);
        laList = ajouterDebut(laList, 15);
        taille = longueur(laList);
        System.out.println(taille);

    }

    private MyList sousListe(MyList list, int position) {

        MyList result = null;
        result = new MyList();

        for (int i = 1; i < position; i++) {
            result = result.suivant;
        }
        return result;
    }

    private int longueur(MyList list) {
        int result = 0;

        while (list != null) {
            list = list.suivant;
            result++;
        }
        return result;
    }

    private int lire(MyList list, int position) {
        return sousListe(list, position).valeur;
    }

    private void remplacer(MyList list, int position, int newValeur) {
        sousListe(list, position).valeur = newValeur;
    }

    private MyList ajouterDebut(MyList list, int newValeur) {
        MyList result = new MyList();

        result.valeur = newValeur;
        result.suivant = list;

        return result;
    }

    private MyList ajoutFin(MyList list, int newValeur) {
        MyList result = null;

        if (list == null) {
            result = ajouterDebut(list, newValeur);
        } else {
            result = list;
            while (list.suivant != null) {
                list = list.suivant;
            }
            list.suivant = new MyList();
            list.suivant.valeur = newValeur;
        }
        return result;
    }

    public MyList inserer(MyList list, int position, int valeur) {
        if (position == 1) {
            return ajouterDebut(list, valeur);
        } else if (position > longueur(list)) {
            return ajoutFin(list, valeur);
        } else {
            MyList precedant = sousListe(list, position - 1);
            MyList suivant = precedant.suivant;
            MyList nouveauNoeud = new MyList();
            nouveauNoeud.valeur = valeur;
            nouveauNoeud.suivant = suivant;
            precedant.suivant = nouveauNoeud;
            return list;
        }
    }
    private MyList supprimer(MyList list, int taille) {
        Scanner scan = new Scanner(System.in);
        boolean ok;
        String input;
        int position = -1;
        System.out.println(taille);
        do {
            ok = true;
            try {
                System.out.println("entrez une position");
                input = scan.nextLine();
                position = Integer.parseInt(input) - 1;
            } catch (java.util.InputMismatchException e) {
                System.out.println("veuillez entrer une position entre 1 et " + taille);
                ok = false;
            }
            if (position < 0 || position > taille - 1) {
                System.out.println("veuillez entrer une position entre 1 et " + taille);
                ok = false;
            }
        } while (!ok);
        MyList result = list;
        MyList precedent;
        if (position == 0) {
            result = list.suivant;
        } else {
            precedent = sousListe(list, position - 1);
            precedent.suivant = precedent.suivant.suivant;
        }
        return result;
    }

}
