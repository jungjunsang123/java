package org.kosta.prac.controller;

import javax.annotation.Resource;

import org.kosta.prac.model.vo.PostVO;
import org.kosta.prac.sevice.BoaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@Resource
	private BoaService boaservice; 
	@RequestMapping("postForm.do")
	public String postForm() {
		return "/post/postForm";
	}
	
	@PostMapping("registerPost.do")
	public String registerPost(PostVO postVO) {
		boaservice.register(postVO);
		return "post/postList";
	}
	
	
	
	@RequestMapping("postList.do")
	public String postList(Model model) {
		//List<PostVO> list =boaservice.getList();
		//model.addAttribute("plist",list);
		PostVO pvo = boaservice.getPost();
		model.addAttribute("pvo",pvo);
		return "post/postList";
	}
	
}
