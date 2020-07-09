package com.briup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.User;
import com.briup.service.IUserService;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月28日 下午9:40:00 
* 类说明 
*/
@Controller
public class UserController {
	@Autowired
	private IUserService service;
	
	
	@RequestMapping("/toUser")
	public String toUser(HttpSession session) {
		List<User> list = service.findAll();
		for (User user : list) {
			System.out.println(user);
		}
		session.setAttribute("users", list);
		return "user";
	}
}
