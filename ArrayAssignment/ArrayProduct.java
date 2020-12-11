package ArrayAssignment;

class ArrayProduct
{
public static void main(String []args)
{
int arr1[]=new int[]{1,2,3,4,5};
int arr2[]=new int []{5,6,7,8,9};
int product=0;

for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
product = arr1[i]* arr2[j];

}

}
System.out.println(product);
}
}