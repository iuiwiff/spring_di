package day0617;

/**
 * 의존성 주입받은 객체를 얻어서 사용하는 클래스
 * @author user
 *
 */
public class Run {

	public static void main(String[] args) {
		
		Assembly as = new Assembly();
		Service service = as.getBean();
		
		service.addName("박시현");
		System.out.println(service.searchName());
		
	}//main

}//class
