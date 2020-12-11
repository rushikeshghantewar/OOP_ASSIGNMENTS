package InterfaceDemo;

class Teacher implements School
{
int id;
String name;
String dept;
Teacher(int id,String name,String dept)
{
this.id=id;
this.name=name;
this.dept=dept;

}
public void showDetail()
{
    System.out.println("id is:"+id);
    System.out.println("teacher name name is:"+name);
    System.out.println("pepartment name is:"+dept);
    System.out.println("school name is:"+schoolname);
    
}


}
