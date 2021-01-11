package com.jia.controller;

import com.jia.constantbean.CiContant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(CiContant.URI_GROUP)
public class TestController {


    @Value(value = "${name}")
    private  String name;

    @PostMapping(CiContant.URI_MODIFY +"/{ciId}")
    public  String getresult()  {

        return name;



    }
}
