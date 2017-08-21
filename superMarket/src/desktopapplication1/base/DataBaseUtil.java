/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication1.base;

import desktopapplication1.deal.model.OrderModel;
import desktopapplication1.deal.model.StockDealModel;

/**
 *
 * @author Administrator
 */
public class DataBaseUtil {

    public static int inserDeal(OrderModel order) {
        int i = 0;
        initTradeid(order);
        return i;
    }

    private static void initTradeid(OrderModel order) {
    }
}
