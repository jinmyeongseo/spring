package com.anno.scope1;

import org.springframework.stereotype.Service;

// @Service : 빈 생성, 비지니스 로직을 담당하는 클래스

// 기본 : singleton
@Service
public class Movie {
	public void play() {
		System.out.println("영화 : " + toString());
	}
}


