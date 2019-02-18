package com.pany.resume.camp.service;

import com.pany.resume.camp.domain.KnCardDTO;

import java.util.List;

/**
 * ==============================
 * @Description:    IKnCardService
 * @Author:         激流丶
 * @CreateDate:     2019/2/3 12:21
 * @Version:        1.0
 * ============================== 
 */
public interface IKnCardService {

    /**
     *
     * @Title: addCard
     * @Description: 获取所有帖子
     * @param [cardDTO]
     * @return List
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/9 10:41
     */
    public List<KnCardDTO> getCards(KnCardDTO card);

    /**
     *
     * @Title: addCard
     * @Description: 增加帖子
     * @param [cardDTO]
     * @return String
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/9 10:41
     */
    public String addCard(KnCardDTO cardDTO);

}
