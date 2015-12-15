package pl.sages.spring.lab.model;

/**
 * Created by Administrator on 2015-12-15.
 */
public class Manufacturer {
    private long id;
    private String companyName;
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
