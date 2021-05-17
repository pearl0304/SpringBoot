package kr.co.ch03_1.domain.result;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;

}
