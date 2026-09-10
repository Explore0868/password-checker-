import java.util.*;
public class user_name_check
{   
    static int nof=0;public static String user_Name,password;

    static class user_Name_checkException extends Exception
    {
        user_Name_checkException()
        {
          System.out.println("\n\tError : user_Name_checkException\n");
        }
    } 
    public static int  user_Check(Scanner input)
    {   nof=0;
        System.out.print("\nEnter The User Name -> ");
        user_Name=input.nextLine();
    
                if(!main.dic.containsKey(user_Name))
                { try{ nof=1;throw new user_Name_checkException();}
                   catch(user_Name_checkException e)
                   { 
                    System.out.print("\t-> No Such User Name Found\n");
                   }
                }
       return nof;
    } 
    public static int password_checker(Scanner input)
    { nof=0;
    System.out.print("\nEnter The Password -> ");
        password=input.nextLine();
        if(!main.dic.containsValue(password))
                {
                    try{nof=1;throw new user_Name_checkException();}
                    catch(user_Name_checkException e)
                    {System.out.print("\nNo Such Password Found\n");}
                }
        return nof;
    }           
}