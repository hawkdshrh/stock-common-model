package org.acme.beans;

import java.util.Arrays;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Shipment {
    private String orderId;
    private ShipmentLineEntry[] shipmentLineEntries;

    public Shipment() {

    }

    public Shipment(String orderId, ShipmentLineEntry[] shipmentLineEntries) {
        this.orderId = orderId;
        this.shipmentLineEntries = shipmentLineEntries;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
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
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        } else if (!orderId.equals(other.orderId))
            return false;
        if (!Arrays.equals(shipmentLineEntries, other.shipmentLineEntries))
            return false;
        return true;
    }

    
}
