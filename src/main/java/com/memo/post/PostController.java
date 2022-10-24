package com.memo.post;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class PostController {
	
	/*
	 * 글 목록 화면
	 */
	@RequestMapping("/post_list_view")
	public String postListView(HttpSession session, Model model) {	// or HttpServlet Request
		// 로그아웃 상태이면 null이기 때문에 Integer로 해야 한다.
		Integer userId = (Integer)session.getAttribute("userId");
		if (userId == null) {
			// 로그인이 풀려있으면 로그인 페이지로 redirect(리다이렉트)
			return "redirect:/user/sign_in_view";
		}
		model.addAttribute("viewName", "post/postList");
		return "template/layout";
	}
	
	@RequestMapping("/post_create_view")
	public String postCreateView(HttpSession session, Model model) {
		Integer userId = (Integer)session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/user/sign_in_view";
		}
		
		model.addAttribute("viewName", "post/postCreate");
		
		return "template/layout";
	}
}
