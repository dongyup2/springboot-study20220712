package com.springboot.studydongyup.web.dto.board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	private String title;
	private int usercode;
	private String content;
}
