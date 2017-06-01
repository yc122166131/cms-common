package com.cn.yc.utils;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonUtils {

	 /**
     * 函数名称: parseData
     * 函数描述: 将json字符串转换为map
     * @param data JSON字符串
     * @param type map 中 第二个元素的  类型 string 或者 List 等
     * @return
     */
    public static Map parseDatatoMap(String data,String type){
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        Map map = null;
        if("list".equals(type)){  // Map<String , List> 作为返回值
        	 map = g.fromJson(data, new TypeToken<Map<String, List>>() {}.getType());
        }
        if("string".equalsIgnoreCase(type)){ //Map<String , String> 作为返回值
        	 map = g.fromJson(data, new TypeToken<Map<String, String>>() {}.getType());
        }
        return map;
    }
    
    
    /**
     * 函数名称: parseDataToList
     * 通常 转 List<Map<String,String>>
     * 函数描述: 将json字符串数组 转换为List , 返回类型主要看 List 的泛型参数类型
     * @param data
     * @return
     */
    public static List<Map<String, String>> parseDataToList(String data){
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        List list = g.fromJson(data, new TypeToken<List>(){}.getType());
        return list;
    }
	
	
}
