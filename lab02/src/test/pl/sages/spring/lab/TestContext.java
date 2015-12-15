package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sages.spring.lab.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2015-12-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
public class TestContext {

    @PersistenceContext
    EntityManager em;

    @Test
    @Transactional
    public void test() {

       // em.createNativeQuery("insert into USERS (login,password,enabled) values('jck', 'aqq', 1)").executeUpdate();


        User jck = new User();
        jck.setLogin("jck");
        jck.setPassword("aqq");
        em.persist(jck);


        User user = em.find(User.class, "jck");

        System.out.printf(user.toString());

    }
}
