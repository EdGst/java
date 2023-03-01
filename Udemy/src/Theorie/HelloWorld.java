package Theorie;

public class HelloWorld {
    public static void main(String... args) {


        Voiture voitureDeMichelle = new Voiture();
        voitureDeMichelle.automatique = true;
        voitureDeMichelle.couleur = "jaune";
        voitureDeMichelle.nbPortes =3;

        System.out.println("La voiture de Aziz est "+ voitureDeMichelle.couleur + " et elle a " + voitureDeMichelle.nbPortes + " et elle est "+ voitureDeMichelle.automatique);



        voitureDeMichelle.klaxonner();


    }
}
