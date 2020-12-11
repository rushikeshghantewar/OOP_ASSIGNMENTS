package RoughWork;
import java.util.Scanner;
 class Bankdetails123 {
	
	String name="ICICI";
	String Id="ICICI0077";
	String branch="PUNE";
        Bankdetails123(String n,String i,String b)
        {
        name=n;
        Id=i;
        branch=b;
        }
	void details_b()
        {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter bank details:");
        name=sc.nextLine();
        Id=sc.nextLine();
        branch=sc.nextLine();
		//System.out.println("Banking here");
	}
        void Display()
        {
        System.out.println("name"+name);
        System.out.println("Id"+Id);
        System.out.println("branch"+branch);
        
        }
}
class Customer1 extends Bankdetails123
{
//	String c_name ="mayur jaiswal";
//	String ac_no ="456312465";
//	String acc_type ="Saving";
    String c_name;
    String ac_no;
    String acc_type;
    
        Customer1(String n, String a,String at)
        { 
           
            c_name=n;
            ac_no=a;
            acc_type=at;
      
        }

    void details_c()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer details:");
        c_name=sc.nextLine();
        ac_no=sc.nextLine();
        acc_type=sc.nextLine();
    	//System.out.println("customer here");
    }
    void Display1()
        {
        System.out.println("name"+c_name);
        System.out.println("acc no"+ac_no);
        System.out.println("acc_type"+acc_type);
        }
    
}
class BankCustDemo{
    
	public static void main(String[] args)
	{
            
            Scanner sc=new Scanner(System.in);
        
        System.out.println("enter bank details:");
        String name=sc.nextLine();
        String Id=sc.nextLine();
        String branch=sc.nextLine();
        System.out.println("enter customer details:");
        String c_name=sc.nextLine();
        String ac_no=sc.nextLine();
        String acc_type=sc.nextLine();
    	
            
		 Bankdetails123 c=new Bankdetails123(name,Id,branch);
                 c.Display();
                 Customer1 c1=new Customer1(c_name,ac_no,acc_type);
                 c1.Display1();
		
		
	}
}