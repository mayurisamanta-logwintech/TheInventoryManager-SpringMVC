package theInventoryManager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String name;

    private String description;

    private Long pricePerItem;

    private Long quantity;

    private Long totalPrice;

    public Inventory() {
    }

    public Inventory(Integer id, String name, String description, Long pricePerItem, Long quantity, Long totalPrice) {
        Id = id;
        this.name = name;
        this.description = description;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pricePerItem=" + pricePerItem +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public Long getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(Long pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
