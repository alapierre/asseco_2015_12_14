package pl.sages.spring.lab.model;

/**
 * Created by Administrator on 2015-12-15.
 */

public class Client extends BaseEntity {

    private Contact contact;

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
