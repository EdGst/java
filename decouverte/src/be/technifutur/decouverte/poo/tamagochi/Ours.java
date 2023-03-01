package be.technifutur.decouverte.poo.tamagochi;

public class Ours extends Tama {

    public Ours(int vie, int humeur, int faim) {
        super(vie, humeur, faim);
        this.maxVie = 150;
        this.maxHumeur = 100;
        this.maxFaim = 80;
    }


    void chasse(){
        System.out.println("Je suis l'ours et je chasse");
    }
    void jouer(){
        System.out.println("Je suis un ours et je joue");
    }
    void dormir(){
        System.out.println("je suis l'ours et je dors");
        this.addVie(10);
    }

}
