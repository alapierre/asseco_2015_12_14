/**
 * Copyright 2015-12-14 the original author or authors.
 */
package pl.sages.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public class Application {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();

        Person p = (Person) context.getBean("person", Person.class);

        System.out.println(p);

//        System.out.println(context.getBean("adress1", Adress.class));
//
//        System.out.println(context.getBean("userServiceImpl", UserServiceImpl.class));

    }

}
