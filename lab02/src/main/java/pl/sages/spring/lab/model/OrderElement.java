package pl.sages.spring.lab.model;

import javax.persistence.Id;

/**
 * Created by Administrator on 2015-12-15.
 */

public class OrderElement {

    @Id
    private Long id;

    private Long idProduct;

    private Long quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
