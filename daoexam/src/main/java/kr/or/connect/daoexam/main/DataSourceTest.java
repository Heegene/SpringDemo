package kr.or.connect.daoexam.main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;

public class DataSourceTest {
	public static void main(String[] args) throws SQLException {
		// bean 등록한것들이 있고 스프링 컨테이너가 이 빈들을 관리함
		
		// 설정을 읽어들일 때 DBConfig.java에서 정보를 입력했고
		// ApplicationConfig에 이 DBConfig.java가 연결되어 있으므로(annotation으로)
		// 결국 ApplicationConfig만 연동하면됨
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// datasource를 구현하고 있는 실제 객체를 얻어냄
		DataSource ds = ac.getBean(DataSource.class);
		
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패 ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		
		
		
	}
}
