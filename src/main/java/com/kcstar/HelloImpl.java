package com.kcstar;

public class HelloImpl implements IHello{
    @Override
    public String hello() {
        return "hello: " + HelloImpl.class.getName();
    }
}
