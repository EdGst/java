package be.technifutur.decouverte.poo.scenario2;

public class Scenario2 {
    public static void main(String[] args) {

        System.out.println(VaisseauSecurise.getNbVaisseauAir());

        VaisseauSecurise v1 = new VaisseauSecurise("X-Wing", 5);
        VaisseauSecurise v2 = new VaisseauSecurise("X-Wing", 5);
        VaisseauSecurise v3 = new VaisseauSecurise("Y-wing", 8);
        VaisseauSecurise v4 = new VaisseauSecurise("Y-wing", 8);


        System.out.println(v2.getNom());

        System.out.println(VaisseauSecurise.getNbVaisseauAir());

        v1.decoller();
        v2.decoller();
        v3.decoller();
        v4.decoller();
        System.out.println(VaisseauSecurise.getNbVaisseauAir());


        v3.atterrir();
        System.out.println(VaisseauSecurise.getNbVaisseauAir());



    }
}