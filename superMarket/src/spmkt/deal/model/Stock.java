/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.model;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
class Stock {
    private int id;
    private BigDecimal price;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
