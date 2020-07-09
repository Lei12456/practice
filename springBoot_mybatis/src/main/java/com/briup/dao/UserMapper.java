package com.briup.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.briup.bean.User;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月27日 下午6:06:32 
* 类说明 
*/
@Mapper
public interface UserMapper {
	void saveUser(User user);
	List<User> findAll();
}
