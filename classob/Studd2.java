package RoughWork;
import java .util.Scanner;
class Studd2
{
static String insname="CDac";
String name;
int roll;
float marks;


Studd2(int r,String n,float m)
{
roll=r;
name=n;
marks=m;
}
void printdetails()
{
System.out.println("rollno:"+roll);
System.out.println("name:"+name);
System.out.println("Marks:"+marks);
System.out.println("ins name:"+insname);

}
}

class StudDemo
{

    
    public static void main(String []args)
    {
    
    int i,r;
    float m;
    
    String n;
    Scanner s=new Scanner(System.in);
    
    Studd2 arr[]=new Studd2[2];
    
    for( i=0;i<2;i++)
    {
    r=s.nextInt();
    n=s.nextLine();
    m=s.nextFloat();
    arr[i]=new Studd2(r,n,m);
    
    
    
    
    }
      
    for(i=0;i<2;i++)
    {
    arr[i].printdetails();
    }
    
    }
}