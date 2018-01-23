package info.guvi;
import java.util.*;
public class SumMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n =sc.nextInt();
		int sum = 0;
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}
