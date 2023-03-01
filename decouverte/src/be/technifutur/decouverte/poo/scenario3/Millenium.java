package be.technifutur.decouverte.poo.scenario3;

public class Millenium extends VaisseauAncetre {

    public Millenium() {
        super("Millenium", 10);
    }

    //overloading
    public void tirer(int nbMissile){ //tirs en rafale brr brrr
        for (int i = 0; i < nbMissile ; i++) {
            super.tirer();
        }
    }

    @Override
    public void afficheCamps() {
        System.out.println("Alliance rebelle");
    }
}
