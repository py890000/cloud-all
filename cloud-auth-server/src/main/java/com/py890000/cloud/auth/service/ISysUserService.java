package com.py890000.cloud.auth.service;

import com.py890000.cloud.auth.model.SysUser;
import com.py890000.cloud.core.service.ISuperService;

import java.util.Optional;

/**
* @author zlt
 */
public interface ISysUserService extends ISuperService<SysUser> {


	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	Optional<SysUser> selectByUsername(String username);

}
