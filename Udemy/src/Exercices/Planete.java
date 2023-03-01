package Exercices;

public class Planete {
    String nom;
    String matiere;
    long diametre;

    void revolution(){
        nom = "Mars";
        System.out.println("Je suis la planéte " + nom + " et je tourne autour de mon étoile.");
    }
    void rotation(){
        nom = "Mars";
        System.out.println("Je suis la planéte " + nom + " et je tourne sur moi-même.");
    }
}
