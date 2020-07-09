package com.briup.dao;
/** 
* @author 作者 angel: 
* @version 创建时间：2020年7月8日 下午8:22:18 
* 类说明 
*/

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.briup.bean.User;

public interface UserMapper {
	
	@Select("select * from t_user")
	public List<User> findAllUser();
}
