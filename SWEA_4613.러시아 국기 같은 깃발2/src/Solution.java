import java.util.Arrays;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char [][]arr = new char[N][M];
		
		for(int r=0;r<N;r++) {
			String a = sc.next();
			for(int c=0;c<M;c++) {
				arr[r][c]=a.charAt(c);
			}
		}
		// 위에 배열 받아옴
		// 러시아 국기 우선 맨 위/아래 줄은 바꿔주자
		int cnt=0;
		// 맨 위줄 바꿔주기
			for(int c=0;c<M;c++) {
				if(arr[0][c]!='W') {
					cnt++;
				}
			}
		// 맨 아래줄 바꿔주기
			for(int b=0;b<M;b++) {
					if(arr[N-1][b]!='R') {
						cnt++;
				}
		}
			
		// 문제의 가운데 영역 체크 
			// white가 최대로 갈 수 있는 영역 1~N-3
				// 그 때 블루가 갈 수 있는 최대의 영역 B: 2~N-2
					//레드는 B+1~N
		int min=Integer.MAX_VALUE;
		for(int w=0;w<=N-3;w++) {
			for(int b=w+1;b<=N-2;b++) {
				int cnt2=0;				
				// white section check
				for(int ww=1; ww<=w;ww++) {
					for(int y=0;y<M;y++) {
						if(arr[ww][y]!='W') {
							cnt2++;
						}
					}
				}
//				System.out.println(cnt2);
				
				for(int bb=w+1;bb<=b;bb++) {
					for(int y=0;y<M;y++) {
						if(arr[bb][y]!='B') {
							cnt2++;
						}
					}
				}
				
				for(int rr=b+1;rr<=N-2;rr++) {
					for(int y=0;y<M;y++) {
						if(arr[rr][y]!='R') {
							cnt2++;
						}
					}
				}
				
				
				if(cnt2<min) {
					min = cnt2;
				}
			}
		
			}
			cnt+=min;
			System.out.println("#"+t+" " +cnt);
	}
}
}

