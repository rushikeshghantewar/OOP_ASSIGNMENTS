import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        s=sc.nextInt();
        int []arr =new int[s];
        
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0,j;
        for(i=0;i<s;i++)
        {
            for(j=1;j<s;j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        result=arr[s-1];
        temp=0;
        for(i=0;i<arr.length;i++)
        {
            temp +=arr[i];
        }
        mark_avg=temp/s;
        
        System.out.println(result);
        System.out.println(mark_avg);
    
    
    }
}