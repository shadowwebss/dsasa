import java.util.Scanner;

public class Demo {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elemets in Array");
	System.out.println("Stores only 5 values");
	int s = sc.nextInt();
	
	
	int a[]=new int[5];//declaration and instantiation  

System.out.println("Enter the elemts in the array "); 
for( int i = 0; i<a.length; i++)
{
	a[i] = sc.nextInt();
	
}
	

	  System.out.println("Array Elements are : ");
	for(int i=0;i<a.length;i++)//length is the property of array  
	System.out.println(a[i]);
}
}

