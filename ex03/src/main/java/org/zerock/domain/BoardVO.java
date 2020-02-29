package org.zerock.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String Writer;
	private Date regdate;
	private Date updateDate;
	
	private int replyCnt;
	//if register board process boardAttachVO
	private List<BoardAttachVO> attachList;
}
