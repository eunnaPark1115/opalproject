package my.spring.opalproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/main")
	public String main() {
		
		return  "main";
	}
	//���� ������ ��Ʈ�ѷ�
	
	@RequestMapping(value="/about")
	public String about() {
		
		return  "about";
	}
	//�Ұ� ������ ��Ʈ�ѷ� -- Ŭ���� �����ؼ� ����ص� ��
	
	@RequestMapping(value="/datamain")
	public String datamain() {
		
		return  "datamain";
	}
	//����DATA ��Ʈ�ѷ� -- Ŭ���� �����ؼ� ����ص� ��
	
	@RequestMapping(value="/goods")
	public String goods() {
		
		return  "goods";
	}
	//��깰���� ��Ʈ�ѷ� -- Ŭ���� �����ؼ� ����ص� ��
	
	@RequestMapping(value="/markets")
	public String markets() {
		
		return  "markets";
	}
	//�󰡺����� ��Ʈ�ѷ� -- Ŭ���� �����ؼ� ����ص� ��
	
	

}
