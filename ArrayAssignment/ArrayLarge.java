package ArrayAssignment;
import java.util.Scanner;
class ArrayLarge
{

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int j;
                int numbers[] = new int[n];
                System.out.println("Enter the elements:");
               
                for(int i = 0; i < n; i++)
                 {
                    numbers[i] = sc.nextInt();
                
                
                 }
                int smallest = numbers[0];
                int biggest = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > biggest)
                                biggest = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + biggest);
                System.out.println("Smallest Number is : " + smallest);
        }
}