package org.acme.serde;

import org.acme.beans.Shipment;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ShipmentDeserializer extends JsonbDeserializer<Shipment> {
    public ShipmentDeserializer() {
        super(Shipment.class);
    }
}
