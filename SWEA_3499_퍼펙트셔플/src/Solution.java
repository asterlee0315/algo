import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=1; t<=T;t++) {
		double N = sc.nextInt();
		Queue<String> queue1 = new LinkedList<>();
		Queue<String> queue2 = new LinkedList<>();
		
		String odd;
		String even;
		for(int i=0;i<N;i++) {
			if(i<Math.ceil(N/2)) {
				queue1.add(sc.next());
			}
			else {
				queue2.add(sc.next());
			}
		}
		System.out.print("#" + t + " ");
		for(int j=0; j<=N;j++) {
			if(j%2==0) {
				odd = queue1.poll();
				if(odd!=null) {
					System.out.print(odd+ " ");
				}
				continue;
			}
			else {
				even = queue2.poll();
				if(even!=null) {
				System.out.print(even + " ");
		}}
		}
		System.out.println();
	}
}
}
	


