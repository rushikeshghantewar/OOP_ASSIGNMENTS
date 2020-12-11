package InterfaceDemo;


class Student23 implements College ,Exam
{
int prn_no;
String name;
    Student23(int pn,String n)
    {
    prn_no=pn;
    name=n;
    }
    
   void Display()
    {
    System.out.println("prn no is:"+prn_no);
    System.out.println("name is:"+name);
    System.out.println("college name is:"+clg_name);
    
    
    
    }

   public  void exam()
    {
    System.out.println("Give exam");
    }
}

 class StudentDemo23
{
 public static void main(String []args)
 {
  Student23 s=new Student23(101,"Rupali");
  s.Display();
  s.exam();
 }

}