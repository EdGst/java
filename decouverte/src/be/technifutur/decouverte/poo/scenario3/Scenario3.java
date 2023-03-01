package be.technifutur.decouverte.poo.scenario3;

public class Scenario3 {
    public static void main(String[] args) {

    Millenium m = new Millenium();
    Xwing x1 = new Xwing(12);
    Xwing x2 = new Xwing(12);


    x1.addMissile(3);

    RoiHeenok roiHeenok = new RoiHeenok();

        x1.decoller();
        m.decoller();
        roiHeenok.decoller();

        EtoileNoire en = new EtoileNoire();
        System.out.println("----------------------------------");
        en.attireVaisseau(x1);
        System.out.println("----------------------------------");
        en.attireVaisseau(m);
        System.out.println("----------------------------------");
        en.attireVaisseau(roiHeenok);
        System.out.println("----------------------------------");

        roiHeenok.tirer();

    }
}