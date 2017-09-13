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
import java.util.concurrent.ConcurrentHashMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import spmkt.deal.mapper.CashDealMapper;
import spmkt.deal.mapper.StockMapper;

import spmkt.deal.model.Stock;

/**
 *
 * @author Administrator
 */
public class DataBaseUtil {

    private static SqlSessionFactory sqlSessionFactory;
    private static Logger logger = Logger.getLogger(DataBaseUtil.class.getName());
    private static ConcurrentHashMap<String, Object> mappers = new ConcurrentHashMap<String, Object>();

    public static int inserDeal(OrderModel order) {
        int i = 0;
        initTradeid(order);
        return i;
    }

    public static SqlSessionFactory initSqlsessionFactory() {
        if (sqlSessionFactory == null) {
            String resource = "spmkt/resources/mybatis.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }

    public static String initTradeid(OrderModel order) {
        Date today = new Date();
        String todayStr = DateUtils.date2Str(today);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            CashDealMapper mapper = session.getMapper(CashDealMapper.class);
            order.setId(mapper.findMaxIdOrder() + 1);
        } finally {
            session.close();
        }
        String tradeid = todayStr + "";
        return tradeid;
    }

    public static Stock queryStockById(int id) {
        SqlSession session = sqlSessionFactory.openSession();

        try {
            StockMapper mapper = session.getMapper(StockMapper.class);
            Stock s = mapper.queryById(id);
            return s;
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        } finally {
            session.close();
        }
        return null;
    }

    public static void saveStock(Stock stock) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StockMapper mapper = session.getMapper(StockMapper.class);

            mapper.insert(stock);
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        } finally {
            session.close();
        }

    }
}
