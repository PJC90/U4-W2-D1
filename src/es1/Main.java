package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        //creo un array di numeri interi di 5 elementi
        int[] numeriInteri = new int[5];
        // con un ciclo for ad ogni posizione dell'array vado a inserire un numero random
        for (int i = 0; i < numeriInteri.length; i++){
            numeriInteri[i] = rm.nextInt(1,11);
            System.out.println(numeriInteri[i]);
        }
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Inserisci la posizione da 1 a 5");
            try {
                int posizione = Integer.parseInt(sc.nextLine())-1;
                //fai hover su parseInt vedrai throw NumberFormatException
                System.out.println(numeriInteri[posizione]);
                System.out.println("Inserisci un valore da inserire nella posizione selezionata");
                int valore = Integer.parseInt(sc.nextLine());
                if(valore == 0) break;
                numeriInteri[posizione] = valore;

                System.out.println(Arrays.toString(numeriInteri));
            }catch (NumberFormatException ex){
                System.err.println("Non hai inserito un valore numerico");
            }catch (ArrayIndexOutOfBoundsException ex){
                System.err.println("hai inserito un valore fuori range");

            }
        }

//        sc.close();
    }





}