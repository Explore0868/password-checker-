import java.util.*;
public class print_user
{
    public static void printer(Map<String,String> map)
    {  int i=1;
        System.out.printf("\n*****THE USERS ID'S*****\n");
        for(String word:map.keySet())
        { 
          System.out.println(i+" "+word);
          i++;
        }
    System.out.printf("\n\n");
    }

    public static void User_change(Scanner input)
    { int nof=1;boolean cond=true;
        System.out.print("\nEnter The Previous User Name And PassWord\n");
        while(nof==1){
        nof=user_name_check.user_Check(input);
        nof=login_check.user_Id_name(user_name_check.user_Name);
        }
        nof=1;
        while(nof==1)
        {
        nof=user_name_check.password_checker(input);
        nof=login_check.user_Id_password(user_name_check.password);
        }
        String New_user=null, word=user_name_check.user_Name;
        while(cond){
        System.out.print("\nEnter New User Name => ");
        New_user=input.nextLine().trim();
        cond=User_check.check(New_user);
        }
        main.dic.remove(word);
        main.dic.put(New_user,user_name_check.password);
        System.out.print("\n Succesfully User Name Changed\n\n");
    }
}