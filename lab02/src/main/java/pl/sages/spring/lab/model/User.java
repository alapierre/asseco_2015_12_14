/**
 * Copyright 2015-12-15 the original author or authors.
 */
package pl.sages.spring.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */

// Produkty (Product)
// Kategorie (Category)
// Producenci (Manufacturer)

@Entity
@Table(name = "users")
public class User {

    @Id
    private String login;
    private String password;
    private boolean enabled = true;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
               "login='" + login + '\'' +
               ", password='" + password + '\'' +
               ", enabled=" + enabled +
               '}';
    }
}
