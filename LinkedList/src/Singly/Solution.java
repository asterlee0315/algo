package Singly;

public class Solution {

	class Node{
		String data;
		Node link;
	}
	
	class SinglyLinkedList{
		Node head;
		int size;
		
		SinglyLinkedList(){ // 기본 생성자 - 연결리스트 만들면 바로 헤드(더미노드) 만들어주기
			head = new Node();
		}
		
		// 삽입
		void addData(int i) {
			// i 인덱스에 데이터삽입
			// 0이면 제일 앞에 추가
			// size와 같으면 제일 뒤에 추가
			if(0> i || i>size) {
				System.out.println("삽입할 위치가 잘못되었습니다");
				return;
			}
			// 새 노드 생성
			Node newNode = new Node(data);
			newNode.data=data;
					
			
			// 삽입할 위치 앞에 있는 노드 찾기
			Node curr = head;
			for(int k=0; k<i;k++) {
				curr = curr.link;
			}
			
			// 새 노드부터 연결
			newNode.link=curr.link;
			curr.link = newNode;
			
			size++;
		}
		// 삭제
		void remove(int i) {
			// int가 0...: 제일 앞에 있는 데이터 삭제
			// int가 (size -1)번: 마지막데이터삭제
			if(0>i||i>=size) {
				System.out.println("삭제할 수 없는 범위입니다");
				return;
			}
			size--;
			// 삭제할 노드의 앞 노드로
			Node curr = head;
			for(int k=0;k<i;k++) {
				curr=curr.link;
			}
			curr.link = curr.link.link;
		}
		
		// 조회
		
		void printAll() {
			Node curr = head.link;
			while(curr!=null) {
				System.out.println(curr.data+"->");
			}
		}
		// 데이터 갯수
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList list new = SinglyLinkedList();
		list.addData
	}
}
