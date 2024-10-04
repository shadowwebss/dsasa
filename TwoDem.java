import java.util.Scanner;

public class TwoDem {
public static void main (String [] args)
{
Scanner cd = new Scanner(System.in);
System.out.println("Enter Rows Value in it : ");
int row = cd.nextInt();
System.out.println("Enter Columns in it : ");
int col = cd.nextInt();

int [][]array = new int [row][col];

System.out.println("Enter a value");
int value = cd.nextInt();

for(int i = 0 ; i<row; i++)
{
	for(int j = 0;  j<col; j++)
	{
array[i][j] = value;
value++;
	}
}
System.out.println("The Two Demenicial Array is : ");
for(int i = 0; i<row; i++) {
	for (int j = 0; j<col; j++) {
		System.out.print(array[i][j]+ " ");
	}
	System.out.println();
}
}
}
