package com.sxwl.service;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.sxwl.dao.sysDeptMapper;
import com.sxwl.dto.DeptLevelDto;
import com.sxwl.entity.sysDept;
import com.sxwl.utils.LevelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.*;
@Service
public class SysTreeService {
    @Autowired
    private com.sxwl.dao.sysDeptMapper sysDeptMapper;

    public List<DeptLevelDto> deptTree() {
        List<sysDept> allDept = sysDeptMapper.getAllDept();
        ArrayList<DeptLevelDto> objects = Lists.newArrayList();
        for (sysDept sysDept : allDept) {
            DeptLevelDto dto = DeptLevelDto.adept(sysDept);
            objects.add(dto);
        }
        return  deptLevelToTree(objects);
    }

    public List<DeptLevelDto> deptLevelToTree(List<DeptLevelDto> deptLevelDtoList) {
        if (CollectionUtils.isEmpty(deptLevelDtoList)) {
            return Lists.newArrayList();

        }
        Multimap<String, DeptLevelDto> levelDtoMultimap1 = ArrayListMultimap.create();
        ArrayList<DeptLevelDto> rootList = Lists.newArrayList();
        for (DeptLevelDto dto : deptLevelDtoList) {
            levelDtoMultimap1.put(dto.getLevel(),dto);
            if(LevelUtil.ROOT.equals(dto.getLevel())){
                rootList.add(dto);
            }
        }
        Collections.sort(rootList, new Comparator<DeptLevelDto>() {
            @Override
            public int compare(DeptLevelDto o1, DeptLevelDto o2) {
                return o1.getSeq()-o2.getSeq();
            }
        });
        transfromDeptTree(rootList,LevelUtil.ROOT,levelDtoMultimap1);
        return  rootList;
    }
    public  void transfromDeptTree(List<DeptLevelDto> rootList,String level,Multimap<String,DeptLevelDto> dtoMultimap){
        for(int i=0;i<rootList.size();i++){
            DeptLevelDto rootDeptItem = rootList.get(i);
            String nextLevel=LevelUtil.calculateLevel(level,rootDeptItem.getId());
            List<DeptLevelDto> deptLevelDtos = (List<DeptLevelDto>)dtoMultimap.get(nextLevel);
            if(org.apache.commons.collections.CollectionUtils.isNotEmpty(deptLevelDtos)){
                Collections.sort(deptLevelDtos, new Comparator<DeptLevelDto>() {
                    @Override
                    public int compare(DeptLevelDto o1, DeptLevelDto o2) {
                        return o1.getSeq()-o2.getSeq();
                    }
                });
                rootDeptItem.setDeptList(deptLevelDtos);
                transfromDeptTree(deptLevelDtos,nextLevel,dtoMultimap);
            }
        }
    }

}
