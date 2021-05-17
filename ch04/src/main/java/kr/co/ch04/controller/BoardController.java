package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {

	@GetMapping(value="/get",params="register")
	public String registerForm() {
		log.info("registerForm");
		return "board/register";
	}
	
	@PostMapping(value="/post",params="register")
	public String register() {
		log.info("register");
		return "board/list";
	}
	
	@GetMapping(value="/get", params="modify")
	public String modifyForm() {
		log.info("modifyForm");
		return "board/modify";
	}
	
	@PostMapping(value="/post",params="modify")
	public String modify() {
		log.info("modify");
		return "borad/list";
	}	
	
	@GetMapping(value="/get", params="remove")
	public String removeForm() {
		log.info("remove");
		return "board/list";
	}
	
	@PostMapping(value="/post",params="remove")
	public String remove() {
		log.info("remove");
		return "board/list";
	}	
	
	@GetMapping(value="/get",params="list")
	public String list() {
		log.info("list");
		return "board/list";
	}	
	
	@GetMapping(value="/get",params = "read")
	public String read() {
		log.info("read");
		return "board/read";
	}
	
	
	@GetMapping("/read2/{no}")
	public String read2(@PathVariable("no")int boardNo) {
		log.info("read2 boardNo : "+boardNo);
		return "board/read";
	}
}
