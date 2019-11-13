package com.stx.test.demo;

import com.stx.test.demo.mapper.ContractMapper;
import com.stx.test.demo.pojo.Contract;
import com.stx.test.demo.pojo.ContractQueryVo;
import com.stx.test.demo.pojo.Order;
import com.stx.test.demo.service.ContractService;
import com.stx.test.demo.untils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
;


@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Autowired
    ContractService contractService;
    Logger logger= LoggerFactory.getLogger(DemoApplicationTests.class);


    @Test
    void contextLoads() {
    }
    //测试新增合同的接口
    @Test
    void add(){
        ContractQueryVo contractQueryVo=new ContractQueryVo();
        Contract contract=new Contract();
        Order order=new Order();
        Order order1=new Order();
        contract.setcDate(new Date());
        contract.setcUser("xiaoming");
        order.setoId(100);
        order1.setoId(200);
        order.setoPrice(100);
        order1.setoPrice(200);
        List<Order> lists=new ArrayList<Order>();
        lists.add(order);
        lists.add(order1);
        contractQueryVo.setContract(contract);
        contractQueryVo.setOrders(lists);
        logger.info(JsonUtils.objectToJson(contractQueryVo));
        contractService.add(contractQueryVo);
    }

    //测试修改功能
    @Test

    void edit(){
        ContractQueryVo contractQueryVo=new ContractQueryVo();
        Contract contract=new Contract();
        Order order=new Order();
        Order order1=new Order();
        contract.setcId("1d5b2bf8-52bc-43dd-a479-bb74600cc330");
        contract.setcDate(new Date());
        contract.setcUser("xiaoli");
        order.setoId(1);
        order1.setoId(4);
        order.setoPrice(1000);
        order1.setoPrice(300);
        List<Order> lists=new ArrayList<Order>();
        lists.add(order);
        lists.add(order1);
        contractQueryVo.setContract(contract);
        contractQueryVo.setOrders(lists);
        contractService.edit(contractQueryVo);
    }

}
