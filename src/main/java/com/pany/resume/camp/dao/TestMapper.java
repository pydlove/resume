package com.pany.resume.camp.dao;

import com.pany.resume.camp.domain.TestDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ==============================
 * @Description:    TestMapper
 * @Author:         pany
 * @CreateDate:     2019/2/2 15:45
 * @Version:        1.0
 * ============================== 
 */
@Repository
public interface TestMapper {

    public List<TestDTO> getTest();
}
