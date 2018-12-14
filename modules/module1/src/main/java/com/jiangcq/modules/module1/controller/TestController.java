package com.jiangcq.modules.module1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * BookSystem
 * Created by Makkah at 2018/12/14 15:39
 */
@Api(consumes = "application/json;charset=UTF-8",
        produces = "application/json;charset=UTF-8",
        protocols = "http",
        value = "办理基本信息value",
        tags = "办理基本信息tags")
@RequestMapping(value = "/test", method = RequestMethod.POST)
@RestController // @ResponseBody ＋ @Controller
public class TestController {
    @ApiOperation(value = "查询待退件信息", notes = "分页获取符合条件的待退件信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "qsblsh", value = "申报流水号", required = false, dataType = "String"),
            @ApiImplicitParam(name = "qsbxmmc", value = "事项名称", required = false, dataType = "String"),
            @ApiImplicitParam(name = "qbsName", value = "申请人", required = false, dataType = "String"),
            @ApiImplicitParam(name = "qisPost", value = "是否快递", required = false, dataType = "String"),
            @ApiImplicitParam(name = "page", value = "当前页", required = false, dataType = "String"),
            @ApiImplicitParam(name = "limit", value = "分页大小", required = false, dataType = "String")
    })
    @RequestMapping(value = "/back", method = RequestMethod.POST)
    public int backList(String page, String limit, String qsblsh, String qsbxmmc, String qbsName, String qisPost) {
        return 1;
    }
}
