package com.jc.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * Created by JC on 2018/5/2.
 */
public class HelloWorldCommand extends HystrixCommand<String> {
    private final String name;

    public HelloWorldCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("HelloWorldGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        return "Hello :" + this.name;
    }
}
