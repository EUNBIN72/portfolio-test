package com.eb.app.board.notice;

import org.apache.ibatis.annotations.Mapper;

import com.eb.app.board.BoardDAO;

@Mapper
// BoardDAO를 상속 받음
public interface NoticeDAO extends BoardDAO {

}
