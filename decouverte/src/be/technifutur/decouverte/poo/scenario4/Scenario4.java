package be.technifutur.decouverte.poo.scenario4;


public class Scenario4 {
    public static void main(String[] args) {

        Personnage[] pers = {
                new Soldat("Léon"),
                new Jedi("Luke"),
                new Sith("Dark Maul"),
                new Clone(),
                new Clone(),
                new Clone()
        };


        Force f;

         for(Personnage p :pers){
            System.out.println(p.getNom());
            System.out.println(p.getCamp());
            if (p instanceof Force){
                f= (Force) p;
                ((Force) p).utiliseForce();
            }
            p.combattre();
             System.out.println("----------------------------------");
        } // Boucle affichant les informations par personnage
    }
}
