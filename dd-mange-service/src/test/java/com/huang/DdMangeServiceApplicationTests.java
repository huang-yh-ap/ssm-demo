package com.huang;

import com.huang.dao.DdMenusMapper;
import com.huang.pojo.DdMenus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DdMangeServiceApplicationTests {

    @Autowired
    DdMenusMapper ddMenusMapper;


    @Test
    void contextLoads() {
        List<DdMenus> ddMenus = ddMenusMapper.loadDdMenusList();
        for (DdMenus ddMenu : ddMenus) {
            System.out.println(ddMenu);
        }


    }

}
