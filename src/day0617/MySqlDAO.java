package day0617;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DBMS 업무목록에 대한 코드 구현
 * @author user
 *
 */
public class MySqlDAO implements DAO{

	@Override
	public void insertName(String name) throws SQLException {
		System.out.println(name + "이 MySql DBMS에 추가되었음.");
	}//insertName

	@Override
	public List<String> selectNames() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("김동섭");
		list.add("김병년");
		list.add("최수연");
		list.add("이희윤");
		list.add("윤웅찬");
		return list;
	}//selectNames
	
}
