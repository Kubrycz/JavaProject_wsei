package pl.lublin.wsei.java.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc = 8;
    private Boolean maleLitery = true;
    private Boolean wielkieLitery = false;
    private Boolean cyfry = false;
    private Boolean znakiSpecjalne = false;
    private Character[] dozwoloneZnakiSpecjalne = new Character[] { '/' , ':'};

    public StrongPasswordGenerator(int dlugosc, Boolean maleLitery, Boolean wielkieLitery, Boolean cyfry, Boolean znakiSpecjalne, Character[] dozwoloneZnakiSpecjalne)
    {
        this.dlugosc = dlugosc;
        this.cyfry = cyfry;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public StrongPasswordGenerator(int dlugosc, Boolean maleLitery, Boolean cyfry)
    {
        this.dlugosc = dlugosc;
        this.cyfry = cyfry;
        this.maleLitery = maleLitery;
    }

    public StrongPasswordGenerator()
    {
    }

    public int getDlugosc() { return this.dlugosc; };
    public void setDlugosc(int val) { this.dlugosc = val; };

    public Boolean getMaleLitery() { return this.maleLitery; };
    public void setMaleLitery(Boolean val) { this.maleLitery = val; };

    public Boolean getWielkieLitery() { return this.wielkieLitery; };
    public void setWielkieLitery(Boolean val) { this.wielkieLitery = val; };

    public Boolean getCyfryLitery() { return this.cyfry; };
    public void setCyfryLitery(Boolean val) { this.cyfry = val; };

    public Boolean getZnakiSpecjalne() { return this.znakiSpecjalne; };
    public void setZnakiSpecjalne(Boolean val) { this.znakiSpecjalne = val; };

    public Character[] getDozwoloneZnakiSpecjalne() { return this.dozwoloneZnakiSpecjalne; };
    public void setZnakiSpecjalne(Character[] val) { this.dozwoloneZnakiSpecjalne = val; };

    public String generate()
    {
        String output = "";
        List<Integer> allowedChars = new ArrayList<>();

        if(maleLitery)
        {
            allowedChars.addAll(getRangeOfNumbers(97,122));
        }
        if(wielkieLitery)
        {
            allowedChars.addAll(getRangeOfNumbers(65,90));
        }
        if(cyfry)
        {
            allowedChars.addAll(getRangeOfNumbers(48,57));
        }
        if(znakiSpecjalne)
        {
            for(int i = 0; i < dozwoloneZnakiSpecjalne.length; i++)
            {
                allowedChars.add((int)dozwoloneZnakiSpecjalne[i]);
            }
        }

        Random rnd = new Random();
        for(int i = 0; i < dlugosc;i++)
        {
            var ch = (char)((int)allowedChars.get(rnd.nextInt(allowedChars.size())));
            output += ch;
        }

        return output;
    }

    private List<Integer> getRangeOfNumbers(int lowerBound, int higherBound)
    {
        List<Integer> output =  new ArrayList<>();

        for(int i = 0; i < higherBound - lowerBound;i++)
        {
            output.add(lowerBound+i);
        }

        return output;
    }
}
