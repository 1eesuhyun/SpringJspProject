package com.sist.web.vo;

import lombok.Data;

@Data
public class RecipeVO {
	private int no,hit,likecount,jjimcount,replycount;
	// --------------- 자동 증가 : 트리거 : 다른 테이블 연결시에만 사용이 가능
	// --------------- 공통 댓글 : 프로시저, Join : Function
	private String title,poster,chef,link;
}
