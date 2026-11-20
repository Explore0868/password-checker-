import java.util.*;
public class register 
{   static class pass_Exception extends Exception
     {
       pass_Exception()
       {System.out.print("\n\tError : pass_Exception\n");}
     }
    
    public static void new_user(Scanner input,Map<String,String> dic)
    {   String user_name=null,p_w=null,re_pw,save_no=null;
       boolean cond=true;int nof=0;
       while(cond){
        System.out.print("\n****Enter The User_Name**** -> ");
        
        user_name=input.nextLine().trim();
        cond=User_check.check(user_name);
        }
        cond=true;
          while(cond){
        System.out.print("\n****Enter The Password**** -> ");
        p_w=input.nextLine();
        cond=password_check.P_check(p_w);
         if(cond)
          continue;
        System.out.print("\n****Re-Enter Password**** -> ");
        re_pw=input.nextLine();
        if(!p_w.equals(re_pw))
         { System.out.printf("\nRe-Entered Password Incorrect\n");
         cond=true;}
        else
         cond=false;
       }
       cond=true;
       while(cond)
       {nof=0;
        System.out.print("\nDo You Want To save -> ");
        save_no=input.nextLine();
        if(!(save_no.equalsIgnoreCase("save") || save_no.equalsIgnoreCase("no")|| save_no.equalsIgnoreCase("yes")))
          {try{nof=1;
            throw new pass_Exception();
          }
          catch(pass_Exception e)
          {
            System.out.printf("\t%s ! equals save || no",save_no);
          }
          }
        if(nof!=1)
        cond=false;
       }
      if(save_no.equals("save")||save_no.equals("yes"))
      { dic.put(user_name,p_w);
        System.out.print("\n    Sussefully registered\n\n");}
      
    }
}