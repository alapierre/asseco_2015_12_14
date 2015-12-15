package pl.sages.spring.lab.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Product extends BaseEntity{
    private String catalogNumber;
    private String name;
    private String description;
    private String descriptionLink;
    private long stockCount;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ProductPrice> prices;

    @ManyToMany(fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
    @JoinTable(name = "PRODUCT_CATEGORIES", joinColumns=@JoinColumn(name="PRODUCT_ID"), inverseJoinColumns = @JoinColumn(name="CATEGORY_ID"))
    private Collection<Category> categories;

    @OneToOne
    @JoinColumn(name = "MANUFACTURER_ID")
    private Manufacturer manufacturer;

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLink() {
        return descriptionLink;
    }

    public void setDescriptionLink(String descriptionLink) {
        this.descriptionLink = descriptionLink;
    }

    public Set<ProductPrice> getPrices() {
        return prices;
    }

    public void setPrices(Set<ProductPrice> prices) {
        this.prices = prices;
    }
}
