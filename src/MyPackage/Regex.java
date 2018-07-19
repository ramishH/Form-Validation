/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;
import java.util.regex.*;
/**
 *
 * @author VAMPIRE
 */
public class Regex {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
 
    }
    public boolean RegexForEmail(String Str)
    {
        Pattern p=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z.]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m= p.matcher(Str);
        boolean b=m.matches();
        return b;
    }
    public boolean RegexForName(String Str)
    {
        Pattern p=Pattern.compile("(^\\S)[A-Za-z]*");
        Matcher m= p.matcher(Str);
        boolean b=m.matches();
        return b;
    }
    public boolean RegexForPhone(String Str1)
    {
        Pattern p=Pattern.compile("^[0-9]{11,11}|\\+92[0-9]{10,10}$");
        Matcher m= p.matcher(Str1);
        boolean b=m.matches();
        return b;
    }
    public boolean RegexForPassword(String Str1)
    {
        Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\S+$).{8,}$");
        //Pattern p=Pattern.compile("(^([A-Za-z]){10,20})([0-9]{3,10})$");
        Matcher m= p.matcher(Str1);
        boolean b=m.matches();
        return b;
    }
}