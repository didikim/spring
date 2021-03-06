package chap07;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
/*
 * preHandle: 컨트롤러 실행 전
 * postHandle: 컨트롤러 실행 후
 * afterCompletion: 뷰 실행후
 */
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		/*
		 * 세선객체생성
		 * 로그인세션이 존재하는지 여부 체크
		 * 존재여부에 따라서 처리
		 */
		HttpSession sess = req.getSession();
		if(sess.getAttribute("loginInfo") == null ) { // 로그인 안된 상태
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println ("<script>");
			out.println ("alert('로그인 후 이용가능합니다.')");
			out.println ("location.href='/spring/user/login.do';");
			out.println ("</script>");
			return false;
		}else { //로그인 된 상태
			return true;
		}
			
	}
	
}
