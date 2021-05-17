package kr.co.ch03_1.domain;

import lombok.ToString;

//exclude 파라미터에 값을 지정
@ToString (exclude = "userName")
public class Member {
	private String userId;
	private String password;
	private String userName;
}
