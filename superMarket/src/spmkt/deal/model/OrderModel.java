/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *订单类
 * @author Administrator
 */
public class OrderModel {

    private int id;
    private String tradeid;
    private Date createDate;
    private String status;
    private List<StockDealModel> stocks;
    private BigDecimal totalPrice;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<StockDealModel> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockDealModel> stocks) {
        this.stocks = stocks;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }
}
