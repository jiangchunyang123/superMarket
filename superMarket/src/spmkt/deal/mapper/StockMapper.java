package spmkt.deal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import spmkt.deal.model.Stock;
import spmkt.deal.model.StockExample;

public interface StockMapper {
    int countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);
   Stock queryById(int id);

    public Stock queryStockByBarcode(String barCode);

    public int addStockPosition(@Param("barcode")String barcode,@Param("num") int num);
}