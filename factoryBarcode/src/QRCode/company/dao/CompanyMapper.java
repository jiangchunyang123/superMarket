package QRCode.company.dao;

import QRCode.company.model.Company;
import QRCode.task.model.Task;
import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    public List<Company> queryByModel(Company t);
}