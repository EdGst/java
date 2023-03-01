package be.technifutur.decouverte.poo.scenario4;

public class Sith extends Empire implements Force {
    public Sith(String nom) {
        super(nom);
    }
    @Override
    public void combattre() {
        System.out.println("Je combats comme un sith.");
    }
    @Override
    public void utiliseForce() {
        System.out.println("Je suis un sith, et j'utilise le côté obscur");
    }
}
