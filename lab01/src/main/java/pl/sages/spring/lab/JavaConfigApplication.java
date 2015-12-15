package pl.sages.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2015-12-14.
 */
@Configuration
public class JavaConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigApplication.class);

        System.out.println(context.getBean("person").toString());

    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setAddress(address());
        return person;

    }

    public Address address() {
        Address address = new Address();
        return address;
    }

}
