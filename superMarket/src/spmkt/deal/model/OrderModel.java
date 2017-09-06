/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.model;

import java.util.List;

/**
 *订单类
 * @author Administrator
 */
public class OrderModel {
    private int id;
    private String tradeId;
    private List<StockDealModel> stocks;

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

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }
    
}
