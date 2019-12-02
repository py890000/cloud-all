package com.py890000.cloud.auth.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.py890000.cloud.auth.model.SysUser;
import com.py890000.cloud.mybatis.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 用户表 Mapper 接口
 *
 * @author zlt
 * @data 2018-10-29
 */

public interface SysUserMapper extends SuperMapper<SysUser> {
    /**
     * 分页查询用户列表
     * @param page
     * @param params
     * @return
     */
    List<SysUser> findList(Page<SysUser> page, @Param("u") Map<String, Object> params);
}
