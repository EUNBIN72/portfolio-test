package com.eb.app.board;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 데이터를 담기 위한 객체(클래스)
// 데이터 전달

@Getter
@Setter
@ToString
public class BoardVO {
// = DTO
	
	private Long boardNum;
	private String boardTitle;
	private String boardContents;
	private String boardWriter;
	private LocalDateTime boardDate;
	private Long boardHit;

}
