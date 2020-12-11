import java.util.Scanner;

public class Que7 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int sub1, sub2, sub3, sub4, sub5; 
	    float total, Percentage, Average;
		sc = new Scanner(System.in);
		
		System.out.print("  Enter the Five Subjects Marks : ");
		sub1 = sc.nextInt();	
		sub2 = sc.nextInt();	
		sub3 = sc.nextInt();	
		sub4 = sc.nextInt();	
		sub5 = sc.nextInt();	
		
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		Average = total / 5;
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	}
}