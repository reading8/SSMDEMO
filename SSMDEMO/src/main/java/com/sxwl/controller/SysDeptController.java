package com.sxwl.controller;
import com.sxwl.common.JsonData;
import com.sxwl.dto.DeptLevelDto;
import com.sxwl.param.DeptParam;
import com.sxwl.service.SysDeptService;
import com.sxwl.service.SysTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;
    @Autowired
    private SysTreeService sysTreeService;
    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam deptParam){
        sysDeptService.save(deptParam);
        return JsonData.success();
    }
    @RequestMapping("/treedept.json")
    @ResponseBody
    public  JsonData getTreeDept(){
        List<DeptLevelDto> deptLevelDtoList = sysTreeService.deptTree();
        return  JsonData.success(deptLevelDtoList);
    }
    @RequestMapping("/dept.page")
    public ModelAndView page(){

        return  new ModelAndView("dept");
    }
    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(DeptParam deptParam){
        sysDeptService.update(deptParam);
        return JsonData.success();
    }
}
