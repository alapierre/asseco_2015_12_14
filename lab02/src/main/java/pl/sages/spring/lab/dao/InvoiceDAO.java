package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Contact;
import pl.sages.spring.lab.model.Invoice;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface InvoiceDAO extends JpaRepository<Invoice, Long> {

    public Invoice findBySellerAddressCity(String city);

    public Invoice findByBuyerAddressCity(String city);

}
