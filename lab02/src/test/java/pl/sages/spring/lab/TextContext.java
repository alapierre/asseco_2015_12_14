package pl.sages.spring.lab;

/**
 * Copyright 2015-12-15 the original author or authors.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
public class TextContext {

    @Test
    public void test() {
        System.out.println("go.");
    }

}
