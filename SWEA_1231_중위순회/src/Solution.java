import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	// 스캐너로 받아와서 트리배열 만들고
	Scanner sc= new Scanner (System.in);
	for(int t=1;t<=10;t++) {
		int N = sc.nextInt();
		sc.nextLine();
		
//		int n = (int)(Math.log(N) / Math.log(2));
//		int m = (int) Math.pow(2,n+1);
		String [] tree = new String [N+1];
		
			
			for (int i = 1; i <= N; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                // 첫 번째 요소는 숫자(노드 번호)
                int index = Integer.parseInt(parts[0]);
                // 두 번째 요소는 알파벳(노드 값)
                String value = parts[1];
                // 트리 배열에 저장
                tree[index] = value;
            }
		
		// 아래 만들어 둔 중위순회 함수 실행 시키기
	System.out.print("#"+t+" ");
	inorder(1,tree);
	System.out.println();
	
	}
}
	
	public static void inorder(int root, String[]tree){
	if(root>=tree.length || tree[root]==null) {
		return;
	}
	inorder(root*2,tree);
	System.out.print(tree[root]);
	inorder(root*2+1,tree);
	}
}


