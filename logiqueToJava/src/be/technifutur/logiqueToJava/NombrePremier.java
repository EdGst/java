package be.technifutur.logiqueToJava;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class NombrePremier implements Runnable {

    public void

            run() {

        int i = 2;
        int div = 3, nb = 3;
        int choix = 0;
        boolean premier = true;

        Scanner scan = new Scanner(System.in); //
        System.out.println("Combien de valeurs voulez-vous"); // Scanner un nombre
        String input = scan.nextLine(); // Saisir input //
        choix = Integer.parseInt(input);

        long before = System.currentTimeMillis();
        System.out.println("1 : 2");

        while (i <= choix) {
            while (div <= sqrt(nb) && premier) {
                if (nb % div == 0) {
                    premier = false;
                }
                div = div + 2;
            }
            if (premier) {

                System.out.println(i +" : "+nb);
                i++;
            }
            nb = nb + 2;
            div = 3;
            premier = true;
        }
        Long after = System.currentTimeMillis();

        System.out.println("temps d'éxécution : " + (after - before));
    }
}