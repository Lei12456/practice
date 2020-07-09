package com.briup.controller;
/** 
* @author 作者 angel: 
* @version 创建时间：2020年7月8日 下午8:29:34 
* 类说明 
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/toUser")
	public String toUser() {
		
		return "hello";
	}
}
