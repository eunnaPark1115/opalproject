package my.spring.opalproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/main")
	public String main() {
		
		return  "main";
	}
	//메인 페이지 컨트롤러
	
	@RequestMapping(value="/about")
	public String about() {
		
		return  "about";
	}
	//소개 페이지 컨트롤러 -- 클래스 분할해서 사용해도 됨
	
	@RequestMapping(value="/datamain")
	public String datamain() {
		
		return  "datamain";
	}
	//질병DATA 컨트롤러 -- 클래스 분할해서 사용해도 됨
	
	@RequestMapping(value="/goods")
	public String goods() {
		
		return  "goods";
	}
	//농산물구매 컨트롤러 -- 클래스 분할해서 사용해도 됨
	
	@RequestMapping(value="/markets")
	public String markets() {
		
		return  "markets";
	}
	//농가별구매 컨트롤러 -- 클래스 분할해서 사용해도 됨
	
	

}
