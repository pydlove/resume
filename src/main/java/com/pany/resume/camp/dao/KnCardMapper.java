package com.pany.resume.camp.dao;

import com.pany.resume.camp.domain.KnCardDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ==============================
 * @Description:    KnCardMapper
 * @Author:         激流丶
 * @CreateDate:     2019/2/3 12:13
 * @Version:        1.0
 * ============================== 
 */
@Repository
public interface KnCardMapper {

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
    public List<KnCardDTO> getCards();

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
    public void addCard(KnCardDTO cardDTO);

}