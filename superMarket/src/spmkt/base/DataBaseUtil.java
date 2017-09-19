/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.base;

import java.io.IOException;

import java.io.InputStream;
import java.sql.SQLException;
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
    private static SqlSession sqlSession;
    private static final Logger logger = Logger.getLogger(DataBaseUtil.class.getName());
    private static ConcurrentHashMap<String, Object> mappers = new ConcurrentHashMap<String, Object>();

    public static int inserDeal(OrderModel order) {
        int i = 0;
        initTradeid(order);
        return i;
    }

    public static SqlSessionFactory initSqlsessionFactory() {
        if (sqlSessionFactory == null) {
            String resource = "config/mybatis.xml";
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

    public static SqlSession initSqlSession() {
        if (sqlSession == null) {
            sqlSession = initSqlsessionFactory().openSession(true);
        }
        return sqlSession;
    }

    public static String initTradeid(OrderModel order) {
        String todayStr = DateUtils.date2Str(new Date());
        CashDealMapper mapper = (CashDealMapper) getMapper(CashDealMapper.class);
        OrderModel maxOrder = mapper.findMaxIdOrder();
        String maxTradeid = maxOrder.getTradeid().substring(8);
        String newstTradeid = todayStr + (Integer.valueOf(maxTradeid) + 1);
        order.setTradeid(newstTradeid);
        return newstTradeid;
    }

    /**
     * 通过商品名获取详细信息
     * @param id
     * @return 
     */
    public static Stock queryStockByBarcode(String barCode) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        return mapper.queryStockByBarcode(barCode);
    }

    /**
     * 保存一个商品
     * @param stock 
     */
    public static int saveStock(Stock stock) {
    
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        int result = mapper.insert(stock);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     *获取mapper 
     */
    private static Object getMapper(Class<?> aClass) {
        if (mappers.get(aClass.getName()) == null) {
            sqlSession = sqlSessionFactory.openSession(true);
            mappers.put(aClass.getName(), sqlSession.getMapper(aClass));
        }
        return mappers.get(aClass.getName());
    }
}
