package chap01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //spring 설정 파일
public class AppContext {
	
	//Greeter 클래스로 객체(빈) 생성해서 컨테이너에 등록
	// 빈 이름이 greeter인 리턴값이 객체로 등록
	@Bean 
	public Greeter greeter() { //
		Greeter g = new Greeter();
		g.setName("홍길동");
		return g;
	}
	

}
