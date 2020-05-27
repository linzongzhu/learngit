package com.atguigu.maven;

import com.ayfyu.maven.hello;
import org.junit.Test;

public class HelloTest {
    @Test
    public  void testHello(){
        hello hello=new hello();
        String maven =hello.sayhello("Maven");
        System.out.println(maven);
    }
}
