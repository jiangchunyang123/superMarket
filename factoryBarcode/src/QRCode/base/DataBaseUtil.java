/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.base;

import QRCode.base.dao.ParamMapper;
import QRCode.base.model.Param;
import QRCode.company.dao.CompanyMapper;
import QRCode.company.model.Company;
import QRCode.compnents.ComponentModel;
import QRCode.deal.dao.DealDetailMapper;
import QRCode.deal.dao.DealMapper;
import QRCode.deal.model.Deal;
import QRCode.deal.model.DealDetail;
import QRCode.product.model.Prod;
import java.io.IOException;

import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import QRCode.product.dao.ProdMapper;
import QRCode.product.dao.StockMapper;
import QRCode.product.model.Stock;
import QRCode.product.model.StockExample;
import QRCode.task.dao.BoxConnProdMapper;
import QRCode.task.dao.TaskMapper;
import QRCode.task.model.BoxConnProd;
import QRCode.task.model.Task;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DataBaseUtil {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static final Logger logger = Logger.getLogger(DataBaseUtil.class.getName());

    public static SqlSessionFactory initSqlsessionFactory() {
        if (sqlSessionFactory == null) {
            String resource = "QRCode/config/mybatis.xml";
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
            sqlSession = initSqlsessionFactory().openSession(false);
        }
        return sqlSession;
    }

    /**
     *获取mapper 
     */
    private static Object getMapper(Class<?> aClass) {
        sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession.getMapper(aClass);
    }

    public static List<Prod> queryProdByModel(Prod prod) {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        List<Prod> l = mapper.queryByModel(prod);
        sqlSession.close();
        return l;
    }

    public static List<Task> queryTaskByModel(Task task) {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        List<Task> l = mapper.queryByModel(task);
        sqlSession.close();
        return l;
    }

    public static List<Param> queryParamByModel(Param p) {
        ParamMapper mapper = (ParamMapper) getMapper(ParamMapper.class);
        List<Param> l = mapper.queryByModel(p);
        sqlSession.close();
        return l;
    }

    public static List<Param> queryParamByPid(String pid) {
        Param p = new Param();
        p.setPid(pid);
        List<Param> l = queryParamByModel(p);
        sqlSession.close();
        return l;
    }

    public static int saveProd(Prod prod) {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        int i = mapper.insertSelective(prod);
        sqlSession.close();
        return i;
    }

    public static Prod findProdByid(Integer id) {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        Prod prod = mapper.selectByPrimaryKey(id);
        sqlSession.close();
        return prod;
    }

    public static int updateProd(Prod prod) {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        int i = mapper.updateByPrimaryKey(prod);
        sqlSession.close();
        return i;
    }

    public static int delProd(Integer id) {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        int i = mapper.deleteByPrimaryKey(id);
        sqlSession.close();
        return i;
    }

    public static int saveTask(Task task) {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        int i = mapper.insertSelective(task);
        sqlSession.close();
        return i;
    }

    public static Task findTaskByid(Integer id) {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        Task task = mapper.selectByPrimaryKey(id);
        sqlSession.close();
        return task;
    }

    public static int updateTask(Task task) {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        int i = mapper.updateByPrimaryKey(task);
        sqlSession.close();
        return i;
    }

    public static int delTask(Integer id) {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        int i = mapper.deleteByPrimaryKey(id);
        sqlSession.close();
        return i;
    }

    public static List<ComponentModel> queryTaskForCombo() {
        TaskMapper mapper = (TaskMapper) getMapper(TaskMapper.class);
        Task t = new Task();
        List<Task> l = mapper.queryByModel(t);
        List<ComponentModel> lst = new ArrayList<ComponentModel>();
        if (l != null) {
            for (Task tl : l) {
                lst.add(new ComponentModel(tl.getTaskcode(), tl.getId().toString()));
            }
        }
        sqlSession.close();
        return lst;
    }

    public static List<ComponentModel> queryCompanyForCombo() {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        Company c = new Company();
        List<Company> l = mapper.queryByModel(c);
        List<ComponentModel> lst = new ArrayList<ComponentModel>();
        if (l != null) {
            for (Company tl : l) {
                lst.add(new ComponentModel(tl.getName(), tl.getId().toString()));
            }
        }
        sqlSession.close();
        return lst;
    }

    public static int saveCompany(Company comp) {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        int i = mapper.insertSelective(comp);
        sqlSession.close();
        return i;
    }

    public static Company findCompanyByid(Integer id) {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        Company prod = mapper.selectByPrimaryKey(id);
        sqlSession.close();
        return prod;
    }

    public static int updateCompany(Company prod) {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        int i = mapper.updateByPrimaryKey(prod);
        sqlSession.close();
        return i;
    }

    public static int delCompany(Integer id) {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        int i = mapper.deleteByPrimaryKey(id);
        sqlSession.close();
        return i;
    }

    public static List<Company> queryCompanyByModel(Company task) {
        CompanyMapper mapper = (CompanyMapper) getMapper(CompanyMapper.class);
        List<Company> l = mapper.queryByModel(task);
        sqlSession.close();
        return l;
    }

    public static List<ComponentModel> queryProdForCombo() {
        ProdMapper mapper = (ProdMapper) getMapper(ProdMapper.class);
        Prod t = new Prod();
        List<Prod> l = mapper.queryByModel(t);
        List<ComponentModel> lst = new ArrayList<ComponentModel>();
        if (l != null) {
            for (Prod tl : l) {
                lst.add(new ComponentModel(tl.getProdname(), tl.getId().toString()));
            }
        }
        sqlSession.close();
        return lst;
    }

    public static void insertBoxAndProdCode(BoxConnProd p) {
        BoxConnProdMapper mapper = (BoxConnProdMapper) getMapper(BoxConnProdMapper.class);
        mapper.insert(p);
        sqlSession.close();
    }

    public static int saveStock(Stock comp) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        int i = mapper.insertSelective(comp);
        sqlSession.close();
        return i;
    }

    public static Stock findStockByid(Integer id) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        Stock prod = mapper.selectByPrimaryKey(id);
        sqlSession.close();
        return prod;
    }

    public static Stock findStockByBarCode(String code) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        StockExample stockExample = new StockExample();
        stockExample.createCriteria().andBarcodeEqualTo(code);
        List<Stock> prod = mapper.selectByExample(stockExample);
        sqlSession.close();
        return prod == null || prod.isEmpty() ? null : prod.get(0);
    }

    public static int updateStock(Stock prod) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        int i = mapper.updateByPrimaryKeySelective(prod);
        sqlSession.close();
        return i;
    }

    public static int delStock(Integer id) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        int i = mapper.deleteByPrimaryKey(id);
        sqlSession.close();
        return i;
    }

    public static List<Stock> queryStockByModel(StockExample stock) {
        StockMapper mapper = (StockMapper) getMapper(StockMapper.class);
        List<Stock> l = mapper.selectByExample(stock);
        sqlSession.close();
        return l;
    }

    public static int saveDeal(Deal deal, List<DealDetail> list) {
        DealMapper mapper = (DealMapper) getMapper(DealMapper.class);
        DealDetailMapper detailMapper = (DealDetailMapper) getMapper(DealDetailMapper.class);
        int id = mapper.insertSelective(deal);
        int result = 0;
        for (DealDetail detail : list) {
            detail.setDealId(id);
           result+= detailMapper.insertSelective(detail);
        }
        sqlSession.close();
        return result;
    }
}
