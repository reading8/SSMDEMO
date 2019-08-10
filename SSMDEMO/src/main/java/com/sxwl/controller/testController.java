package com.sxwl.controller;
import com.sxwl.common.JsonData;
import com.sxwl.excepation.ParamException;
import com.sxwl.service.aaTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
@Slf4j
public class testController {
    @Autowired
    private aaTestService aaTestService;
    @RequestMapping("/test.json")
    public JsonData test(){
        aaTestService.deptTree();
        return  JsonData.success();

    }
}
