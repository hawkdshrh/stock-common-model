package org.acme.beans;

import java.util.Arrays;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Shipment {
    private String orderCode;
    private ShipmentLineEntry[] shipmentLineEntries;

    public Shipment() {

    }

    public Shipment(String orderCode, ShipmentLineEntry[] shipmentLineEntries) {
        this.orderCode = orderCode;
        this.shipmentLineEntries = shipmentLineEntries;
    }

    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
    public ShipmentLineEntry[] getShipmentLineEntries() {
        return shipmentLineEntries;
    }
    public void setShipmentLineEntries(ShipmentLineEntry[] shipmentLineEntries) {
        this.shipmentLineEntries = shipmentLineEntries;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderCode == null) ? 0 : orderCode.hashCode());
        result = prime * result + Arrays.hashCode(shipmentLineEntries);
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
        Shipment other = (Shipment) obj;
        if (orderCode == null) {
            if (other.orderCode != null)
                return false;
        } else if (!orderCode.equals(other.orderCode))
            return false;
        if (!Arrays.equals(shipmentLineEntries, other.shipmentLineEntries))
            return false;
        return true;
    }

    
}
