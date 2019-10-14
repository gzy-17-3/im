package com.gzy.im.server;

import org.springframework.stereotype.Component;

// bean  springmvc
/// 1   在 application 包底下
/// 2    @Component
@Component
public class TestServer {
    public int add(int a,int b){
        return a + b;
    }
}
