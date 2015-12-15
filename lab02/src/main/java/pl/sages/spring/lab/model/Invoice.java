package pl.sages.spring.lab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class Invoice extends BaseEntity{

    @NotNull
    private Contact seller;

    @NotNull
    private Contact buyer;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoice")
    private List<InvoiceItem> items;

    @Column(name="PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name="PAYMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    public Contact getSeller() {
        return seller;
    }

    public void setSeller(Contact seller) {
        this.seller = seller;
    }

    public Contact getBuyer() {
        return buyer;
    }

    public void setBuyer(Contact buyer) {
        this.buyer = buyer;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
