package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import java.util.Scanner;

public class IsPalindromeTest
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.printf("\nPodaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst = scn.nextLine();
            if(tekst.equals("0")) break;

            var output = "Tekst: " + tekst + "\n";
            output += (StringFun.isPalindrome(tekst) ? "" : "nie") + "jest palindtomem" + "\n";
            output += "Zamiana wielkich i małych liter co drugą: " + StringFun.anarchize(tekst) + "\n";
            output += "Camelizacja: " + StringFun.camelize(tekst) + "\n";
            output += "DeCamelizacja: " + StringFun.decamelize(tekst) + "\n";
            output += "Shuffle: " + StringFun.shuffle(tekst) + "\n";

            System.out.printf(output);

        } while (true);
    }
}
