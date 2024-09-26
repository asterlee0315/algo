import java.util.Scanner;

public class Solution2 {

	/// denkmal
	// 완전탐색(와이파이,손가락)->dfs-> 재귀
	static int [][]arr;
	static boolean [][]arr2;
	static boolean goal;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int T = sc.nextInt();
			arr = new int[16][16];
			arr2 = new boolean[16][16];
			for(int i=0;i<16;i++) {
				String a = sc.next();
				for(int j=0;j<16;j++) {
					arr[i][j] = a.charAt(j)-'0';
				}
			}
		//답//
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
			
			
			
		goal = false;
		dfs(str,stc);
		if(goal) System.out.println("#"+T+" "+1);
		else System.out.println("#"+T+" "+0);
		}// ende des tc
	}// ende des main
	
	// 이제 dfs를 설정해보겠ㅅ브니다.
	
	static int [] dr = {-1,1,0,0};// 상하좌우
	static int [] dc = {0,0,-1,1};// 상하좌우
	static void dfs(int r, int c) {
		// (1)기저조건 - 이 dfs를 탈출하는 조건, 즉 탐색을 그만두는 경우
			// 이 문제에서는? 3을 만났을 때
			if(arr[r][c]==3) {
				goal = true;
				return;
			}
			arr2[r][c]=true;
		// (2)재귀 - 반복할 부분
		// 사방 탐색을 해야하잖아요 -> dr/dc/nr/nc static 안에 static 올 수 없으므로 얘네는 밖으로 빼겠습니다.
		for(int d=0;d<4;d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			// constraint
			if(nr<0 || nr>16|| nc<0||nc>16 || arr2[nr][nc] ||arr[nr][nc]==1)
				continue; // 다음 방문할 곳이 다음과 같다면, 가지 않습니다.
			// 이 줄에 왔다는 것은 방문하겠다는 것이니	
			dfs(nr, nc); //방문한곳에서 새로 재귀를 돌리겠습니다.
			// dfs()가 다시 나왔다는 재귀가 끝났다는 건데, 이때 고려해야할게 백트래킹
				// 백트래킹: 안되는 곳에 다다르면 다시 되는 곳으로 돌아오되 이때 visited를 unvisited로 전환
			}
			arr2[r][c] = false; // 
		}
}
