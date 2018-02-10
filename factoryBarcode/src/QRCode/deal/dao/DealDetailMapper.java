package QRCode.deal.dao;

import QRCode.deal.model.DealDetail;
import QRCode.deal.model.DealDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealDetailMapper {
    long countByExample(DealDetailExample example);

    int deleteByExample(DealDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealDetail record);

    int insertSelective(DealDetail record);

    List<DealDetail> selectByExample(DealDetailExample example);

    DealDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealDetail record, @Param("example") DealDetailExample example);

    int updateByExample(@Param("record") DealDetail record, @Param("example") DealDetailExample example);

    int updateByPrimaryKeySelective(DealDetail record);

    int updateByPrimaryKey(DealDetail record);
}