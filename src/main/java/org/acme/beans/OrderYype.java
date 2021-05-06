/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme.beans;

/**
 *
 * @author dhawkins
 */
public enum OrderYype {
    SUBMISSION("SUBMISSION"), UPDATE("UPDATE"), FULFILLMENT("FULLFILLMENT"), RETURN("RETURN");
    
    public final String value;
    
    private OrderYype(String value) {
        this.value = value;
    }
}
