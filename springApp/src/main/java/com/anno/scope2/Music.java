package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

// 해당 객체에 접근(메소드 호출 등) 할 때 마다 새로운 객체가 생성
@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Music {
	public void play() {
		System.out.println("음악 : " + toString());
	}
}
