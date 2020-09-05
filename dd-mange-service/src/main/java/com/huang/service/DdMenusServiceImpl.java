package com.huang.service;

import com.huang.dao.DdMenusMapper;
import com.huang.pojo.DdMenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DdMenusServiceImpl implements  DdMenusService {

    @Autowired
    DdMenusMapper ddMenusMapper;


    @Override
    public List<DdMenus> loadDdMenusList() {
        return ddMenusMapper.loadDdMenusList();
    }
}
