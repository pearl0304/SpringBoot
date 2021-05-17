package kr.co.ch03_1.domain.result;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserItem {

	private int userNo;
	private int itemId;

	private String itemName;
	private Integer price;
	private String description;

}
