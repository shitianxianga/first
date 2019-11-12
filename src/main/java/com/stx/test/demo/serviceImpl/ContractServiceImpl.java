package com.stx.test.demo.serviceImpl;
import com.stx.test.demo.mapper.ContractMapper;
import com.stx.test.demo.mapper.OrderMapper;
import com.stx.test.demo.pojo.Contract;
import com.stx.test.demo.pojo.ContractQueryVo;
import com.stx.test.demo.pojo.Order;
import com.stx.test.demo.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ContractServiceImpl  implements ContractService {

    @Autowired
    ContractMapper contractMapper;
    @Autowired
    OrderMapper orderMapper;

    @Override
    //开启事务
    @Transactional
    /**
     * editPeople：stx
     * 为合同生成uuid作为id，分别调用合同和订单的mapper进行保存。
     */
    public void add(ContractQueryVo contractQueryVo) {

        String uuid= UUID.randomUUID().toString();
        contractQueryVo.getContract().setcId(uuid);
        contractMapper.save(contractQueryVo.getContract());
        for (Order order:contractQueryVo.getOrders())
        {
            order.setcId(contractQueryVo.getContract().getcId());
            orderMapper.add(order);
        }

    }

    @Override
    //开启事务
    @Transactional
    /**
     * editPeople：stx
     * 修改功能
     * 分别调用合同和订单的mapper
     * 进行update操作
     */
    public void edit(ContractQueryVo contractQueryVo) {
        contractMapper.update(contractQueryVo.getContract());
        ArrayList<Integer> orders=new ArrayList<>();
        orders=orderMapper.selectAll(contractQueryVo.getContract().getcId());
        for (Order order:contractQueryVo.getOrders())
        {
            order.setcId(contractQueryVo.getContract().getcId());
            if (orders.contains(order.getoId())) {
                orderMapper.update(order);
            }
            else
            {
                orderMapper.add(order);
            }
        }
    }
}
