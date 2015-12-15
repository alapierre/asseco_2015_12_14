package pl.sages.spring.lab.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name="ADDRESSES")
public class Address {

    @Column(name="ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="CITY")
    String city;

    @Column(name="STREET")
    String street;

    @Column(name="NUMBER")
    Integer number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
