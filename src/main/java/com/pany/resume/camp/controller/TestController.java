package com.pany.resume.camp.controller;

import com.pany.resume.camp.domain.TestDTO;
import com.pany.resume.camp.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * ==============================
 * @Description:    TestController
 * @Author:         pany
 * @CreateDate:     2019/2/2 16:12
 * @Version:        1.0
 * ============================== 
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private ITestService testService;

    @ResponseBody
    @GetMapping("/get")
    public List<TestDTO> getTest(){
        List<TestDTO> tests = testService.getTest();
        return tests;
    }

}
