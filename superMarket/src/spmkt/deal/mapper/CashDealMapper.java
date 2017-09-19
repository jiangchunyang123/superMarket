/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.deal.mapper;

import spmkt.deal.model.OrderModel;

/**
 *
 * @author Administrator
 */
public interface CashDealMapper {

    OrderModel findMaxIdOrder();
}
