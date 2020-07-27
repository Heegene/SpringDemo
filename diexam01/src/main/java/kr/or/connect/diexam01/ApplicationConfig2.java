package kr.or.connect.diexam01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.or.connect.diexam01")
// componentscan = 알아서 이 파일내의것들을 스캔해서 지정하도록 하기 
// 범위가 크므로 스캔을 할 패키지명을 꼭 지정해줘야 함 
// 컨트롤러, 서비스, 레포지토리 등을 찾아서 annotation 붙은것 다 bean 으로 등록시켜줌
public class ApplicationConfig2 {

	
	
}
