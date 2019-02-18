package com.pany.resume.camp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pany.resume.camp.dao.TestMapper;
import com.pany.resume.camp.domain.TestDTO;
import com.pany.resume.camp.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ==============================
 * @Description:    TestServiceImpl
 * @Author:         pany
 * @CreateDate:     2019/2/2 16:00
 * @Version:        1.0
 * ============================== 
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper mapper;

    @Override
    public List<TestDTO> getTest() {
        List<TestDTO> tests = mapper.getTest();
        System.out.println(JSONObject.toJSONString(tests, true));
        return mapper.getTest();
    }
}
