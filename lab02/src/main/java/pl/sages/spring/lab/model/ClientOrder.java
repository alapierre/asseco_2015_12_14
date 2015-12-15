package pl.sages.spring.lab.model;

import javax.persistence.Entity;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class ClientOrder extends Order {

    private Long clientId;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
