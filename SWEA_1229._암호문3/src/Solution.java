import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	for(int t=1;t<=10;t++) {
		int N = sc.nextInt();
			// I면~ 추가 
				// 첫번째 받고 위치 지정
				// 두번째 받아서 
					// 두번째 받은 것 만큼 돌면서 sc 받아서 추가
			// D면~ 삭제
				// 첫번째 받고 위치 지정
				// 두번째 받아서 
					// 두번째 받은 것 만큼 돌면서 sc 받아서 추가
		// 3rd 다돌면 ans의 10개 출력
	
		List<String> list = new ArrayList <>();
		// 1st N개수만큼의 사이즈의 리스트 만들어서 암호 넣기
		for(int i=0;i<N;i++) {
			list.add(sc.next());
		}
		// 2nd 명령문 갯수만큼 반복하면서 via for문
		int C = sc.nextInt();
		for(int c=0;c<C;c++) {
			String u = sc.next();
			if(u.equals("I")) {
				int position = sc.nextInt();
				int r = sc.nextInt();
					for(int j=0;j<r;j++) {
						list.add(position, sc.next());
						position++;
					}
			}
			else if (u.equals("D")) {
				int position = sc.nextInt();
				int r = sc.nextInt();
					for(int j=0;j<r;j++) {
						list.remove(position);
					}
			}	
		}
		System.out.print("#"+t+" ");
		for(int ans=0;ans<10;ans++) {
			System.out.print(list.get(ans)+" ");
		}
		System.out.println();
	}
	
}
	
	// 디버깅 팁 : remove 할 때는 postion 값 안 더해줘도 괜찮음
	
}
