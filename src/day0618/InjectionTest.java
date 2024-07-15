package day0618;

import java.util.List;
import java.util.Map;

import lombok.Getter;

@Getter
public class InjectionTest {
	private int year;
	private String name;
	
	private List<String> list;
	private Map<String, String> map;
	
	public InjectionTest(int year) {
		this.year = year;
		System.out.println("정수 생성자");
	}

	public InjectionTest(String name) {
		this.name = name;
		System.out.println("문자열 생성자");
	}

	public InjectionTest(List<String> list) {
		this.list = list;
		System.out.println("list 의존성 주입 생성자");
	}

	public InjectionTest(Map<String, String> map) {
		this.map = map;
		System.out.println("Map 의존성 주입 생성자");
	}
	
	
	
	
}
