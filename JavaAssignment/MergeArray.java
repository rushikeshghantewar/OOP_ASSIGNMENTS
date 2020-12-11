package JavaAssignment;

class MergeArray
{
public static void main(String []args)
{
int arr1[]={23,60,94,3,102};
int arr2[]={42,16,74};
int count=0;

int arr3[]=new int[arr1.length+arr2.length];

for(int i=0;i<arr1.length;i++)
{
    arr3[i]=arr1[i];
    count++;
    break;
}
    
 for(int j=0;j<arr2.length;j++)
{
    

  arr3[count++]=arr2[j];
  //break;
// count++;
}

for(int i=0;i<arr3.length;i++)
{
System.out.println(arr3[i]);
}


}


}