package pl.sages.spring.lab.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */

public class DemandOrder extends Order{

    private Long supplierId;

    @OneToMany(mappedBy = "order", orphanRemoval = true, cascade = CascadeType.ALL)
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
