package spmkt.deal.mapper;

import src.spmkt.deal.model.People;

public interface PeopleMapper {
    int deleteByPrimaryKey(String id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}