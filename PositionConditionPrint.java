package info.guvi;
import java.util.*;
import java.util.Scanner;

public class PositionConditionPrint {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array Size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter Number : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0 && i%2!=0)
			{
				System.out.print(arr[i] + " ");
			}
			else if(arr[i]%2!=0 && i%2==0)
			{
				System.out.print(arr[i] + " ");
			}
			else
			{
				continue;
			}
		}
		
	}
}
