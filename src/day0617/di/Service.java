package day0617.di;

import java.util.List;

/**
 * 제공하는 업무의 목록만 정의
 * @author user
 *
 */
public interface Service {
	public void addName( String name );
	public List<String> searchName();
}
