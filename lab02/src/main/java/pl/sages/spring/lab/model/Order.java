package pl.sages.spring.lab.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name = "Orders")
public class Order {

    @Id
    private Long id;

    private Date date;

    @OneToMany
    private List<OrderElement> positions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderElement> getPositions() {
        return positions;
    }

    public void setPositions(List<OrderElement> positions) {
        this.positions = positions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    //    private Address RecipientAddress;
    //    private Address SenderAddress;

}
