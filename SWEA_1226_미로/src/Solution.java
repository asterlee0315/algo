import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	// 미로 받아오기 
	// 시작점. 골인점 받아서
	// if 사방 탐색해서 0이 있으면 갈 수 있고 없으면 못감 
	// 어디로 가던 상관 없고 그 길을 갔을 때 막혀도 상관은 없음
	// 그냥 최종 골 까지 가는 경우가 있나 확인만 하면됨
	//
	
	static int[][] arr;
	static boolean[][] arr2;
	static boolean goal;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1;t<=10;t++) {
			int T = sc.nextInt();
			arr = new int [16][16];
			arr2 = new boolean[16][16];
			for(int i=0;i<16;i++) {
				String a = sc.next();	
				for(int j=0;j<16;j++) {
					arr[i][j] = a.charAt(j)-'0';
//				System.out.println(a.charAt(j));
//				System.out.println(Arrays.deepToString(arr));
				}
			}
			// 스타트,골, 찾기
			int str=0;
			int stc=0;
			int goalr=0;
			int goalc=0;
			for(int r=0;r<16;r++) {
				for(int c=0;c<16;c++) {
					if(arr[r][c] == 2) {
						str=r;
						stc=c;
					}
					if(arr[r][c] == 3) {
						goalr=r;
						goalc=c;
					}
				}
			}
			// 탐색해가면서 커서가 goal가면 goal을 true로 
			goal = false;
			dfs(str,stc);
			if(goal) System.out.println("#"+T+" "+1);
			else System.out.println("#"+T+" "+0);
			
		} // ende des tc
	} // ende des main
	
	// 상하좌우
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	static void dfs(int r, int c) {
		if(arr[r][c]==3) {
			goal=true;
			return;
		}
		
		arr2[r][c]=true;
		
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			// 갈 자리가 범위 밖이면 continue
			if(nr<0||nr>16||nc<0||nc>16
					||arr[nr][nc]==1
					||arr2[nr][nc]) continue;
			dfs(nr,nc);
		}
		arr2[r][c]=false;
		
	}
	
} // ende des Solution
