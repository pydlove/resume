package com.pany.resume.camp.controller;

import com.alibaba.fastjson.JSONObject;
import com.pany.resume.camp.domain.KnAreaDTO;
import com.pany.resume.camp.service.IKnAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * ==============================
 * @Description:    KnAreaController
 * @Author:         激流丶
 * @CreateDate:     2019/2/7 13:55
 * @Version:        1.0
 * ==============================
 */
@RestController
@RequestMapping("/area")
public class KnAreaController {

    @Autowired
    private IKnAreaService areaService;

    /**
     *
     * @Title:
     * @Description: 跳转到增加页面
     * @param
     * @return
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:12
     */
    @RequestMapping("/open/addPage")
    public ModelAndView openAddPage(){
        return new ModelAndView("/function/area/addArea", "", null);
    }

    /**
     *
     * @Title: addArea
     * @Description: 增加专区
     * @param [areaDTO]
     * @return java.lang.String
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:11
     */
    @RequestMapping("/add")
    public String addArea(KnAreaDTO areaDTO){
        String flag = areaService.addArea(areaDTO);
        return flag;
    }

}
