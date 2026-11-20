import java.util.*;
public class password_check
{
    static class pass_Exception extends Exception 
    {
        pass_Exception()
        {System.out.print("\n\tError : password_Exception");}
    }

    public static boolean P_check(String word)
    {   
        char c=word.charAt(0);int nof=0,n=word.length();
        if(!(Character.isUpperCase(c) && (word.indexOf("_")!=-1 || word.indexOf("@")!=-1) && n>8&&n<16))
        {
            try{nof=1;
                throw new pass_Exception();
               }
            catch(pass_Exception e){
                System.out.print("\n\tCase ::\n\t1 -> First Letter Captial\n\t-> Must be @,_\n\t-> Must be length >8 and <16\n\n");
            }
        }
        if(n>16)
        {
            try{nof=1;
                throw new pass_Exception();
            }
            catch(pass_Exception e){
                System.out.print("\n\tCase :word length <16");
            }
        }
        if(nof!=1)
        return false;
        return true;
    }
}