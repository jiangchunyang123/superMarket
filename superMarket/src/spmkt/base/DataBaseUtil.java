/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.base;

import java.io.IOException;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import spmkt.deal.model.OrderModel;
import java.util.Date;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import spmkt.deal.mapper.CashDealMapper;

/**
 *
 * @author Administrator
 */
public class DataBaseUtil {

    private static SqlSessionFactory sqlSessionFactory;

    public static int inserDeal(OrderModel order) {
        int i = 0;
        initTradeid(order);
        return i;
    }

    public static void initSqlsessionFactory() {
        if (sqlSessionFactory == null) {
            String resource = "spmkt/resources/mybatis.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException ex) {
                Logger.getLogger(DataBaseUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
    }

    public static void initTradeid(OrderModel order) {
        Date today = new Date();
        String todayStr = DateUtils.date2Str(today);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            CashDealMapper mapper = session.getMapper(CashDealMapper.class);
            order.setId(mapper.findMaxIdOrder()+1);
        } finally {
            session.close();
        }
        String tradeid = todayStr + "";
    }
}
