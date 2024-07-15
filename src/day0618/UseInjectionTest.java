package day0618;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseInjectionTest {
	
	public static void main(String[] args) {
		//1. Spring Container 생성
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("day0618/applicationContext2.xml");
		//2. bean 얻기
		InjectionTest it = ac.getBean("intInjection", InjectionTest.class);
		
		//3. 사용
		System.out.println("정수 injection : " + it.getYear() + " / " + it.getName());
		
		//2. bean 얻기
		InjectionTest it2 = ac.getBean("strInjection", InjectionTest.class);
		
		//3. 사용
		System.out.println("문자열 injection : " + it2.getYear() + " / " + it2.getName());
		
		//2. bean 얻기
		InjectionTest it3 = ac.getBean("listInjection", InjectionTest.class);
		
		//3. 사용
		System.out.println("list injection : " + it3.getList());
		
		//2. bean 얻기
		InjectionTest it4 = ac.getBean("mapInjection", InjectionTest.class);
		
		//3. 사용
		System.out.println("map injection : " + it4 .getMap());
		
		//4. Spring Container 닫기
		((ClassPathXmlApplicationContext)ac).close();
	}
}
