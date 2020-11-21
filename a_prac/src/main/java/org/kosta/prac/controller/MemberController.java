package org.kosta.prac.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.kosta.prac.model.vo.MemberVO;
import org.kosta.prac.sevice.MemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Resource
	private MemService memberservice;
	@PostMapping("login.do")
	public String login(MemberVO memberVO,HttpSession session) {
		MemberVO mvo = memberservice.login(memberVO);
		if(mvo!=null) {
			session.setAttribute("mvo", mvo);
			System.out.println(mvo);
		}
		return "home";
	}
	
	@RequestMapping("registerForm.do")
	public String registerForm() {
		return "member/register-form";
	}
	
	@PostMapping("register.do")
	public String register(MemberVO memberVO) {
		memberservice.register(memberVO);
		return "redirect:home.do";
	}
}
