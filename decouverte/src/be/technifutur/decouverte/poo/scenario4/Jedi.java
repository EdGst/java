package be.technifutur.decouverte.poo.scenario4;

public class Jedi extends Rebelle implements Force{

    public Jedi(String nom) {
        super(nom);
    }
    @Override
    public void utiliseForce() {
        System.out.println("Je suis un jedi, et j'utilise le côté clair");
    }
    @Override
    public void combattre() {
        System.out.println("Je combats comme un jedi.");
    }
}
