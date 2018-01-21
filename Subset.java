package info.guvi;
import java.util.*;
public class Subset {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of First Array  :");
		int arrayOneSize = sc.nextInt();
		int []array1 = new int [arrayOneSize];
		System.out.println("Enter numbers --->Don't Enter any repeated numbers");
		for(int var1 = 0;var1<arrayOneSize;var1++)
		{
			array1[var1] = sc.nextInt();
		}
		System.out.print("Enter the Size of Second Array  :");
		int arrayTwoSize = sc.nextInt();
		int []array2 = new int [arrayTwoSize];
		System.out.println("Enter numbers --->Don't Enter any repeated numbers");
		for(int var2 = 0;var2<arrayTwoSize;var2++)
		{
			array2[var2] = sc.nextInt();
		}
		System.out.println("Checking Second array subset of First array");
		int present = 0;
		if(arrayOneSize>=arrayTwoSize)
		{int checkArr = arrayOneSize-arrayTwoSize;
		for(int var2=0;var2<arrayTwoSize;var2++)
		{
			for(int var1 = 0;var1<arrayOneSize;var1++)
			{
				if(array2[var2]==array1[var1])
					present++;
			}
		}
		// System.out.println("Present :" + present);
		if(present==arrayTwoSize)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		}
	}
}
