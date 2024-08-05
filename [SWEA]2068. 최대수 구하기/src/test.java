import java.util.Scanner;

public class test {
public static void main(String[] args) {
	// 테스트 케이스 입력받기
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
				for(int t=1; t<=T; t++) {
					int max =0;
					// 10칸 배열만들어서 숫자 집어넣기
					int [] arr = new int [10];
					for(int i=0; i<10;i++) {
						arr[i] = sc.nextInt();
						// max 값과 비교하며 최대값 구하기
						if(arr[i] > max) {
							max = arr[i];
						}
					}
					// ans
					System.out.printf("#%d", t);
					System.out.println(" " + max);
					
				}
			sc.close();
	}
}
