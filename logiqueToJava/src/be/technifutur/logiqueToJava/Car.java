package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class Car{
    // Attributs
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructeur
    public Car(String brand, String model, int year) { // même nom que la classe
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Méthodes
    public void start() {
        System.out.println("La voiture " + brand + " " + model + " démarre !");
    }

    public void accelerate(int speedIncrease) {
        this.speed += speedIncrease;
        System.out.println("La voiture " + brand + " " + model + " accélère et roule maintenant à " + speed + " km/h.");
    }

    public void brake(int speedDecrease) {
        this.speed -= speedDecrease;
        System.out.println("La voiture " + brand + " " + model + " ralentit et roule maintenant à " + speed + " km/h.");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("La voiture " + brand + " " + model + " s'arrête.");
    }


}
