package com.nwnu.emall.utils;

public class StringUtil {
    /**
     *
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str){
        if(str == null || str ==""){
            return false;
        }
        return  true;
    }
    public static Long Str2Long(String str){
        if(isNotBlank(str)){
            return Long.parseLong(str);
        }
        return 0L;
    }

}