package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// applicationconfig.class 설정파일을 읽어들이는 applicationcontext 객체 생성
		// 아래 한줄이 실행되며 component scan을 하고, 컴포넌트를 찾으면
		// 인스턴스를 생성하여 applicationContext 가 관리하게 됨
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		// ApplicationContext가 관리하는 CalculatorService.class 타입의 객체 요청
		CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);
		
		// applicationcontext로부터 받은 객체를 이용하여 덧셈을 수행
		
		System.out.println(calculatorService.plus(10, 50));
		
	}

}
