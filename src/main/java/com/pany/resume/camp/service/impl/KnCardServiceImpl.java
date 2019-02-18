package com.pany.resume.camp.service.impl;

import com.pany.resume.camp.dao.KnCardMapper;
import com.pany.resume.camp.domain.KnCardDTO;
import com.pany.resume.camp.service.IKnCardService;
import com.pany.resume.camp.utils.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * ==============================
 * @Description:    KnCardServiceImpl
 * @Author:         激流丶
 * @CreateDate:     2019/2/9 10:37
 * @Version:        1.0
 * ============================== 
 */
@Slf4j
@Service
public class KnCardServiceImpl implements IKnCardService {

    @Autowired
    private KnCardMapper cardMapper;

    @Override
    public List<KnCardDTO> getCards(KnCardDTO card) {
        return cardMapper.getCards();
    }

    @Override
    public String addCard(KnCardDTO cardDTO) {
        String flag = "fail";
        try{
            String uuid = UuidUtil.getUuid();
            cardDTO.setId(uuid);
            cardDTO.setCreateTime(new Date());
            cardDTO.setUpdateTime(new Date());
            cardMapper.addCard(cardDTO);
            flag = "success";
        }catch(Exception e){
            log.error("增加帖子失败", e);
        }
        return flag;
    }
}
