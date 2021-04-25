package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s=%20s %n", a, b, s);

        System.out.print("Nazywaliśmy to \" witaminą B3 \" ");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

        // zadanie 8
        /*
        Scanner input = new Scanner (System.in);
        int num1, num2;
        System.out.print("Podaj pierwszą liczbę:");
        num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę:");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2);
        */

        // zadanie 9)
        Scanner input = new Scanner (System.in);
        int num1 =0, num2 =0;
        do {
            System.out.print("Podaj liczbę, które mam dodać:");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if((num1 == 0)|| (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        }   while (true);
        // Zadanie 10

    }

}
