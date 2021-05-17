package kr.co.ch03;




import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import kr.co.ch03.domain.Board;

@SpringBootTest
public class LombokTests {

	@Test
	public void testNoArgsConstructor() {
		Board board = new Board();
		
		System.out.println(board);
	}
	
	@Test
	public void testRequiredArgsConstructor() {
		Board board = new Board("방탄소년단");
		
		System.out.println(board);
	}
	
	@Test
	public void testGetter() {
		Board board = new Board();
		System.out.println(board.getTitle());
	}
	
	@Test
	public void testSetter() {
		Board board = new Board();
		board.setTitle("정국아 사랑해");
		System.out.println(board.getTitle());
	}
}
