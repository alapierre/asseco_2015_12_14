/**
 * Copyright 2015-12-14 the original author or authors.
 */
package pl.sages.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Person p = (Person) context.getBean("person");

        System.out.println(p);

    }

}
