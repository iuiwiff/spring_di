package day0617;

/**
 * 의존성 주입을 수행하는 클래스
 * @author user
 *
 */
public class Assembly {

	public Service getBean() {
		
		//1. 의존성 주입할 클래스를 객체화
//		OracleDAO oDAO = new OracleDAO();
		MySqlDAO oDAO = new MySqlDAO();
		
		//2. 의존성 주입받을 클래스를 객체화
		ServiceImpl si = new ServiceImpl(oDAO);
		
		//3. 의존성 주입받은 객체를 반환
		return si;
	}
}
