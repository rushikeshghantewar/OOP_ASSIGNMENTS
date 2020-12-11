import  java.util.Scanner;
public class Que15
{
public static void main(String []args)
{
 
   Scanner scan=new Scanner(System.in);
 
System.out.println("Enter MaritalStatus: ");
int age=scan.nextInt();
System.out.println("Enter age: ");
String marital_Status=scan.nextLine();
System.out.println("Enter gender: ");
String gender=scan.nextLine();
   
   if(marital_Status=="married")
   {
    System.out.println("You can not marry!");
   }
   else if(marital_Status=="unmarried")
   {
    if(gender=="male")
    {
      if(age>=21)
          System.out.println("You can marry!");
      else
          System.out.println("You can not marry!");
    }
    else if(gender=="female")
    {
      if(age>=18)
          System.out.println("You can marry!");
      else
          System.out.println("You can not marry!");
    }
    else
          System.out.println("Invalid input Gender");
   }
   else
System.out.println("Invalid input Marital Status ");
   
}
}