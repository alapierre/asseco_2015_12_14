package pl.sages.spring.lab.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */
//@Entity
//@Table(name="INVOICES")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_ID", unique = true, nullable = false)
    private Long id;

    @Column(name="SELLER_CONTACT")
    @NotNull
    private Contact sellerContact;

    @Column(name="BUYER_CONTACT")
    @NotNull
    private Contact buyerContact;

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

    public Contact getSellerAddress() {
        return sellerContact;
    }

    public void setSellerAddress(Contact sellerAddress) {
        this.sellerContact = sellerAddress;
    }

    public Contact getBuyerAddress() {
        return buyerContact;
    }

    public void setBuyerAddress(Contact buyerAddress) {
        this.buyerContact = buyerAddress;
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
