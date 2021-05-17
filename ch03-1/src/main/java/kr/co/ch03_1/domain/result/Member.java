package kr.co.ch03_1.domain.result;

import lombok.ToString;

@ToString
public class Member {
	
	private String userId;
	private String password;
	private String userName;

	//@ToString에 의해 추가된 코드인 exclude 파라미터에 지정된 userName 필드값은 출력하지 않음	
}
