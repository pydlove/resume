package com.pany.resume.camp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ==============================
 * @Description:    DateUtil
 * @Author:         激流丶
 * @CreateDate:     2019/2/8 22:19
 * @Version:        1.0
 * ============================== 
 */
public class DateUtil {

    /**
     *
     * @Title: dateToString
     * @Description: Date 转 String 类型
     * @param [date, format]
     * @return java.lang.String
     * @author panyong
     * @version 1.0
     * @createtime 2019/2/8 22:21
     */
    public static String dateToString(Date date, String format){
        SimpleDateFormat fmt = new SimpleDateFormat("format");
        String stringDate = fmt.format(date);
        return stringDate;
    }
}
