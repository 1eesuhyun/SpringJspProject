package com.sist.web.vo;
import lombok.Data;
/*
 * 	vo : 데이터를 모아서 전송
 *  mapper : 데이터베이스 연동
 *  service : controller와 연동
 *  controller : 사용자 요청 => 요청처리(브라우저 연동)
 *    | javascript와 연동 (X) : 화면 이동
 *      -----------
 *      | restcontroller : json / 문자열
 *  controlleradvice : 공통 예외처리
 *  interceptor : controller를 찾기 전에 => 자동 로그인(remember-me)
 *                -------------------
 *                viewresolver로 전송 전에
 *                ----------------------  
 *                jsp로 전송 전에 => 권한
 *  aop : 공통모듈 => callback
 *  websocket : 실시간 처리
 *  ------------------------------------------
 *  security : 일반 / jwt
 *  batch : task(실시간) => 알림
 *  -----
 *  카프카
 */

@Data
public class RecipeDetailVO {
	private int no;
	private String poster,title,chef,chef_poster,chef_profile,info1,info2,info3,content,foodmake;
}
