/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication1.base;

import desktopapplication1.deal.model.OrderModel;
import java.util.Date;

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
        Date today = new Date();
        String todayStr = DateUtils.date2Str(today);
       
        String tradeid = todayStr+"";
    }
    
}
