package com.pany.resume.camp.service;

import com.pany.resume.camp.domain.KnAreaDTO;

import java.util.List;

/**
 * ==============================
 * @Description:    IKnAreaService
 * @Author:         激流丶
 * @CreateDate:     2019/2/7 13:11
 * @Version:        1.0
 * ============================== 
 */
public interface IKnAreaService {

    /**
     *
     * @Title: getAreas
     * @Description: 获取所有的域
     * @param []
     * @return java.util.List<com.pany.resume.camp.domain.KnAreaDTO>
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/7 13:11
     */
    public List<KnAreaDTO> getAreas();

    /**
     *
     * @Title: addArea
     * @Description: 增加专区
     * @param [areaDTO]
     * @return java.lang.String
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:06
     */
    public String addArea(KnAreaDTO areaDTO);

    
}
