package com.pany.resume.camp.dao;

import com.pany.resume.camp.domain.KnAreaDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ==============================
 * @Description:    KnAreaMapper
 * @Author:         激流丶
 * @CreateDate:     2019/2/7 13:07
 * @Version:        1.0
 * ============================== 
 */
@Repository
public interface KnAreaMapper {

    /**
     *
     * @Title: getAreas
     * @Description: 查询所有的域
     * @param []
     * @return java.util.List<com.pany.resume.camp.domain.KnAreaDTO>
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/7 13:08
     */
    public List<KnAreaDTO> getAreas();

    /**
     *
     * @Title: addArea
     * @Description: 增加专区
     * @param [areaDTO]
     * @return void
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:08
     */
    public void addArea(KnAreaDTO areaDTO);


}