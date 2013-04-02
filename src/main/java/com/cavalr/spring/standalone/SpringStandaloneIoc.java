package com.cavalr.spring.standalone;

import com.cavalr.spring.Console;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStandaloneIoc {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserManager userManager = applicationContext.getBean(UserManager.class);

        User newUser = userManager.createUser();

        Console.print(newUser);

    }

}
