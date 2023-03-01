package be.technifutur.decouverte.poo.scenario4;

public abstract class Personnage {

    // Variables d'instances
    private  String nom;


    // Constructeur

    public Personnage(String nom){
        this.nom = nom;
    }

    // méthode d'instance

    public void tuer(){
    }

    public String getNom() {
        return nom;
    }
    public abstract String getCamp();
    public abstract void combattre();


    /*public int getIndex() {
        return index;
    }*/
}

