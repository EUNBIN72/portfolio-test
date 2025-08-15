package com.eb.app.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 이 클래스를 웹 요청 처리용 Controller로 등록
// 내부적으로는  @Component처럼 동작해서 스프링 빈으로 등록됨
@Controller
@RequestMapping("/board")  // /(src/main/webapp/WEB-INF/views)의 board로 시작하는 요청 URL을 처리
public class ErrorController {
	
	@GetMapping("404_page")  // GET 방식으로 요청해서 /board/404_page.jsp 처리 
	public String errorPage() {
		return "board/404_page";
	}

}
