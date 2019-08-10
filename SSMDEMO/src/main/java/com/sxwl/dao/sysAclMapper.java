package com.sxwl.dao;

import com.sxwl.entity.sysAcl;
import com.sxwl.entity.sysAclExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface sysAclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    long countByExample(sysAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int deleteByExample(sysAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int insert(sysAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int insertSelective(sysAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    List<sysAcl> selectByExample(sysAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    sysAcl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") sysAcl record, @Param("example") sysAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int updateByExample(@Param("record") sysAcl record, @Param("example") sysAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int updateByPrimaryKeySelective(sysAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    int updateByPrimaryKey(sysAcl record);
}