package com.sxwl.service;
import com.sxwl.dao.sysDeptMapper;
import com.sxwl.entity.sysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class aaTestService {
    @Autowired
    private sysDeptMapper sysdeptmapper;
    public void deptTree() {
        sysDept dept= sysDept.builder().name("十三点十三点十三点").parentId(5)
                .seq(5).remark("十三点").build();
        dept.setLevel("6");
        dept.setOperator("system");//TODD:
        dept.setOperateIp("127.0.0.1");
        dept.setOperateTime(new Date());
        sysdeptmapper.insertSelective(dept);
    }

}
