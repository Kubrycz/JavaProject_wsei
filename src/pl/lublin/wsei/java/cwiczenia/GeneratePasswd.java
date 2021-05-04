package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class GeneratePasswd {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        StrongPasswordGenerator passwdGenerator = new StrongPasswordGenerator(16, true, true,true,true,new Character[]{'!', '@', '$', '#', '^', '&'});
        var output = passwdGenerator.generate();
        System.out.printf(output);
        scn.nextLine();
    }
}
