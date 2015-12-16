/**
 * Copyright 2015-12-16 the original author or authors.
 */
package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.sages.spring.lab.model.Category;

import java.util.List;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public interface CategoryDAO extends JpaRepository<Category, Long> {

    public List<Category> findByNameLikeIgnoreCase(String name);

    @Query("select c from Category c where c.name like ?1")
    public List<Category> findByQery(String name);



}
