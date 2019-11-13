package com.py890000.cloud.auth.controller;

import com.py890000.cloud.core.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/11/12
 */
@Api(tags = "测试mybatis相关操作")
@Slf4j
@RestController
public class TestController {
    @ApiOperation(value = "用户名密码获取token")
    @PostMapping("/user/login")
    public Result getUserTokenInfo(
            @ApiParam(required = true, name = "username", value = "账号") String username,
            @ApiParam(required = true, name = "password", value = "密码") String password,
            HttpServletRequest request, HttpServletResponse response) throws IOException {
        return new Result();
    }
}
