package day0617.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring Container를 사용하여 의존성 주입받은 객체를 얻어서 사용하는 클래스
 * @author user
 *
 */
public class Run {

	public static void main(String[] args) {
		//1. Spring Container 생성
//		ApplicationContext ac 
//		= new ClassPathXmlApplicationContext("day0617/di/applicationContext.xml");
		
		ApplicationContext ac
		= new FileSystemXmlApplicationContext("C:/dev/workspace_spring/spring_di/src/day0617/di/applicationContext.xml");
		
		//2. 의존성 주입받은 객체 얻기
		Service service = ac.getBean("service", ServiceImpl.class);
		
		//3. 사용
		service.addName("양수민");
		System.out.println(service.searchName());

		
		Service service2 = ac.getBean("service2", ServiceImpl.class);
		service2.addName("진수현");
		System.out.println(service2.searchName());
		
		
		//4. Spring Container 종료
//		((ClassPathXmlApplicationContext)ac).close();
		((FileSystemXmlApplicationContext)ac).close();
		
	}//main

}//class
