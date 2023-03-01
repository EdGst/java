package Exercices;

public class HelloUniverse {
    public static void main(String... args) {

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre = 4880;
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100;
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142894;
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536;
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118;
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532;

        Planete planeteX = new Planete();

        mars.rotation();
        mars.revolution();

        neptune.rotation();
        neptune.rotation();



    }
}