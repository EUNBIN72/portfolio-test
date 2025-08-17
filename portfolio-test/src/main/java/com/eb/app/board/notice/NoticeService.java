package com.eb.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.app.board.BoardService;
import com.eb.app.board.BoardVO;

@Service

public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardVO> list() throws Exception {
		// DAO 계층한테 "게시글 목록을 가져와 달라"고 요청
		return NoticeDAO.list(noticeVO);
	}

}
