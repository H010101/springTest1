package com.hwqing.springBootTest.controller;

import com.hwqing.springBootTest.dao.Test1Dao;
import com.hwqing.springBootTest.entity.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test1")
public class Test1Controller {

    @Autowired
    private Test1Dao test1;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Test1> findAll() {
        List<Test1> list = test1.findAll();
        return list;
    }

}
