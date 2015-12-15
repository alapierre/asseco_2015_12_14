package pl.sages.spring.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class DemandOrder extends Order{

    private Long supplierId;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
