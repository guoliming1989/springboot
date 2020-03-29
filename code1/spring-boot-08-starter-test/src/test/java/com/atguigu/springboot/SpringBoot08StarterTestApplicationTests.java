package com.atguigu.springboot;

import com.atguigu.starter.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot08StarterTestApplicationTests {
	@Autowired
	HelloService helloService;
	@Test
	public void contextLoads() {
		helloService.sayHellAtguigu("hhh");
	}

}
