package com.darkh0le.test;

import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class HelloAction implements Action {

    private String greeting;
    @Override
    public String execute() throws Exception {
        setGreeting("Hello form struts 2");
        return "success";
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
