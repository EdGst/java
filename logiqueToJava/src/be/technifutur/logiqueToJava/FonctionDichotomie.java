package be.technifutur.logiqueToJava;

public class FonctionDichotomie {

    public static int dichotomie (int[] tab, int nbr){

        int i = 0;
        int moitie = 0;
        int fin;
        int pos = -1;

        fin = tab.length-1;

        while (i < fin) {
            moitie = (i + fin) / 2;
            if (nbr > tab[moitie]) {
                i = moitie + 1;
            } else {
                fin = moitie;
            }
        }

        if (tab[fin] == nbr) {
            pos = i;
        }
        return pos;
    }

    public static int position (int[] tab, int nbr){


        int pos = -1;
        boolean present = false;

        for (int i = 0; i < tab.length && present == false ; i++) {
            if (tab[i] == nbr){
                pos = i;
                present = true;
            }
        }


        return pos;
    }
}
