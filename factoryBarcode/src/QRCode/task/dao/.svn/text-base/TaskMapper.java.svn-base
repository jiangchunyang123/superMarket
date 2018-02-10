package QRCode.task.dao;

import QRCode.product.model.Prod;
import QRCode.task.model.Task;
import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);

    public List<Task> queryByModel(Task task);
}