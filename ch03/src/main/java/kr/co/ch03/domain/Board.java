package kr.co.ch03.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/* 
 @NoArgsConstructor : 인자가 없는 기본 생성자 생성 
 @RequiredArgsConstructor : NonNull이 적용된 필드값이나 final로 선언된 필드값만 인자로 받는 생성자 생성
 
  */
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Board {

	private int boardNo;
	@NonNull
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;
}

