package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.DemandOrder;
import pl.sages.spring.lab.model.Supplier;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface DemandOrderDAO extends JpaRepository<DemandOrder, Long>{

    public List<DemandOrder> findBySupplierId(Long id);
}
