package pl.sages.spring.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class DemandOrder {

    @Id
    private Long orderId;
    private Long supplierId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
