package RoughWork;
import java.util.Scanner;
class Employee
{
    int emp_id;
    String emp_name;
    String designation;
    
    void accept()
    {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employee id,name,Designation:");
    emp_id=sc.nextInt();
    emp_name=sc.next();
    designation=sc.next();
   
    }
    
    void Display()
    {
    System.out.println("Employee ID:"+emp_id);
    System.out.println("Employee Name:"+emp_name);
    System.out.println("Designation:"+designation);
    
    
    }
}
    class EmployeeData
    {
    public static void main(String []args)
    {
    String s="Manager";
    Employee e[] = new Employee[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].accept();
  }
   for(int i=0; i<5; i++)
   {
   if(e[i].designation.equals(s))
   {
   e[i].Display();
   }
   
    }
    
    
    }

}