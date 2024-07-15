package day0620;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * DBMS 업무목록에 대한 코드 구현
 * @author user
 *
 */
@Component
public class OracleDAO {
	
	public OracleDAO() {
		System.out.println("OracleDAO 기본 생성자");
	}

	public void insertName(String name) throws SQLException {
		System.out.println(name + "이 Oracle DBMS에 추가되었음.");
	}//insertName

	public List<String> selectNames() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("홍성강");
		list.add("우미연");
		list.add("정명호");
		list.add("박시현");
		return list;
	}//selectNames
	
}
