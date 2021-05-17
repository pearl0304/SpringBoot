package kr.co.ch03_1.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of="studentNo")
public class Student {
	private int studenNo;
	private String name;
}
