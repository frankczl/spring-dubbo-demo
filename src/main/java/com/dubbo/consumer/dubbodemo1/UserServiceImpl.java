package com.dubbo.consumer.dubbodemo1;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "测试dubbo";
    }
}
