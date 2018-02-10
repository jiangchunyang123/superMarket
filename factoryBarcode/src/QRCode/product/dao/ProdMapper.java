package QRCode.product.dao;

import QRCode.product.model.Prod;
import java.util.List;

public interface ProdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prod record);

    int insertSelective(Prod record);

    Prod selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prod record);

    int updateByPrimaryKey(Prod record);
    List<Prod> queryByModel(Prod prod);
}