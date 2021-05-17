package kr.co.ch03_1.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 @ToString : 객체 정보가져오기
 
 @EqualsAndHashCode
 	equals :  두 객체의 내용이 같은지, 동등성(equality) 를 비교하는 연산자
 	hashCode : 두 객체가 같은 객체인지, 동일성(identity) 를 비교하는 연산자
 	
 @AllArgsConstructor : 객체의 모든 필드값을 인자로 받는 생성자 생성	
 	
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of="boardNo")
public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;
}

