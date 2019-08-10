package com.sxwl.dto;

import com.google.common.collect.Lists;
import com.sxwl.entity.sysDept;
import lombok.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Data
public class DeptLevelDto  extends  sysDept{
    private List<DeptLevelDto> deptList= Lists.newArrayList();
    public static DeptLevelDto adept(sysDept sysDept){
        DeptLevelDto deptLevelDto=new DeptLevelDto();
        BeanUtils.copyProperties(sysDept,deptLevelDto);
        return deptLevelDto;
    }
 }
