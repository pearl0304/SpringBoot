package kr.co.ch03_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.ch03_1.domain.Board;
import kr.co.ch03_1.domain.result.Student;
import kr.co.ch03_1.domain.result.UserItem;

@SpringBootTest
public class LombokTests2 {

	@Test
	public void TestBoard() {
		Board Board1=new Board();
		Board1.setBoardNo(1);
		Board1.setTitle("title1");
		
		Board Board2=new Board();
		Board2.setBoardNo(2);
		Board2.setTitle("title2");			
		
		Board Board3=new Board();
		Board3.setBoardNo(3);
		Board3.setTitle("title3");
		
		Set<Board> BoardSet = new HashSet<Board>();
		BoardSet.add(Board1);
		BoardSet.add(Board2);
		BoardSet.add(Board3);
		
		System.out.println("저장된 데이터 수 : "+BoardSet.size());
		
		Iterator<Board> it = BoardSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println();
	} 
	
	@Test
	public void testUserItem() {
		UserItem userItem1 = new UserItem();
		userItem1.setUserNo(1);
		userItem1.setItemName("RJ101");
		userItem1.setPrice(921204);
		
		UserItem userItem2 = new UserItem();
		userItem2.setUserNo(2);
		userItem2.setItemName("Chimmy201");
		userItem2.setPrice(951013);		
		
		Set<UserItem> userItemSet = new HashSet<UserItem>();
		userItemSet.add(userItem1);
		userItemSet.add(userItem2);
		
		System.out.println("저장된 데이터 수 :" +userItemSet.size());
		
		Iterator<UserItem> it = userItemSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println();
		
	}
	
	@Test
	public void testStudent() {
		Student student1 = new Student();
		student1.setStudenNo(5);
		student1.setName("박지민");
		
		Student student2 = new Student();
		student2.setStudenNo(7);
		student2.setName("전정국");		
		
		
		Set<Student> studentSet= new HashSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);
		
		System.out.println("저장된 데이터 수 : "+studentSet.size());
		Iterator<Student> it = studentSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
