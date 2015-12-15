package pl.sages.spring.lab;

import org.springframework.stereotype.Service;

import java.beans.PropertyEditorSupport;

/**
 * Created by Administrator on 2015-12-14.
 */

public class AddressEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Address address = new Address();

        String[] addr = text.split(":");
        address.setCity(addr[0]);
        address.setStreet(addr[1]);
        address.setHouseNo(Integer.valueOf(addr[2]));

        setValue(address);
    }
}
