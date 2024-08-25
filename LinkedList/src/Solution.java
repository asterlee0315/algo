import java.util.Scanner;

public class Solution { // 양방향 연결리스트
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		int N = sc.nextInt();
		ListNode head = new ListNode(0)
	}
}

class Node{
	String data;
	Node prev;
	Node next;
}
	
class DoublyLinkedList{
	Node head;
	Node tail;
	int size;
	
	public DoublyLinkedList() { // 생성자 만들어주기
		head = new Node();
		tail= new Node();
		head.next = tail;
		tail.prev= head;
	}


// 삽입
 void add(int i, String data) {
	 // 0 제일 앞에 삽입
	 // size: 제일 뒤에 삽입
	 if(i<0 || i> size) {
		 System.out.println("삽입할 수 없는 범위입니다");
		 return;
	 }
	 size++;
	 
	 // 삽입 위치 앞의 노드를 찾는다
	 Node curr  = head;
	 for(int k=0;k<i;k++) {
		 curr=curr.next;
	 }
	 // 새 노드 만드릭
	 Node newNode = new Node();
	 newNode.data=data;
	 
	 //새 노드 연결해주기
	 newNode.next=curr.next;
	 newNode.prev = curr;
	 
	 //기존 노드 연결 재구성
	 curr.next.prev = newNode;
	 curr.next = newNode;
	 
// 삭제
	 void remove(int i) {
		 //0 제일 앞의 데이터 삭제
		 // size-1 제일 뒤의 데이터 삭제 - 왜냐면 꼬리가 추가되었잖아
		 if(i<0 || i>=size) {
			 System.out.println("삭제 할 수 없는 범위");
			 return;
		 }
		 size --;
		 // 삭제할 위치를 찾기 
		 Node rmNode = head;
		 for(int k=0;k<i;k++) {
			 rmNode = rmNode.next;
		 }
		 rmNode.prev.next = rmNode.next;
		 rmNode.next.prev = rmNode.prev;
	 }
	 
	 void printReverse() {
		 Node curr = tail.prev;
		 String str = "";
		 while(curr !=head) {
			 str = "<-" +curr.data+str;
			 curr = curr.prev;
		 }
		 System.out.println(str);
	 }
	}
}

}










