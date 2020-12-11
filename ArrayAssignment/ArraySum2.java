package ArrayAssignment;

class ArraySum2
{
public static void main(String []args)
{
int arr1[]=new int[]{1,2,3,4,5};
int arr2[]=new int []{5,6,7,8,9};
int sum=0;

for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
sum = arr1[i]+ arr2[j];

}

}
System.out.println(sum);
}
}