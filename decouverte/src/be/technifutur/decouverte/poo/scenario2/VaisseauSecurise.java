package be.technifutur.decouverte.poo.scenario2;

public class VaisseauSecurise {


    //variable d'instance contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type

    private String nom = "OVNI"; // nom privé, on peut pas le modifier ensuite
    private int nbMissile;
    private boolean auSol = true;
    private final int maxMissile;
    public static int nbVaisseauAir; // variable de classe partagée


    //constructeur : quand on appelle un nouveau vaisseau, il faudra entrer impérativement les
            // paramètres qui sont entre ()
    public VaisseauSecurise(String nom, int maxMissile) {
        // Objects.nonNull(nom);
        if (nom != null && !nom.isBlank()){
            this.nom = nom;
        }
        this.maxMissile = maxMissile;
    }

    //méthode d'instance
    public void tirer() {
        if (this.nbMissile > 0) {
            System.out.println("PAN");
            this.nbMissile--;
        } else System.out.println("POUF");
    }
    public int getNbMissile() {
        return this.nbMissile;
    }
    public boolean removeMissile(int nbMissile) {
        if (nbMissile > 0 && this.nbMissile >= nbMissile) {
            this.nbMissile -= nbMissile;
            return true;
        }
        return false;
    }
    public boolean addMissile(int nbMissile) {
        if (nbMissile > 0 && this.nbMissile <= this.maxMissile) {
            this.nbMissile += nbMissile;
            return true;
        }
        return false;
    }
    public void decoller() {
        if (auSol) {
            System.out.println("Je suis le vaisseau " + nom + ", je suis au sol, je décolle.");
            VaisseauSecurise.nbVaisseauAir++;
            auSol = false;
        } else {
            System.out.println("Je suis le vaisseau " + nom + ", je suis déjà en l'air.");
        }

    }
    public void atterrir() {
        if (!auSol) {
            System.out.println("Je suis le vaisseau " + nom + ", je suis en l'air, je vais attérir.");
            VaisseauSecurise.nbVaisseauAir--;
            auSol = true;
        } else {
            System.out.println("Je suis le vaisseau " + nom + ", je suis déjà au sol.");
        }
    }
    public static int getNbVaisseauAir() {
        return VaisseauSecurise.nbVaisseauAir;
    } // static = méthode de classe
    public String getNom() {
        return this.nom;
    }
}