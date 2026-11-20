import java.util.*;
public class password_change
{   
    public static void pass_change(Scanner input,Map<String,String> dic)
    {  
        
    boolean cond=true;
    String user_n,new_pass=null,word=null,pass_word;int nof;
        while(cond)
        { nof=0;
            nof=user_name_check.user_Check(input,dic);
            word=user_name_check.user_Name;
            nof=login_check.user_Id_name(user_name_check.user_Name);
            if(nof==1)
             System.out.println("\nNot matched with Logined User Name");
            else cond=false; 
        }
        cond=true;
        while(cond)
        {
            nof=user_name_check.password_checker(input,dic);
            nof=login_check.user_Id_password(user_name_check.password);
            if(nof==1)
            {System.out.println("\nNot matched with Logined Password");continue;}
            System.out.print("Enter The New Password -> ");
            new_pass=input.nextLine();
            cond=password_check.P_check(new_pass);
           
            login_check.userpassword=new_pass;    
        }  
        dic.put(word,new_pass);  
        System.out.print("\n  Succesfully New Password Done\n\n");     
     }
  }
