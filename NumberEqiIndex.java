package info.gv;
import java.util.*;
public class NumberEqiIndex {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			if(a[i]==i)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i = 0;i<n;i++)
		{
			if(a[i]!=i)
			{
				System.out.print("-1");
				break;
			}
		}
	}
}
