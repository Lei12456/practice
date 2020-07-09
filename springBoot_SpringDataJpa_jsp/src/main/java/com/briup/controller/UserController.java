package com.briup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月28日 下午9:40:00 
* 类说明 
*/
@Controller
public class UserController {
	
	@RequestMapping("/toUser")
	public String toUser() {
		return "user";
	}
}
