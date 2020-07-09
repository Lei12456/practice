package com.briup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.User;
import com.briup.dao.UserMapper;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月27日 下午6:13:03 
* 类说明 
*/
@Service
public class IUserServiceImpl {
	@Autowired 
	private UserMapper mapper;
	
	public void saveUser(User user) {
		mapper.saveUser(user);
	}
	public List<User> findUser(){
		return mapper.findAll();
	}
}
