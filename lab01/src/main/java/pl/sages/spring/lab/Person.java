/**
 * Copyright 2015-12-14 the original author or authors.
 */
package pl.sages.spring.lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Component
public class Person {

    @Value("Michal")
    private String name;

    @Value("Jasinski")
    private String lastName;

    @Value("Gdansk:Warszawska:5")
    private Address adress;

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adres1=" + adress +
                '}';
    }
}
