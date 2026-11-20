import java.util.*;
public class password_forgot
{
    public static void forgot(Scanner input,Map<String,String> dic)
    {  boolean cond=true;
    String new_password=null,word;
        while(cond){
       
         int nof=user_name_check.user_Check(input,dic);
         nof=login_check.user_Id_name(user_name_check.user_Name);
         if(nof==0){ cond=false;}
         else System.out.println("\n Not Matched with Login User_Name ");
        }
        cond=true;
        while(cond)
        {   
            System.out.print("Enter The New Password -> ");
            new_password=input.nextLine();
            cond=password_check.P_check(new_password);
        }
       word=user_name_check.user_Name;             
       login_check.userpassword=new_password;      //Changed the Loinged password
       dic.put(word,new_password);
       System.out.print("\n    sussesfully new password genrated\n\n");


    }
}