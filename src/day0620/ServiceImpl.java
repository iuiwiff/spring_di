package day0620;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 업무로직을 구현하는 클래스 : DB를 사용하는 업무와 그렇지 않은 업무 구현
 * @author user
 *
 */
@Component
public class ServiceImpl {
	
	//Field Injection
//	@Autowired(required = false)
	private OracleDAO dao; //읜존성 주입을 받아서 저장할 객체
	
	public ServiceImpl() {
		System.out.println("ServiceImpl 기본 생성자");
	}//생성자
	
//	@Autowired(required = false)
	public ServiceImpl(OracleDAO dao) { //부모를 받으면 : 모든 자식을 입력할 수 있다.
		this.dao = dao;
		System.out.println("ServiceImpl 매개변수 생성자");
	}
	
	@Autowired(required = false)
	public void setDao(OracleDAO dao) {
		this.dao = dao;
		System.out.println("setDao method");
	}

//	public ServiceImpl(DAO dao) { //부모를 받으면 : 모든 자식을 입력할 수 있다.
//		this.dao = dao;
//	}
	
	public void addName(String name) {
		try {
			//dao를 사용하면 입력받은 자식의 method를 호출 ( 객체 다형성 - 같은 객체이지만 다른 기능 사용 )
			dao.insertName(name); 
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//addName

	public List<String> searchName() {
		List<String> list = null;
		try {
			list = dao.selectNames();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		return list;
	}

}
