package pl.sages.spring.lab.model;

import javax.persistence.Id;

/**
 * Created by Administrator on 2015-12-15.
 */
//@Entity
public class Supplier {

    @Id
    private Long supplierId;
    private String name;
    private String phoneNumebr;
    private String email;
    private String nip;
    private String ownerName;
    private String ownerSuername;
    private String ownerPhoneNumber;
    private String ownerEmail;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumebr() {
        return phoneNumebr;
    }

    public void setPhoneNumebr(String phoneNumebr) {
        this.phoneNumebr = phoneNumebr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSuername() {
        return ownerSuername;
    }

    public void setOwnerSuername(String ownerSuername) {
        this.ownerSuername = ownerSuername;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }
}
