package be.technifutur.decouverte.poo.tamagochi;

public class Tamagochi {
    public static void main(String[] args) {

    Ours ours = new Ours(80, 30, 20);
    Lapin lapin = new Lapin(50,15,5);
    Souris souris = new Souris(15,1,3);

    ours.chasse();
    ours.jouer();
    System.out.print("Vie de l'ours : " );
    ours.getVie();
    ours.getFaim();
    ours.dormir();
    System.out.print("Vie de l'ours : " );
    ours.getVie();

    System.out.println("-----------------------------------------");

    lapin.jouer();
    lapin.getVie();

    souris.jouer();

    }


}