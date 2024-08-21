import java.util.Arrays;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=1; t<=T;t++) {
		int N = sc.nextInt();
		int [][] arr = new int [N][N];
		
		for(int r=0; r<N;r++) {
			String [] a=sc.next().split("");
			for(int c=0;c<N;c++) {
				arr[r][c]=Integer.parseInt(a[c]);
			}
		}
		// 반복문을 N만큼 돌면서 - 순서가 자기자신 자기+1 자기 +2  / 
			// 2 -> 1~3 -> 0~4 / 1~3 / 2
			int ans =0;
			int cnt=0;
				for(int i=0;i<=N/2;i++) {
					ans+=arr[i][N/2];
					for(int j=1;j<i+1;j++) {
						ans+=arr[i][N/2+j];
						ans+=arr[i][N/2-j];
					}
				}
			
			
			for(int i=N/2+1;i<N;i++) {
				ans+=arr[i][N/2];
				for(int j=N-i-1;j>0;j--) {
					ans+=arr[i][N/2+j];
					ans+=arr[i][N/2-j];
				}
			}
			
	System.out.println("#"+t+" "+ans);
		}
	}
}

