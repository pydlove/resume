package com.pany.resume.camp.utils;

import java.util.UUID;

/**
 * ==============================
 * @Description:    UuidUtil
 * @Author:         激流丶
 * @CreateDate:     2019/2/8 22:22
 * @Version:        1.0
 * ============================== 
 */
public class UuidUtil {

    /**
     *
     * @Title: getUuid
     * @Description:  获取UUID
     * @param []
     * @return java.lang.String
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:23
     */
    public static String getUuid(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid;
    }

}
