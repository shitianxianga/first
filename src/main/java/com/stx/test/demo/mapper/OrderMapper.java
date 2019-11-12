package com.stx.test.demo.mapper;

import com.stx.test.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface OrderMapper {
    void add(Order order);

    void update(Order order);

    ArrayList<Integer> selectAll(String cId);
}
