package ArrayAssignment;

import java.util.Arrays;

class Array1
{
    public static void main(String args[])
    {
    
    int arr[]={1,2,3,4,5,6};
    System.out.println(Arrays.toString(arr));
    
    
    
    
    double[] d_Array = new double[10];  
        for(int i=0;i<10;i++){
            d_Array[i] = i+1.0;     
        }
        
        System.out.println(Arrays.toString(d_Array));
    
    
    
    float[][] array = {{1.2f, 2.5f}, {3.9f, 4.0f}, {5.3f, 6.2f}};
System.out.println(Arrays.deepToString(array));
    
    }
}
  
    