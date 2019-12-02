package com.py890000.cloud.auth.service.impl;

import com.py890000.cloud.auth.mapper.SysUserMapper;
import com.py890000.cloud.auth.model.SysUser;
import com.py890000.cloud.auth.model.User;
import com.py890000.cloud.auth.service.ISysUserService;
import com.py890000.cloud.core.model.Result;
import com.py890000.cloud.core.service.impl.SuperServiceImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Map;
import java.util.Optional;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/11/14
 */
//@Service
public class UserDetailsServiceImpl extends SuperServiceImpl<SysUserMapper, SysUser> implements ISysUserService, UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<SysUser> sysUserOptional = selectByUsername(username);

        if (sysUserOptional.isPresent()) {
            User user = new User();
            user.setSysUser(sysUserOptional.get());
            return user;
        } else {
            return null;
        }
    }


    @Override
    public Optional<SysUser> selectByUsername(String username) {
        return Optional.empty();
    }


    public SysUser selectByMobile(String mobile) {
        return null;
    }


    public SysUser selectByOpenId(String openId) {
        return null;
    }


    public Result updatePassword(Long id, String oldPassword, String newPassword) {
        return null;
    }


    public Result updateEnabled(Map<String, Object> params) {
        return null;
    }


    public Result saveOrUpdateUser(SysUser sysUser) {
        return null;
    }


    public boolean delUser(Long id) {
        return false;
    }
}
