package kr.or.connect.mvcexam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"kr.or.connect.mvcexam.controller"})
// {} 넣어서 사용하는건 여러개 넣을 수 있음
// composcan 사용할 때 basepkg 항상 지정해 주어야 함 
public class WebMvcContextConfiguration extends WebMvcConfigurerAdapter {
	
	// @enablewebmvc를 기본 설정 이외로 사용하려면
	// webmvcconfigureradapter를 상속하여 오버라이딩
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/META-INF/resources/webjars/").setCachePeriod(31556926);
		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
		registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
		// 요청이 들어올때 js밑의 뭐 이렇게 시작하는 url 요청은
		// application  루트 디렉토리 아래의 각각의 디렉토리 만들어놓고 거기에 알맞게 쓸 것
		// /css/** 어쩌고 하는 요청은 /css/ 에서 찾으라는 뜻
		// 이렇게 안하면 Controller에서 찾으려고 해서 문제가 됨 
	}
	
	// default servlet handler 사용
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		// 파라미터로 전달받은 configurer 객체를 enable해서 사용하게해줌
		// WAS의 dafaultservlet에게 일을 넘기게 됨 
		// WAS는 defaultservlet이 static한 자원을 읽어서 보여주게 함 
	}
	
	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		System.out.println("addViewControllers가 호출됩니다.");
		registry.addViewController("/").setViewName("main");
		//  특정 url에 대한 처리를 controller class 작성 없이 매핑하게 해 주는 역할
		// / 이렇게 되어있으면 main 의 뷰를 보여주도록 함
		
	}
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		// 메인은 어디서 찾냐면 viewresolver를 통해 찾음
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// 앞에 이걸 붙이고
		resolver.setPrefix("/WEB-INF/views/");
		
		// 뒤에 이걸 붙임
		resolver.setSuffix(".jsp");
		
		// --> 결국 뷰는 WEB-INF/views/main.jsp 라는 파일을 찾아주는 역할
		return resolver;
	}
	
	
	
}
