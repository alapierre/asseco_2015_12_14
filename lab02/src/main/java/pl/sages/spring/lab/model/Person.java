package pl.sages.spring.lab.model;

import javax.persistence.Embeddable;

/**
 * Created by Administrator on 2015-12-15.
 */
@Embeddable
public class Person{
    private String name;
    private String lastName;
    private String nip;
    private String regon;

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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }
}
