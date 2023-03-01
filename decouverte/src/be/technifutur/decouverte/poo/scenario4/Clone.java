package be.technifutur.decouverte.poo.scenario4;

public class Clone extends Empire{
    private static int nbClones =1;
    public Clone() {
        super("Clone"+nbClones);
        nbClones++;
    }

    @Override
    public void combattre() {
        System.out.println("Je combats comme un clone");
    }

}
