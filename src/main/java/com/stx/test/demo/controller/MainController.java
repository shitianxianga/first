package com.stx.test.demo.controller;

import com.stx.test.demo.pojo.ContractQueryVo;
import com.stx.test.demo.pojo.Order;
import com.stx.test.demo.service.ContractService;
import com.stx.test.demo.untils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    ContractService contractService;

    /**
     * eiditPeople：stx
     * @param s
     * @return
     * 新增合同功能
     * @RequestBody 用来接收json
     */
    @RequestMapping("/add")
    public  String  addContract( @RequestParam("s") String s)
    {
        ContractQueryVo contractQueryVo= JsonUtils.jsonToPojo(s,ContractQueryVo.class);
        contractService.add(contractQueryVo);
        return "index";
    }

    /**
     * editPeople：stx
     * @param contractQueryVo
     * @return
     * @RequestBody 用来接收json
     */
    @RequestMapping("/edit")
    public  String  editContract(@RequestBody ContractQueryVo contractQueryVo)
    {
        contractService.edit(contractQueryVo);
        return  "index";
    }


}
