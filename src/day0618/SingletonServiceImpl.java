package day0618;

import java.sql.SQLException;
import java.util.List;

import day0617.di.DAO;
import day0617.di.Service;
import lombok.Setter;

/**
 * singleton pattern이 적용된 클래스
 * @author user
 *
 */
public class SingletonServiceImpl implements Service {
	
	@Setter
	private DAO dao;
	
	private static SingletonServiceImpl ssi;
	
	private SingletonServiceImpl() {
		System.out.println("SingletonServiceImpl의 private 생성자");
	}//SingletonServiceImpl
	
	public static SingletonServiceImpl getInstance() {
		if(ssi == null) {
			ssi = new SingletonServiceImpl();
		}//end if
		System.out.println("singleton으로 만들어진 getInstance");
		return ssi;
	}//getInstance

	@Override
	public void addName(String name) {
		try {
			dao.insertName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//addName

	@Override
	public List<String> searchName() {
		List<String> list = null;
		
		try {
			list=dao.selectNames();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		return list;
	}//searchName

}
