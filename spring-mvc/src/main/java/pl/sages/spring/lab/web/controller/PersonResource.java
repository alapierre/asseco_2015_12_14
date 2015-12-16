/**
 * Copyright 2015-12-16 the original author or authors.
 */
package pl.sages.spring.lab.web.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.sages.spring.lab.web.model.Person;
import pl.sages.spring.lab.web.util.HttpEntityUtil;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@RestController
@RequestMapping("/rest/person")
public class PersonResource {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person load(@PathVariable int id) {

        Person p = new Person();
        p.setAge(1);
        p.setLastName("Jan ąąłłś");
        p.setName("Kowalski");

        return p;

    }

    @RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person loada(@RequestParam int id) {

        Person p = new Person();
        p.setAge(id);
        p.setLastName("Jan ąąłłś");
        p.setName("Kowalski");

        return p;
    }

    @RequestMapping(method = RequestMethod.POST)
    public HttpEntity<?> save(@RequestBody Person person) {

        System.out.println(person);

        return ResponseEntity.created(HttpEntityUtil.uri("1")).build();
    }

}
