package chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 *  ~~Service 클래스는 로직을 담당하는 클래스 
 *  컨트롤러가 특정 기능을 실행하기 위해 호출
 */
@Component
public class MemberService {
	//자동주입
	//스프링이 타입이 같은 빈(객체)으로 주입 , 이름은 상관없음
	@Autowired
	MemberDao dao; // dao 객체를 주입받을 필드 
	
	//주입방법 (1. 세터메서드, 2. 생성자, 3. 자동주입)
	//세터메서드 

//	public void setDao(MemberDao dao) {
//		this.dao = dao;
//	}
	
	/* 회원등록 기능을 수행하는 메서드
	 * 여기서는 ~~Ddo의 어떤 메서드를 호출, 비즈니스 로직 수행
	 */
	
	public int insert(String name) {
		int r = dao.insert(name);
		return r;
		
	}

}
