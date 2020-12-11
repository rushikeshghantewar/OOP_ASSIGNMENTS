import java.util.Scanner;
import java.lang.Math;

class Que6
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
double radius=scan.nextDouble();

double areaOfCircle=Math.PI*(radius*radius);

double circumference=Math.PI*2*radius;

System.out.println("Area of circle is:"+areaOfCircle);

System.out.println("Circumference of circle is:"+circumference);
}
}