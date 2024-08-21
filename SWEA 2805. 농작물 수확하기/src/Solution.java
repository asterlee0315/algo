import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int T = sc.nextInt();
	for(int t=1; t<=T;t++) {
		int N = sc.nextInt();
		int [][] arr = new int [N][N];
		
		for(int r=0; r<N;r++) {
			for(int c=0;c<N;c++) {
				arr[r][c] = sc.nextInt();
			}
		// 반복문을 N만큼 돌면서

		int [] arr2 = new int [N/2];
		for(int i=0; i<N/2;i++) {
			arr2[i]++;
			}
		int ans =0;
		for(int j=0;j<N;j++) {
			ans+=arr[j][N/2];
			for(int p=1;p<=j%(N/2)+1;p++) {
				ans+=arr[j][N/2+j%(N/2)];
				ans+=arr[j][N/2-arr2[j%(N/2)]];
			}
		}
		System.out.println(ans);
		}
	}
}
}
