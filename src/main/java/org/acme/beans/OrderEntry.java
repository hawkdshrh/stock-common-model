package org.acme.beans;

import io.quarkus.runtime.annotations.RegisterForReflection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_entry")
@RegisterForReflection
public class OrderEntry {
    private Product product;
    private Integer quantity;
    private Long orderEntryId;
    private Long orderCode;

    public OrderEntry() {

    }

    public OrderEntry(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    @Id
    @SequenceGenerator(name="orderEntrySeq", sequenceName="order_entry_id_seq", allocationSize=1, initialValue=1)
    @GeneratedValue(generator="orderEntrySeq")
    public Long getOrderEntryId() {
        return this.orderEntryId;
    }
    
    public void setOrderEntryId(Long orderEntryId) {
        this.orderEntryId = orderEntryId;
    }
    
    public Long getOrderCode() {
        return this.orderCode;
    }
    
    public void setOrderCode(Long ordeCode) {
        this.orderCode = orderCode;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderEntry other = (OrderEntry) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        } else if (!quantity.equals(other.quantity))
            return false;
        return true;
    }

}
