package com.py890000.cloud.auth.controller;


import com.py890000.cloud.core.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 应用相关接口
 *
 * @author zlt
 */
@Api(tags = "应用")
@RestController
@RequestMapping("/clients")
public class ClientController {

//
    @GetMapping("/list")
    @ApiOperation(value = "应用列表")
    public Result<?> list(@RequestParam Map<String, Object> params) {
        return null;
    }
//
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取应用")
    public Result get(@PathVariable Long id) {
        return Result.succeed("");
    }
//
    @GetMapping("/all")
    @ApiOperation(value = "所有应用")
    public Result<?> allClient() {
//        PageResult<Client> page = clientService.listClent(Maps.newHashMap(), false);
        return Result.succeed("");
    }
//
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除应用")
    public void delete(@PathVariable Long id) {
//        clientService.delClient(id);
    }
//
    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或者修改应用")
    public Result saveOrUpdate(@RequestBody Object clientDto) {
        return Result.succeed("");
    }
}
