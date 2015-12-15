package pl.sages.spring.lab.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
//@Entity
//@Table(name = "Orders")
public class Order extends BaseEntity {


    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Column(name="ITEM")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<OrderItem> items;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
