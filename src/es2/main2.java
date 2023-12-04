package es2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il numero dei km percorsi: ");
        double kmPercorsi = sc.nextDouble();
        System.out.println("Inserisci i litri consumati:");
        double litriConsumati = sc.nextDouble();

        double calcolo= calcolaKm(kmPercorsi,litriConsumati);
        System.out.println("Consumo: "+ calcolo + "km/l");
    }
    private static double calcolaKm(double km, double litri){
        return km/litri;
    }
}
