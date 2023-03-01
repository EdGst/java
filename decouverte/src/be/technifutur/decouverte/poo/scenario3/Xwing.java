package be.technifutur.decouverte.poo.scenario3;

import java.sql.SQLOutput;

public class Xwing extends VaisseauAncetre{
    public Xwing(int maxMissile) {
        super(makeName(maxMissile), maxMissile);
    }

    private static String makeName(int maxMissile) {
        String name = "Xwing-";
        for (int i = 0; i < maxMissile; i++) {
            name += "o";
        }
        return name;
    }

    @Override
    public void afficheCamps() {
        System.out.println("Alliance rebelle");
    }
}
