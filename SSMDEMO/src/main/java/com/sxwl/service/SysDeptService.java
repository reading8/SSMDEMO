package com.sxwl.service;

import com.sxwl.dao.sysDeptMapper;
import com.sxwl.entity.sysDept;
import com.sxwl.excepation.ParamException;
import com.sxwl.param.DeptParam;
import com.sxwl.utils.BeanValidator;
import com.sxwl.utils.LevelUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class SysDeptService {
    @Autowired
    private sysDeptMapper sysdeptmapper;

    public void save(DeptParam deptParam) {
        BeanValidator.check(deptParam);
        if (checkExits(deptParam.getParentId(), deptParam.getName(), deptParam.getId())) {
            throw new ParamException("同一级下有相同名称的部门");
        }
        sysDept dept = sysDept.builder().name(deptParam.getName()).parentId(deptParam.getParentId())
                .seq(deptParam.getSeq()).remark(deptParam.getRemark()).build();
        dept.setLevel(LevelUtil.calculateLevel(getLevel(deptParam.getParentId()), deptParam.getParentId()));
        dept.setOperator("system");//TODD:
        dept.setOperateIp("127.0.0.1");
        dept.setOperateTime(new Date());
        sysdeptmapper.insertSelective(dept);
    }

    private boolean checkExits(Integer parentId, String deptName, Integer deptId) {
        return sysdeptmapper.countByNameAndParentId(parentId,deptName,deptId)>0;
    }

    private String getLevel(Integer deptId) {
        sysDept sysDept = sysdeptmapper.selectByPrimaryKey(deptId);
        if (sysDept == null) {
            return null;
        }
        return sysDept.getLevel();
    }

    public void update(DeptParam deptParam) {
        BeanValidator.check(deptParam);
        if (checkExits(deptParam.getParentId(), deptParam.getName(), deptParam.getId())) {
            throw new ParamException("同一级下有相同名称的部门");
        }
        sysDept bofore = sysdeptmapper.selectByPrimaryKey(deptParam.getId());
        sysDept after = sysDept.builder().id(deptParam.getId()).name(deptParam.getName()).parentId(deptParam.getParentId())
                .seq(deptParam.getSeq()).remark(deptParam.getRemark()).build();
        after.setLevel(LevelUtil.calculateLevel(getLevel(deptParam.getId()),deptParam.getParentId()));
        after.setOperator("system");//TODD:
        after.setOperateIp("127.0.0.1");
        after.setOperateTime(new Date());
    }
    private void updateWithChid(sysDept before,sysDept after){
        String newLevelPrefix= after.getLevel();
        String oldLevelPrefix=before.getLevel();
        if(!oldLevelPrefix.equals(newLevelPrefix)){
            List<sysDept> deptList = sysdeptmapper.getChildDeptListByLevel(oldLevelPrefix);
            if(CollectionUtils.isNotEmpty(deptList)){
                for (sysDept sysDept : deptList) {
                    String level = sysDept.getLevel();
                    if(level.indexOf(oldLevelPrefix)==0){
                        level=newLevelPrefix+level.substring(oldLevelPrefix.length());
                        sysDept.setLevel(level);
                    }
                }
                sysdeptmapper.batchUpdateLevel(deptList);
            }
        }
        sysdeptmapper.updateByPrimaryKey(after);

    }
}
