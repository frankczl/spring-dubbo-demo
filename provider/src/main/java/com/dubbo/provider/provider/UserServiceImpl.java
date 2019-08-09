package com.dubbo.provider.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.api.UserService;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "测试dubbo";
    }
}
