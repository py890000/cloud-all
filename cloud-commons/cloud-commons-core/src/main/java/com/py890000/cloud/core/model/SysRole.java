package com.py890000.cloud.core.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author py890000
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")
public class SysRole extends SuperEntity {
    private static final long serialVersionUID = 4497149010220586111L;
    private String code;
    private String name;
    private Long userId;
}
