package com.eb.app.board;

import java.util.List;

import com.eb.app.commons.Pager;

public interface BoardService {

	// list
	public List<BoardVO> list(Pager pager) throws Exception;
}
