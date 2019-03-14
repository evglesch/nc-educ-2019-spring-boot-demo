package com.example.demostarteruser.greeter;

import com.example.mystarter.greeter.Greeter;

//@Component
public class MyRockerGreeter implements Greeter {

    @Override
    public void say() {
        System.out.println("Where is my BEER?");
    }
}
