package com.eb.app.board;

import java.util.List;

// 객체를 못 만들고 타입으로 사용
public interface BoardDAO {
	
	// list
	// <BoardVO> : 그 리스트 안에 BoardVO 타입 객체만 들어감
	public List<BoardVO> list() throws Exception;

}
