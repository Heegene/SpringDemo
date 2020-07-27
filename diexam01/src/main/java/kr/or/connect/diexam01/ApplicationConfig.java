package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 스프링 설정 클래스를 설정하는 어노테이션
// annotationconfigurationcontext 는 이를 이용해 ioc, di 실행
public class ApplicationConfig {

	@Bean
	public Car car(Engine e) {
		Car c = new Car();
		// c.setEngine(e);
		return c;
	}
	// bean annotation이 붙어 있는 것들을 기본적으로 싱글턴 객체로 관리하게 됨 
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}
