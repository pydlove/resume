package com.pany.resume.camp.domain;

import lombok.Data;

import java.util.Date;

/**
 * ==============================
 * @Description:    KnAreaDTO
 * @Author:         激流丶
 * @CreateDate:     2019/2/7 13:05
 * @Version:        1.0
 * ============================== 
 */
@Data
public class KnAreaDTO {
    private String id;

    private String areaName;

    private Date createTime;

    private Date updateTime;

    private String remark;

}