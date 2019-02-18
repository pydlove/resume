package com.pany.resume.camp.domain;

import lombok.Data;

import java.util.Date;

/**
 * ==============================
 * @Description:    KnCardDTO
 * @Author:         激流丶
 * @CreateDate:     2019/2/3 13:00
 * @Version:        1.0
 * ============================== 
 */
@Data
public class KnCardDTO {
    private String id;

    private String title;

    private String href;

    private String author;

    private String areaId;

    private String pageView;

    private Date createTime;

    private Date updateTime;

    private String remark;

}