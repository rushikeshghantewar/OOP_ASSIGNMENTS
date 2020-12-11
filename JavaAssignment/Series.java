package JavaAssignment;
import java.util.Scanner;
class Series
{
public static void main(String []args)
{
    int n;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements:");
    n=sc.nextInt();
    int series[]=new int [n];
    
    for(int i=1;i<n;i++)
    {
    series[i]=n+i;
    System.out.println(series[i]);
    }

    

}


}