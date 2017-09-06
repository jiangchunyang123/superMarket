/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *订单详情类
 * @author Administrator
 */
public class StockDealModel {

    private int id;
    private int stockId;
    private String stockName;
    private BigDecimal price;
    private Date dealdate;
    private String tradeid;
   
    
    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }

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

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }
}
