package com.config.user3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // 스프링 환경 설정 파일
@ComponentScan(basePackages = {"com.config.user3"})
@PropertySource("classpath:com/config/user3/test.properties") // 프로퍼티 읽기
public class SpringConfig {
}

