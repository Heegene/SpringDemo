package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class})
// import annotation 이용하면 설정파일 여러개로 나눠서 작성할 수 있음
// database 연결관련 설정을 따로 빼는 등 여러개의파일로 설정나누기가능
public class ApplicationConfig {
	
	
}
