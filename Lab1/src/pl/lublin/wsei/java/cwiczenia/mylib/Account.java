package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account
{
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    private String name;

    public void setName(String name)
    {
        this.name = capitalize(name);
    }

    public String getName()
    {
        return name;
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
        {
            tokens[i] = tokens[i].toLowerCase();
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }

        return StringUtils.join(tokens,' ');
    }

    public static String translit(String arg)
    {
        String output = "";
        String caseLowered = arg.toLowerCase();
        for(int i = 0; i < arg.length(); i++)
        {
            char ch = caseLowered.charAt(i);
            int charPos = ukrAlphabet.indexOf(ch);
            if(charPos != -1)
            {
                output += translitRepl[charPos];
            }
            else {
                output += ch;
            }
        }

        output = capitalize(output);

        return output;
    }
}
