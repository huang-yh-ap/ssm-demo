package com.huang.dao;

import com.huang.pojo.DdMenus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DdMenusMapper {

    List<DdMenus> loadDdMenusList();

}
