package pl.sages.spring.lab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name="invoiceItems")
public class InvoiceItem {

    @Column(name="ID")
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="QUANTITY")
    private Long quantity;

    @Column(name="PRICE")
    private Long price;

    @Column(name="UNIT_PRICE")
    private Long unitPrice;

    @Column(name="TAX")
    private Long tax;

    @Column(name="PROMOTION")
    private Long promotion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Long getPromotion() {
        return promotion;
    }

    public void setPromotion(Long promotion) {
        this.promotion = promotion;
    }
}
