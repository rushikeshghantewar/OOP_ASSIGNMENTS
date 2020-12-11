package RoughWork;
import java.util.*;

class RealComplex
{
int real;
double complex;

RealComplex(int r,double c)
{
 this.real=r;
 this.complex=c;

}

void realComplexSum()
{
   int sum=0;
}

public static void main(String []args)
{
  RealComplex rc1=new RealComplex(11,23.4);
  RealComplex rc2=new RealComplex(12,45.6);  
  RealComplex temp = realComplexSum(rc1, rc2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.complex +"i");
    
}

}


