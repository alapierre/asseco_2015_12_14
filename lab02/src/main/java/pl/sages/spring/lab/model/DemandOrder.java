package pl.sages.spring.lab.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class DemandOrder extends Order{

    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderItem> orderElements;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<OrderItem> getOrderElements() {
        return orderElements;
    }

    public void setOrderElements(List<OrderItem> orderElements) {
        this.orderElements = orderElements;
    }
}
