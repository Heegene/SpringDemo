package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// 아까 xml 파일로 로드한 것과는 다르게 annotation 기반으로 가져옴
		// Car car = (Car)ac.getBean("car");
		// 이렇게도 가능한데 형변환 및 아이디 오타의 가능성이 있음
		
		Car car = (Car)ac.getBean(Car.class);
		// Car.class 이렇게 지정해주면 bean 파일내의 이름이 오타나든 말든
		// 가져올 수 있음 리턴하는 타입은 Car 객체이므로 찾을 수 있음 
		
		// 클래스명 "car" 에 맞춰서 빈이름 입력해주면 됨 
		car.run();
		
		
	}
}
