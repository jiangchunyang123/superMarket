/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication1.deal.mapper;

import desktopapplication1.deal.model.OrderModel;

/**
 *
 * @author Administrator
 */
public interface CashDealMapper {

    OrderModel findMaxIdOrder();
}
