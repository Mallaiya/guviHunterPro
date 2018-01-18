package info.gv;
import java.util.Scanner;
public class PrintRepeatSort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(a[i] == a[j])
				{
					if(a[i-1]==a[j])
					{
						i++;
						break;
					}
					else
					{
						System.out.print(a[i]+ " ");
						i++;
					//	break;	
					}
				}
			}
			
		}
	}
}
