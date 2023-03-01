package be.technifutur.decouverte.poo.scenario3;

public class RoiHeenok extends VaisseauAncetre{
    public RoiHeenok() {
        super("RoiHeenok", 0);
    }

    @Override
    public void afficheCamps() {
        System.out.println("Empire Galactique");
    }

    @Override
    public void tirer(){
         System.out.println("Brrr brrr");
         System.out.println("Péter leurs chevilles");
    }
}
