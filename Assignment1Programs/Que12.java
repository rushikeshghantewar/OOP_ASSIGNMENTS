import java.util.Scanner;
public class Que12
{
public static void main(String []args)
{
float basic_sal,da,hra,gross_Pay;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the salary of Employee:");
basic_sal=scan.nextFloat();
if(basic_sal < 10000)
{
hra = (10*basic_sal) / 100;
da = (90*basic_sal) / 100;
}
else
{
hra = 2000;
da = (98 * basic_sal) / 100;
}
gross_Pay = basic_sal +  da + hra;
System.out.println("gross salary of employee:"+gross_Pay);
}
}