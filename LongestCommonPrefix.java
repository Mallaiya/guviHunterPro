import java.util.*;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int leastSize;
		String[] arr = new String[N];
		int[] eleLength = new int[N];
		ArrayList eleList = new ArrayList();
		for(int i=0;i<N;i++) {
			arr[i] = sc.next();
		}
		for(int i=0;i<N;i++) {
			eleLength[i] = arr[i].length();
		}
		Arrays.sort(eleLength);
		leastSize = eleLength[0];
		for(int i=0;i<leastSize;i++) {
			for(int j=0;j<N-1;j++) {
				if(arr[j].charAt(i)==arr[j+1].charAt(i)) {
					
					if(j == N-2) {
						//System.out.println("true");
						//System.out.println(arr[j].charAt(i));
						eleList.add(arr[j].charAt(i));
					}
				}
				else {
					i++;
				}
			}
		}
		for(Object i : eleList) {
			System.out.print(i);
		}
		sc.close();
	}
}
