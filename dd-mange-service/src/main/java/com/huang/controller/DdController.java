package com.huang.controller;

import com.huang.pojo.DdMenus;
import com.huang.service.DdMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DdController {

    @Autowired
    DdMenusService ddMenusService;

    @GetMapping("/loadDdMenusList")
    public List<DdMenus> loadDdMenusList(){

        return ddMenusService.loadDdMenusList();
    }



}
