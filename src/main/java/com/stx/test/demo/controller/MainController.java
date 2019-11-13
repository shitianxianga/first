package com.stx.test.demo.controller;

import com.stx.test.demo.pojo.ContractQueryVo;
import com.stx.test.demo.pojo.Order;
import com.stx.test.demo.service.ContractService;
import com.stx.test.demo.untils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    ContractService contractService;

    /**
     * eiditPeople：stx
     * @param contractQueryVo
     * @return
     * 新增合同功能
     * @RequestBody 用来接收json
     */
    @RequestMapping("/add")
    @ResponseBody
    public  String  addContract(@RequestBody ContractQueryVo contractQueryVo)
    {

        contractService.add(contractQueryVo);
        return "success";
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
        return  "success";
    }


}
