package com.hundsun.service;


import com.hundsun.jrescloud.rpc.annotation.CloudFunction;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true, validationNull = true)
public interface TestService {

    @CloudFunction(value = "test", desc = "测试方法", apiUrl = "/test")
    String test();
}
