package com.sharding.vertical.slicing.test;

import com.sharding.vertical.slicing.dal.mapper.UserMapper;
import lombok.Getter;
import org.junit.Before;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/26 10:26 上午
 * description：
 */
@Getter
public class BaseTddTest {

    protected UserMapper userMapper;

    @Before
    public void init() throws Exception {
        // 确定的上下游服务

        // 不确定的上下游服务，直接mock出来
    }
}
