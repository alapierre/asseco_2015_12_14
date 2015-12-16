package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Product;
import pl.sages.spring.lab.model.ProductPrice;

import java.util.Date;

/**e
 * Created by Administrator on 2015-12-16.
 */
public interface ProductPriceDAO extends JpaRepository<ProductPrice, Long> {

    public ProductPrice findByProductIdAndDateFrom(Long id, Date dateFrom);
}
