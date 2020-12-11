import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Assignment20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,j;
		//First Array
		int n1=scan.nextInt();
		int array1 []= new int [n1];
		for(i=0;i<n1;i++) {
			array1[i]=scan.nextInt();
		}
		for(i=0;i<array1.length;i++) {
		System.out.print(array1[i]+" ");
		}
		//Second Array
		System.out.println("");
		int n2=scan.nextInt();
		int array2 []= new int [n2];
		for(j=0;j<n2;j++) {
			array2[j]=scan.nextInt();	
		}
		for(j=0;j<array2.length;j++) {
		System.out.print(array2[j]+" ");
		}
		//Third Array
		System.out.println("");
		int array3 []=new int[n1+n2];
		for(i=0;i<n1;) {
		for(j=0;j<n2;) {
		for(k=0;k<n1+n2;k++) {
		array3[k]=array1[i];
		array3[k]=array2[j];
		i++;
		j++;
		}
		}
		}
		for(i=0;i<=array1.length;) {
		for(j=0;j<=array2.length;) {
		for(k=0;k<=array3.length;k++) {
		System.out.print(array3[k]+" ");
		i++;
		j++;
		}
		}
		
	}
}