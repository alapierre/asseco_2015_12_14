package pl.sages.spring.lab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name="INVOICES")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_ID", unique = true, nullable = false)
    private Long id;

    @Column(name="SELLER_ADDRESS")
    @NotNull
    private Address sellerAddress;

    @Column(name="BUYER_ADDRESS")
    @NotNull
    private Address buyerAddress;

    @Column(name="ITEM")
    @ElementCollection()
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoice")
    private List<InvoiceItem> items;

    @Column(name="PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name="PAYMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(Address sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public Address getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(Address buyerAddress) {
        this.buyerAddress = buyerAddress;
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
