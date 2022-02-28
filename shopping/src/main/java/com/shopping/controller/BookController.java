package com.shopping.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 홈페이지에서 기본적인 기능들(메인페이지 이동, 상품 검색 등)의 요청을 관리하는 컨트롤러
@Controller
//Log4j(롬북 설치했지만 로거 직접 선언해서 쓰는것으로)
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	//main.jsp에 접속 가능하도록 하는 메서드 추가+@RequestMapping추가로 url경로(/main)을 설정
	//메인 페이지 이동
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGET() {
		logger.info("메인 페이지 진입");
	}
}
