package com.pany.resume.camp.service;

import com.pany.resume.camp.domain.TestDTO;

import java.util.List;

/**
 * ==============================
 * @Description:    ITestService
 * @Author:         pany
 * @CreateDate:     2019/2/2 15:59
 * @Version:        1.0
 * ============================== 
 */
public interface ITestService {

    public List<TestDTO> getTest();
}
