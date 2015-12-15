package pl.sages.spring.lab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name="invoices")
public class Invoice {

    @Column(name="ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="SELLER_ADDRESS")
    @NotNull
    private Address sellerAddress;

    @Column(name="BUYER_ADDRESS")
    @NotNull
    private Address buyerAddress;

    @Column(name="ITEM")
    @ElementCollection()
    private List<InvoiceItem> invoiceItems;

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

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
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
