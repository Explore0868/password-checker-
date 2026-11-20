import java.util.*;
public class login_check
{   static String username=null,userpassword=null;
    public static boolean user_login_check(int check)
    {
      if(check==1)
       {System.out.println("\nYou Havent Logined At\n");
       return false;
       }
      return true;
    }
    public static int logincheck(Scanner input)
    { String user_N,password;boolean cond=true;int nof=0;
      while(cond)
    { nof=0;
      nof=user_name_check.user_Check(input,main.dic);
      if(nof==1)
      { System.out.println("User Name is Incorrect ");
      continue;
      }
      username=user_name_check.user_Name;
      nof=user_name_check.password_checker(input,main.dic);
      if(nof!=1)
      { userpassword=user_name_check.password;
        cond=false; System.out.print("\n    logined Sussesfully\n\n");
    }
   } 
   return nof;
   }
   public static int user_Id_name(String word)
   {
      if(!word.equals(username)) return 1;

      return 0;
   }
   public static int user_Id_password(String word)
   {
    if(!word.equals(userpassword)) return 1;

    return 0;
   }

}
