package kr.or.connect.mvcexam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class GoodsController {
	// path variable로 값이 들어왔을 때 처리하는 컨트롤러
	
	
	@GetMapping("/goods/{id}")
	public String getGoodsById
	(
	 @PathVariable(name="id") int id,
	 @RequestHeader(value="User-Agent", defaultValue = "myBrowser") String userAgent,
	 HttpServletRequest request,
	 // request를 꼭 사용해야 하는 경우(종속이 되는 걸 감안해도 피치못할상황) 이런식으로 받아서 사용함
	 ModelMap model
	 )
	{
		String path = request.getServletPath();
		System.out.println("id : " + id);
		System.out.println("useragent : " + userAgent);
		System.out.println("path : " + path);
		
		model.addAttribute("id", id);
		model.addAttribute("userAgent", userAgent);
		model.addAttribute("path", path);
		
		
		return "goodsById";
	}
	
	
}
