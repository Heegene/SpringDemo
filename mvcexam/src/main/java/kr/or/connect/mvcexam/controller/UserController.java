package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.connect.mvcexam.dto.User;

@Controller
public class UserController {
	// requestmapping으로 받아서 메서드 get방식으로 해서 (getmapping과 비슷한 방법)
	// 똑같이 받아내서 userform.jsp 를 보여주게 됨 
	@RequestMapping(path="/userform", method=RequestMethod.GET)
	public String userform() {
		return "userform";
	}
	
	@RequestMapping(path="/regist", method=RequestMethod.POST) 
	public String regist(@ModelAttribute User user) {
		// User라고 선언만 해주면 일치하는 이름들을 찾아서(name, age,..) User객체 생성하고 그 객체안에 값들을 넣어줌
		System.out.println("사용자가 입력한 user 정보입니다. 해당 정보를 이용하는 코드가 와야 합니다.");
		System.out.println(user);
		return "regist"; // regist.jsp가 들어가야함 
	}
}
