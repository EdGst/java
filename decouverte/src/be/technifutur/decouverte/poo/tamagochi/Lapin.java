package be.technifutur.decouverte.poo.tamagochi;

public class Lapin extends Tama {

    public Lapin(int vie, int humeur, int faim) {
        super(vie, humeur, faim);
    }

    void chasse(){
        System.out.println("Je suis le lapin et je saute");
    }
    void jouer(){
        System.out.println("Je suis un lapin et je joue");
    }


    void dormir() {

    }
}
