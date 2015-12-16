package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.sages.spring.lab.dao.InvoiceDAO;
import pl.sages.spring.lab.dao.InvoiceItemDAO;
import pl.sages.spring.lab.model.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class InvoiceTest {

    @Autowired
    private InvoiceDAO invoiceDAO;

    @Autowired
    private InvoiceItemDAO invoiceItemDAO;


    @Test
    @Transactional
    public void testInvoice_findByBuyerAddressCity() {

        Invoice invoice = new Invoice();
        Contact buyer = new Contact();
        Address buyerAddress = new Address();
        buyerAddress.setCity("Wawa");
        buyer.setAddress(buyerAddress);
        invoice.setBuyer(buyer);
        invoiceDAO.save(invoice);

        Invoice res = invoiceDAO.findByBuyerAddressCity(buyerAddress.getCity());
        System.out.println(res);

        assert res.getBuyer().getAddress().getCity() == buyerAddress.getCity();
    }

    @Test
    @Transactional
    public void testInvoice_findBySellerAddressCity() {

        Invoice invoice = new Invoice();
        Contact seller = new Contact();
        Address sellerAddress = new Address();
        sellerAddress.setCity("Krakow");
        seller.setAddress(sellerAddress);
        invoice.setSeller(seller);
        invoiceDAO.save(invoice);

        Invoice res = invoiceDAO.findBySellerAddressCity(sellerAddress.getCity());
        System.out.println(res);

        assert res.getSeller().getAddress().getCity() == sellerAddress.getCity();
    }

    @Test
    @Transactional
    public void testItemInvoice_findByNameLikeIgnoreCase() {

        InvoiceItem invoiceItem = new InvoiceItem();
        invoiceItem.setInvoice(new Invoice());
        invoiceItem.setProduct(new Product());
        invoiceItem.setName("test");
        invoiceItemDAO.save(invoiceItem);
        //invoiceItemDAO.flush();

        InvoiceItem res = invoiceItemDAO.findByNameLikeIgnoreCase("%test");
        System.out.println(res);

        assert res.getName() == invoiceItem.getName();
    }


}
