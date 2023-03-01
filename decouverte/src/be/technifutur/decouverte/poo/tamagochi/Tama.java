package be.technifutur.decouverte.poo.tamagochi;

public abstract class  Tama  {

//--------------------------------- VARRIABLE
    private int vie;
    public int maxVie;
    private int humeur;
    public int maxHumeur;
    private int faim;
    public int maxFaim;

//----------------------------  CONSTRUCTEUR
    public Tama(int vie, int humeur, int faim){
        if (vie < 1 || vie > 100){
            this.vie = 100;
        } else {
            this.vie = vie;
        }

        this.humeur = humeur;
        this.faim = faim;

    }

//---------------------------------- METHODE
    void manger(){
    }
    void jouer(){
        System.out.println("Je joue");
    }
    abstract void dormir();
    public void getVie(){
        System.out.println(vie);
    }
    protected void addVie(int addVie){
        this.vie = vie + addVie;
    }
    public void getFaim() {
        System.out.println(faim);
    }
}