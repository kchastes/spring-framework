package com.yck;

import com.yck.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {

	@Test
	public void Test(){
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) beanFactory.getBean("user");
		System.out.println(user);
	}

}
