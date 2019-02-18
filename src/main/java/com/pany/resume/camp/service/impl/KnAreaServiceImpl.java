package com.pany.resume.camp.service.impl;

import com.pany.resume.camp.dao.KnAreaMapper;
import com.pany.resume.camp.domain.KnAreaDTO;
import com.pany.resume.camp.service.IKnAreaService;
import com.pany.resume.camp.utils.DateUtil;
import com.pany.resume.camp.utils.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ==============================
 * @Description:    KnAreaImpl
 * @Author:         激流丶
 * @CreateDate:     2019/2/7 13:12
 * @Version:        1.0
 * ============================== 
 */
@Slf4j
@Service
public class KnAreaServiceImpl implements IKnAreaService {

    @Autowired
    private KnAreaMapper areaMapper;

    @Override
    public List<KnAreaDTO> getAreas() {
        return areaMapper.getAreas();
    }

    @Override
    public String addArea(KnAreaDTO areaDTO) {
        String flag = "fail";
        try{
            String uuid = UuidUtil.getUuid();
            areaDTO.setId(uuid);
            areaDTO.setCreateTime(new Date());
            areaDTO.setUpdateTime(new Date());
            areaMapper.addArea(areaDTO);
            flag = "success";
        }catch(Exception e){
            log.error("增加专区失败", e);
        }
        return flag;
    }
}
