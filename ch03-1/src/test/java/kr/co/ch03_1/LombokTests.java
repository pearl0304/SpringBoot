package kr.co.ch03_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.ch03_1.domain.Board;
import kr.co.ch03_1.domain.Member;
import kr.co.ch03_1.domain.result.Student;
import kr.co.ch03_1.domain.result.UserItem;

@SpringBootTest
public class LombokTests {

	// @ToString 확인
	
	@Test
	public void testToString() {
		Board board = new Board();
		System.out.println(board);
		System.out.println();
	}
	
	@Test
	public void testToStringExclude() {
		Member member = new Member();
		System.out.println(member);
		System.out.println();
	}
	
	@Test
	public void testBoard() {
		Board board1 = new Board();
		board1.setBoardNo(1);
		board1.setTitle("방탄소년단");
		
		Board board2 = new Board();
		board2.setBoardNo(2);
		board2.setTitle("BTS");		
		
		Board board3 = new Board();
		board3.setBoardNo(2);
		board3.setTitle("방탄");		
		
		
		/* HashSet
		  	1. Set 인터페이스의 구현 클래스 
		  	2. Set 성질 그대로 상속
		  	3. 중복x	
		 */

		Set<Board> boardSet = new HashSet<Board>();
		
		boardSet.add(board1);
		boardSet.add(board2);
		boardSet.add(board3);
		
		System.out.println("저장된 데이터 수 :" + boardSet.size());
		//Iterator : 자바 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화 한 것
		Iterator<Board> it= boardSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
	
	
		// @ToString exclude parameter check
		@Test
		public void testUserItem() {
			UserItem userItem1 = new UserItem();
			userItem1.setUserNo(1);
			userItem1.setItemId(100);
			userItem1.setItemName("방탄사랑해");
			userItem1.setDescription("userItem1");
			
			UserItem userItem2 = new UserItem();
			userItem2.setUserNo(1);
			userItem2.setItemId(200);
			userItem2.setDescription("userItem2");			
			
			UserItem userItem3 = new UserItem();
			userItem3.setUserNo(1);
			userItem3.setItemId(100);
			userItem3.setDescription("userItem3");		
		
			Set<UserItem> userItemSet = new HashSet<UserItem>();
			userItemSet.add(userItem1);
			userItemSet.add(userItem2);
			userItemSet.add(userItem3);
			
			System.out.println("저장된 수 : "+userItemSet);
			
			Iterator<UserItem> it = userItemSet.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}System.out.println();
		}
		
		@Test
		public void testStudent() {
			Student student1 = new Student();
			student1.setStudenNo(1);
			student1.setName("김남준");
			
			Student student2 = new Student();
			student2.setStudenNo(2);
			student2.setName("김석진");		
			
			Set<Student> StudentSet = new HashSet<Student>();
			StudentSet.add(student1);
			StudentSet.add(student2);
			System.out.println("저장된 수 : "+StudentSet);
			
			Iterator<Student> it = StudentSet.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			} System.out.println();
		}
		


}
