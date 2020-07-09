package com.briup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.User;
import com.briup.bean.UserExample;
import com.briup.mapper.UserMapper;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月28日 上午9:12:42 
* 类说明 
*/
@Service
public class IUserService {
	@Autowired
	private UserMapper mapper;
	
	public void saveUser(User user) {
		mapper.insert(user);
	}
	public List<User> findAll() {
		return mapper.selectByExample(new UserExample());
	}
}
