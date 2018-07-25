package com.ssm.test;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wiseacre on 2018/7/25.
 */
public class MybatisTest extends BaseTest{

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatis(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());
    }
}
