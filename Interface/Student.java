package InterfaceDemo;

class Student implements School
{
  int rollNo;
  String sname;
  String dept;
  
  Student(int rn,String n,String d)
  {
  rollNo=rn;
  sname=n;
  dept=d;
 
  }
public void showDetail()
 {
 System.out.println("rollno is:"+rollNo);
 System.out.println("name is:"+sname);
 System.out.println("department is:"+dept);
 System.out.println("school name is:"+schoolname);
 }
  
  
}
