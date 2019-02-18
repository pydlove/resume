package com.pany.resume.camp.controller;

import com.pany.resume.camp.domain.KnAreaDTO;
import com.pany.resume.camp.domain.KnCardDTO;
import com.pany.resume.camp.service.IKnAreaService;
import com.pany.resume.camp.service.IKnCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ==============================
 * @Description:    KnCardController
 * @Author:         激流丶
 * @CreateDate:     2019/2/3 12:32
 * @Version:        1.0
 * ==============================
 */
@RestController
@RequestMapping("/card")
public class KnCardController {

    @Autowired
    private IKnCardService cardService;
    @Autowired
    private IKnAreaService areaService;

    /**
     *
     * @Title: getCards
     * @Description: 跳转到简历页面
     * @param [card, model]
     * @return org.springframework.web.servlet.ModelAndView
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/9 9:56
     */
    @RequestMapping("/get")
    public ModelAndView getCards(KnCardDTO card, Model model){
        List<KnCardDTO> cards = cardService.getCards(card);
        List<KnAreaDTO> areas = areaService.getAreas();
        model.addAttribute("areas", areas);
        model.addAttribute("cards", cards);
        return new ModelAndView("/function/resume", "cardModel", model);
    }

    /**
     *
     * @Title: openAddPage
     * @Description: 打开增加帖子页面
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/9 9:59
     */
    @RequestMapping("/open/addPage")
    public ModelAndView openAddPage(Model model){
        List<KnAreaDTO> areas = areaService.getAreas();
        model.addAttribute("areas", areas);
        return new ModelAndView("/function/card/addCard", "cardModel", model);
    }

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
    @RequestMapping("/add")
    public String addCard(KnCardDTO cardDTO){
        String flag = cardService.addCard(cardDTO);
        return flag;
    }

    @RequestMapping("/open/more")
    public ModelAndView openMorePage(Model model, KnAreaDTO areaDTO){
        model.addAttribute("areaName", areaDTO.getAreaName());
        return new ModelAndView("/function/card/cardMore", "cardModel", model);
    }
}
