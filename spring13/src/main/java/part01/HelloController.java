package part01;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/main.do")
	public String execute() {
		return "part01/form";
	}
	//@Scheduled(fixedDelay=1000)
	public void scheduldprocess() {
		System.out.println(new Date()+"스케줄러처리");
	}
}
