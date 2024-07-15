package day0620;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	
	public static void main(String[] args) {
		
		//1. Spring Container 생성 ( annotation 의존성 주입 )
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("day0618/applicationContext3.xml");
		
		//2. bean 얻기 ( 의존성 주입받은 클래스 )
		ServiceImpl si = ac.getBean(ServiceImpl.class);
		
		//3. bean 사용
		si.addName("박시현");
		
		//4. Spring Container 닫기
		((ClassPathXmlApplicationContext)ac).close();
		
	}//main
}//class
