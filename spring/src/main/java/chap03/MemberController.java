package chap03;

import org.springframework.beans.factory.annotation.Autowired;

/* 
 * 컨트롤러가 하는 역할 
 * 클라이언트 요청을받아서, 해당하는 로직을 처리(Service), 화면을 응답 (View)
 */
public class MemberController {
//	MemberService service;
	
	@Autowired
	MemberService service;
	
	//MemberService 객체를 주입받음
//	public void setService(MemberService service) {
//		this.service = service;
//	}

	//등록폼에서 저장버튼을 클릭하면 전송되는 위치 
	public String insert(String name) {
		if(service.insert(name) > 0) {
			//등록 성공 시 처리
		}else {
			//등록 실패 시 처리
		}
		return "응답";
	}
}
