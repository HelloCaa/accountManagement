package com.hundsun;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;

/**
 * @Author shengny
 * @CreateTime 2023-03-17  15:11
 * @Description 主启动类
 * @Version 1.0
 */
@CloudApplication
public class Provider {
    public static void main(String[] args) {
        CloudBootstrap.run(Provider.class, args);
    }
}
