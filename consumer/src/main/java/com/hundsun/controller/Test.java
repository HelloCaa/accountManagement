package com.hundsun.controller;

import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import com.hundsun.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shengny
 * @CreateTime 2023-03-17  15:17
 * @Description TODO
 * @Version 1.0
 */

@RestController
public class Test {
    @CloudReference
    private TestService testService;

    @RequestMapping(value = "/test/{test}", method = RequestMethod.GET)
    public String test(@PathVariable(name = "test") String test) {
        return testService.test();
    }

}
