package com.huang.dao;

import com.huang.pojo.DdMenus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DdMenusMapper {

    List<DdMenus> loadDdMenusList();

}
