package com.briup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.bean.User;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月28日 下午8:16:42 
* 类说明 
*/
public interface UserDao extends JpaRepository<User, Integer>{
	
	
}
