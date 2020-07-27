package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlusController {
	@GetMapping(path="/plusform")
	public String plusform() {
		// view만 찾아다가 view 정보만 넘겨줌
		return "plusForm";
	}
	
	@PostMapping(path="/plus")
	public String plus(
			// requestparam: mapping 된 메소드의 argument에 붙일 수 있음
			// http parameter의 name과 맵핑되며, required는 필수여부 판단
			@RequestParam(name = "value1", required=true) int value1,
			@RequestParam(name = "value2", required = true) int value2, ModelMap modelMap) {
		int result = value1 + value2;
		
		modelMap.addAttribute("value1", value1);
		modelMap.addAttribute("value2", value2);
		modelMap.addAttribute("result", result);
		
		return "plusResult";
	}
}
