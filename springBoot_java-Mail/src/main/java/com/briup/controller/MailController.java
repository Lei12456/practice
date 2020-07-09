package com.briup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者 angel:
 * @version 创建时间：2020年7月9日 下午2:30:07 类说明
 */
@RestController
@RequestMapping("mail")
public class MailController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping("/send")
	public void sendMail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("用这个邮箱发送");
		message.setTo("要发送的邮箱");
		message.setSubject("标题");
		message.setText("菜鸡你好，我是菜鸡");
		try {
			//发送
			mailSender.send(message);
			logger.info("菜鸡的测试邮件已发送。");
		} catch (Exception e) {
			logger.error("菜鸡发送邮件时发生异常了！", e);
		}

	}
}
