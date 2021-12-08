package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // spring 설정 파일
public class AppContext {

	//MemberController 빈으로 등록 
	@Bean 
	public MemberController memberController() {
		MemberController con = new MemberController();
		con.setService(memberService());
		return con;
	}
	
	//MemberDao 빈으로 등록
	
	@Bean 
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean 
	public MemberService memberService() {
		MemberService service = new MemberService();
		// MemberDao 객체를 주입
		service.setDao(memberDao());
		return service;
		
//		@Bean 
//		public MemberService memberService() {
//			return new MemberService().setDao.(memberDao());
//		
	}
	
}
