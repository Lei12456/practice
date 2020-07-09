package com.briup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.User;
import com.briup.dao.UserDao;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月28日 下午8:17:28 
* 类说明 
*/
@Service
public class IUserService {
	@Autowired
	private UserDao dao;
	
	public void saveUser(User user) {
		dao.save(user);
	}
	
	public List<User> findAll() {
		return dao.findAll();
	}
	
	
}
