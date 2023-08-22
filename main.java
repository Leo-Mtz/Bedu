//number guessing game

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Random random= new Random();

        int alt= random.nextInt(100);  //se pone el limite dentro del parentesis
        System.out.println(alt);
        Scanner scanner= new Scanner(System.in);

        System.out.println("Escribe un numero entre 0-100 ");
        int num= scanner.nextInt();

        if (num<alt)
        {
            System.out.println("Intenta un numero más alto");
        } else if (num>alt) {
            System.out.println("Intenta un numero mas bajo");

        }

        if (num==alt){
            System.out.println("Congrats youve won");
        }

        else{
            System.out.println("Mejor suerte para la proxima");
        }

    }
}
