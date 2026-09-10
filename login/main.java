
import java.util.*;
public class main
{    public static Map<String,String> dic=new LinkedHashMap<>();
     static Scanner input=new Scanner(System.in);
     static int nof;

    public static class mainException extends Exception
    {  mainException()
       { System.out.println("\n\tError : mainEception \n");}
       static void string_val()
       {System.out.println("\tChoice is ! single num\n");}
       static void longnum(int num)
       {nof=1;System.out.printf("\t%d is wrong !\n",num);}
    }
   
    public static void main(String[] x)
    {   String choice,save_no;
        int num=0,login_c=1;
        System.out.println("\nType \"Exit\" If You Want To Exit\n");
        while(true)
        {    nof=0;
            System.out.print("1.Register\n2.Login\n3.Change-PassWord\n4.Forgot-PassWord\n5.User_name Change\n6.print\nEnter Your Choice => ");
            choice=input.nextLine();
            if(choice.equalsIgnoreCase("exit"))
                  break;
            if(choice.matches("\\d+"))
             num=Integer.parseInt(choice);
            else
             {  try{nof=1;
                throw new mainException();}
                catch(mainException e)
                { mainException.string_val();}
             }
             if(nof!=1)
             switch(num)
             {
                case 1->
                {  register.new_user(input);}
                case 2->{
                    if(dic.size()==0) System.out.println("\n\"Zero\" Register's Found\n");
                    else login_c=login_check.logincheck(input);
                }
                case 3->{
                    if(login_check.user_login_check(login_c))
                    password_change.pass_change(input);
                }
                case 4->{
                    if(login_check.user_login_check(login_c))
                    password_forgot.forgot(input);
                }
                case 5->{
                    if(login_check.user_login_check(login_c))
                    print_user.User_change(input);
                }
                case 6->{print_user.printer(dic);}
                default ->{ 
                    try{ 
                        throw new mainException();}
                    catch(mainException e)
                    {mainException.longnum(num);}
                    
                }
             }
        }
    }
}