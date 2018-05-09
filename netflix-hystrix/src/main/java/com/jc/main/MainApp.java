package com.jc.main;

import com.jc.command.HelloWorldCommand;

/**
 * Hello world!
 *
 */
public class MainApp {
    public static void main( String[] args ) {
        HelloWorldCommand oHelloWorldCommand = new HelloWorldCommand("Johnson");
        String result = oHelloWorldCommand.execute();
        System.out.print(result);
    }
}
