package RoughWork;

import java.util.*;


class SimpleInterest
{
double principle_Amount;
float year;

static float rate_Interest=4.5F;
   double SI=0;


Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("enter the principle ammount");
principle_Amount=sc.nextDouble();

System.out.println("Enter the year");
year=sc.nextFloat();
//System.out.println("Enter the rate of interset");
//rate_Interest=sc.nextFloat();


}

void simpleinterest()
{
 
       SI=principle_Amount * year *rate_Interest;
}
void Display()
{
System.out.println(principle_Amount);
System.out.println(year);
//System.out.println(rate_Interest);
System.out.println(SI);
}



}


class SimpleDemo
{
public static void main(String []args)
{
SimpleInterest si=new SimpleInterest();

si.accept();
si.simpleinterest();
si.Display();



}
}
