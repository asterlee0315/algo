import java.util.*;

public class Test {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
			for(int t=0; t<T; t++) {
				int ans=0;
				// 굳이 굳이 알려준 테스트 케이스 넘버
				int testNumber = sc.nextInt();
				int [] arr = new int [101];
				int i=0;
				while(i<1000) {
					int a = sc.nextInt();
					arr[a]++;
					i++;
				}
				// 앞 칸부터 하나씩 값을 비교하기
				int max=0;
				for(int x =0; x<100;x++) {
					if(arr[x]>max) {
						max = arr[x];
						ans = x;
					}
					if(max==arr[x]) {
						ans = x;
					}
				}
				System.out.print("#"+testNumber);
				System.out.print(" " + ans);
				System.out.println();
			}
}
}
