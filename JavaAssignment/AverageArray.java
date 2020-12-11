package JavaAssignment;

class AverageArray
{
public static void main(String []args)
{
int arr[]={5,14,35,89,140};
int res[]=new int[arr.length];
 for(int i=0;i<arr.length;i++)
 {
  res[i]=(arr[i]+arr[i+1]+arr[i+2])/3;
 System.out.println(res[i]);
 }

}

}