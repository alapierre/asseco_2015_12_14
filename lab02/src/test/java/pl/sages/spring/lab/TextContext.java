package pl.sages.spring.lab;

/**
 * Copyright 2015-12-15 the original author or authors.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import pl.sages.spring.lab.dao.CategoryDAO;
import pl.sages.spring.lab.model.Category;

import javax.transaction.Transactional;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class TextContext {

    @Autowired
    private CategoryDAO categoryDAO;

    @Test
    public void test() {
        System.out.println("go.");
    }

    @Test
    @Transactional
    public void saveOne() {

        Category category = new Category();

        category.setName("Kategoria 1");
        category.setDescription("Ala ma kota");

        categoryDAO.save(category);

        System.out.println(category.getId());

        Category res = categoryDAO.load(1L);

        assert res.getId() == category.getId();

    }

    @Test
    @Transactional
    public void saveTree() {


        Category category = new Category();

        category.setName("Kategoria 1");
        category.setDescription("Ala ma kota");

        Category child = new Category();
        child.setName("pod kategoria");
        child.setDescription("dkjdjdjdj");

        category.addChildCategory(child);

        categoryDAO.save(category);


    }

}
