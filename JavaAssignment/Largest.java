package JavaAssignment;

class Largest
{
public static void main(String []args)
{
    int temp;
    int size;
   
int arr[]={24,54,31,16,82,45,67,98};
 size=arr.length;
for(int i=0;i<size;i++)
{
    for(int j=0;j<size;j++)
    {
if(arr[i]<arr[j])
{
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
}
}
System.out.println("third largest no is:"+arr[size-3]);

}
 
}


