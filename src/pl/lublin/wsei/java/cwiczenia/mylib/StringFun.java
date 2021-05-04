package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.*;


public class StringFun
{
    public static boolean isPalindrome(String a)
    {
        String[] tekst = a.split("(?!^)");

        for (int i = 0; i < tekst.length; i++)
        {
            if (!tekst[i].toLowerCase().equals(tekst[tekst.length-i-1].toLowerCase()))
            {
                return false;
            }
        }
        return true;
    }

// 2a
    public static String anarchize(String a)
    {
        Boolean startFromLower = false;
        String[] tekst = a.split("(?!^)");

        if(tekst[0].toLowerCase() == tekst[0])
        {
            startFromLower = true;
        }

        for (int i = 0; i < tekst.length; i++) {
            if (startFromLower)
            {
                if(i%2>0)
                {
                    tekst[i] = tekst[i].toLowerCase();
                }
                else
                    {
                        tekst[i] = tekst[i].toUpperCase();
                    }
            }
            else
                {
                    if(i%2>0)
                    {
                        tekst[i] = tekst[i].toUpperCase();
                    }
                    else
                        {
                            tekst[i] = tekst[i].toLowerCase();
                        }
                }

        }
        return StringUtils.join(tekst,' ');
    }
// 2b
    public static String camelize (String a)
    {
        a = StringUtils.normalizeSpace(a);
        String[] tekst = a.split(" ");

        for (int i = 0; i < tekst.length; i++) {
            if(i == 0)
            {
                tekst[0] = tekst[0].toLowerCase();
            }
            else
                {
                    tekst[i] = tekst[i].toLowerCase();
                    String[] tempString = tekst[i].split("(?!^)");
                    tempString[0] = tempString[0].toUpperCase();
                    tekst[i] = StringUtils.join(tempString, "");
                }
        }
        return StringUtils.join(tekst,"");
    }
    //2c
    public static String decamelize (String a)
    {
        String output = "";
        List<Integer> list = new ArrayList<Integer>();
        String[] tekst = a.split("");

        for(int i = 0; i < a.length();i++)
        {
            if(Character.isUpperCase(tekst[i].charAt(0)))
            {
                list.add(i);
            }
        }

        int lastFirstLetterIndex = 0;
        for(int i = 0; i <= list.size();i++)
        {
            if(i == list.size())
            {
                output += a.substring(lastFirstLetterIndex);
                break;
            }
            else
                {
                    output += a.substring(lastFirstLetterIndex, list.get(i));
                    lastFirstLetterIndex = list.get(i);
                }
            output += " ";
        }

        return Account.capitalize(output);
    }

    public static String shuffle(String val)
    {
        Random rnd = new Random();
        List<String> txt = new LinkedList<String>(Arrays.asList(val.split("").clone()));
        String output = "";

        for(int i = 0; i < val.length();i++)
        {
            var position = rnd.nextInt(txt.size());
            output += txt.get(position);
            txt.remove(position);
        }

        return output;
    }
}
