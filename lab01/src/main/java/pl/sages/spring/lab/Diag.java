package pl.sages.spring.lab;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015-12-14.
 */
@Service
public class Diag implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        System.out.println(s + " 1> " + o.getClass());
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        System.out.println(s + " 2> " + o.getClass());


        return o;
    }
}
