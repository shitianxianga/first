package com.stx.test.demo.mapper;

import com.stx.test.demo.pojo.Contract;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContractMapper {
    public void save(Contract contract);

    void update(Contract contract);
}
