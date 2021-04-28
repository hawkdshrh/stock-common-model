package org.acme.serde;

import org.acme.beans.SupplyUpdate;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SupplyUpdateDeserializer extends JsonbDeserializer<SupplyUpdate> {
    public SupplyUpdateDeserializer() {
        super(SupplyUpdate.class);
    }
}