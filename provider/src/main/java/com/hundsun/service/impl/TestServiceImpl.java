package com.hundsun.service.impl;

import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import com.hundsun.jrescloud.rpc.annotation.CloudFunction;
import com.hundsun.service.TestService;

/**
 * @Author shengny
 * @CreateTime 2023-03-17  15:14
 * @Description 服务实现类
 * @Version 1.0
 */
@CloudComponent
public class TestServiceImpl implements TestService {

    @CloudFunction
    public String test() {
        return "test";
    }
}
