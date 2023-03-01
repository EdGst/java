package be.technifutur.decouverte.poo.scenario3;

public class EtoileNoire {
    public void attireVaisseau(VaisseauAncetre v){
        if (v instanceof Millenium) {
            Millenium m = (Millenium) v;
            attireVaisseau(m);
        } else if(v instanceof Xwing)  {
            attireVaisseau((Xwing) v);
        } else {
            v.atterrir();
            System.out.println("Vaisseau attiré");
            v.afficheCamps();
            v.decoller();
        }
    }

    public void attireVaisseau(Xwing x){
        x.atterrir();
        System.out.println("Vaisseau attiré");
        x.afficheCamps();
        System.out.println("A vos ordres RoiHeenok");
        x.decoller();
    }
    public void attireVaisseau(Millenium m){
        m.atterrir();
        System.out.println("Vaisseau attiré");
        m.afficheCamps();
        System.out.println("A l'aide Alkapote");
        m.decoller();
        m.addMissile(10);
        m.tirer(5);
    }
}
