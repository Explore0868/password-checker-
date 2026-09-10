import java.util.*;
public class User_check
{  
   static class UserException extends Exception
   {
     UserException()
     {System.out.print("\n\tError : UserException");}
   }
   public static boolean check(String word)
   {  
      int n=word.length(),nof=0;
      if(word==null || word.isEmpty())
      {System.out.printf("\n go on\n");}
      char c=word.charAt(0);
      if(!(Character.isUpperCase(c) && n>8&&n<16) || word.matches(".*[@._#$].*")  )
      {
        try{nof=1;
          throw new UserException();
        }
        catch(UserException e){
          System.out.println("\n\tCase :\n\t1.FirstLetter Captial\n\t2.minimum 8 charecter\n\t3.Dont Mention =>\"@\",\".\",\"_\",\"$\" ");
        }
      }
      if(nof==1)
      return true;
      return false;
   }
}