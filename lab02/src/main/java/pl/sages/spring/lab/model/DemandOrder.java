package pl.sages.spring.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class DemandOrder extends Order{

    private Long supplierId;

    private List<OrderElement> orderElements;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public List<OrderElement> getOrderElements() {
        return orderElements;
    }

    public void setOrderElements(List<OrderElement> orderElements) {
        this.orderElements = orderElements;
    }
}
