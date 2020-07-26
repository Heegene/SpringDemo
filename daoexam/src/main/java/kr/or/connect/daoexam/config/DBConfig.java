package kr.or.connect.daoexam.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
// transaction을 위해 필요한 어노테이션
public class DBConfig {
	// DB 설정과 관련된 설정 클래스
	
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/connectdb?userUnicode=true&characterEncoding=utf8";
	
	private String username = "connectuser";
	
	
	private String password = "connect123!@#";
	
	// datasource 접속을 위한 데이터생성 클래스 필요
	// 개발자가 직접 객체생성하지않고 만들어져있는것을 사용할것
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
	}
	
	
}
