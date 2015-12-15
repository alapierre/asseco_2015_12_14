package pl.sages.spring.lab.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class Client extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @Embedded
    private Person person;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
