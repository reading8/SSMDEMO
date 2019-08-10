package com.sxwl.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class JsonData {
    private boolean state;
    private String msg;
    private Object data;
    public  JsonData(boolean state){
        this.state=state;
    }
    public  static JsonData success(Object data,String msg){
        JsonData jsonData=new JsonData(true);
        jsonData.data=data;
        jsonData.msg=msg;
        return  jsonData;
    }
    public  static JsonData success(Object data){
        JsonData jsonData=new JsonData(true);
        jsonData.data=data;
        return  jsonData;
    }
    public  static JsonData success(){
        JsonData jsonData=new JsonData(true);
        return  jsonData;
    }
    public  static  JsonData fail(String msg){
        JsonData jsonData=new JsonData(false);
        jsonData.msg=msg;
        return  jsonData;
    }
    public Map<String,Object> toMap(){
        HashMap<String,Object> result=new HashMap<String, Object>();
        result.put("state",state);
        result.put("msg",msg);
        result.put("data",data);
        return  result;

    }
}
