package com.stx.test.demo.service;

import com.stx.test.demo.pojo.Contract;
import com.stx.test.demo.pojo.ContractQueryVo;

public interface ContractService {

    public void add(ContractQueryVo  queryVo);
    void edit(ContractQueryVo contractQueryVo);
}
