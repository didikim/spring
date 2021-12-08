package chap04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // spring 설정 파일
@ComponentScan(basePackages = {"chap04"}) // basePakages의 배열값(패키지)를 스캔해서 빈 등록
public class AppContext {
/*
	//MemberController 빈으로 등록 
	@Bean 
	public MemberController memberController() {
		MemberController con = new MemberController();
		//con.setService(memberService());
		return con;
	}
	
	//MemberDao 빈으로 등록
	
	@Bean 
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean 
	public MemberService memberService() {
//		MemberService service = new MemberService();
		// MemberDao 객체를 주입
//		service.setDao(memberDao());
//		return service;
		return new MemberService();
		
//		@Bean 
//		public MemberService memberService() {
//			return new MemberService().setDao.(memberDao());
//		
	}
*/
}
