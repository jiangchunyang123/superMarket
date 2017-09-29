/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.mapper;

import spmkt.deal.model.OrderModel;
import spmkt.deal.model.StockDealModel;

/**
 *
 * @author Administrator
 */
public interface CashDealMapper {

    OrderModel findMaxIdOrder();

    public int insertOrder(OrderModel order);

    public int insertDeal(StockDealModel deal);


}
