package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {


    /*public static void main(String[] args) {
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
        for (int i = 0; i < 370; i += 10) {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }
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
        /*Scanner input = new Scanner (System.in);
        int num1 =0, num2 =0;
        do {
            System.out.print("Podaj liczbę, które mam dodać:");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if((num1 == 0)|| (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = 12%d%n", num1, num2, num1 + num2);
        }   while (true);
        */
    // Zadanie 10b

 /*   private static String leftPad(String aText, char aChar, int aWidth_)
    {
        String res = aText;
        for (int i = 0; i < aWidth_ * aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args)
    {
        String BIN;
        String HEX;
        int DEC = 0;
                
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę, którą mam zamienić:");
        DEC = input.nextInt();

        BIN = leftPad(Integer.toBinaryString(DEC), '0', 1);
        HEX = leftPad(Integer.toHexString(DEC), '0',3);
        System.out.printf("Zamiana liczby %d wynosi: DEC = %d, BIN = %s, HEX = %s", DEC, DEC, BIN.toUpperCase(), HEX.toUpperCase());

    }

    public static void main(String[] args)
    {
        int[] liczby = new int[30];
        Random rnd = new Random();

         for(int i =0; i<30; i++)
             liczby[i] = rnd.nextInt();

         int mx = Integer.MIN_VALUE;
         int mn = Integer.MAX_VALUE;
         long avg =0;

         for(int l : liczby)
         {
             System.out.println(l);
             if(l < mn) mn = 1;
             if(l > mx) mx = 1;
             avg += 1;
         }
         System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float)avg/liczby.length);

     }
     */

    public static void main(String[] args)
    {
        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());

        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));

        System.out.printf("%s%n", Account.translit("Рудольф Воробьёв"));
    }
}




