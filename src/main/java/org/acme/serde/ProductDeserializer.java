package org.acme.serde;

import org.acme.beans.Product;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ProductDeserializer extends JsonbDeserializer<Product> {
    public ProductDeserializer() {
        super(Product.class);
    }
}