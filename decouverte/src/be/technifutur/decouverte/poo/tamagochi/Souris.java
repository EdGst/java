package be.technifutur.decouverte.poo.tamagochi;

public class Souris extends Tama{
    public Souris(int vie, int humeur, int faim) {
        super(vie, humeur, faim);
    }

    void chasse(){
        System.out.println("Je suis la souris et je gratte");
    }
    void jouer(){
        System.out.println("Je suis une souris et je joue");
    }
    void dormir() {

    }
}
