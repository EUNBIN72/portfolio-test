package com.eb.app.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // Controller의 역할을 해줌
@RequestMapping(value="/notice/*")

public class NoticeController {
	
	@GetMapping("list")
	public String list() throws Exception {
		return "board/list";
	}

	

}
