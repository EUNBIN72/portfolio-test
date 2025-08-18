package com.eb.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eb.app.board.BoardVO;
import com.eb.app.commons.Pager;

//Controller의 역할을 해줌
@Controller  
// Http 요청을 컨트롤러의 메서드에 매핑하기 위해 사용
@RequestMapping(value="/notice/*")

public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	// HTTP GET 방식의 요청을 처리
	@GetMapping("list")
	// String 타입인 이유 : JSP와 같은 View 페이지의 경로(논리적 뷰 이름)를 반환
	public String list(Pager pager, Model model) throws Exception {
		// Model 객체 : spring 컨트롤러에서 JSP(뷰)로 데이터를 전달할 때 사용(스프링에서 제공)
		
		// 1. Service 에서 게시글 리스트를 조회(DB)
		// "목록"이니까 List<> 사용해서 list에 담아
		// Pager : 페이징 처리 관련 파라미터
		List<BoardVO> list  = noticeService.list(pager);
		
		// 2. 조회한 데이터를 Model에 담아서 JSP로 전달
		// list라는 이름으로 게시글 목록을 model에 추가
		model.addAttribute("list", list);
		
		
		return "board/list";
	}

	

}
