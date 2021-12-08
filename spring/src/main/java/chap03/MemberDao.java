package chap03;

/*
 * ~~Dao는 데이터 처리를 위한 클래스 
 * DAO (Date Access Object) 데이터에 접근하기위한 객체 
 * 예) insert, select, update, delete....
 */
public class MemberDao {
	
	public MemberDao() {
		System.out.println("MemberDao 생성자");
	}

	
	// DB에 회원 등록하는 메서드 
	public int insert(String name) {
		//DB저장 
		System.out.println(name + " 저장!");
		return 1; //성공 시 1 리턴
		
	}
}
