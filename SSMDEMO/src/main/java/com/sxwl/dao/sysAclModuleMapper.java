package com.sxwl.dao;

import com.sxwl.entity.sysAclModule;
import com.sxwl.entity.sysAclModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/*database*/
public interface sysAclModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    long countByExample(sysAclModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int deleteByExample(sysAclModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int insert(sysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int insertSelective(sysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    List<sysAclModule> selectByExample(sysAclModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    sysAclModule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") sysAclModule record, @Param("example") sysAclModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int updateByExample(@Param("record") sysAclModule record, @Param("example") sysAclModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int updateByPrimaryKeySelective(sysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    int updateByPrimaryKey(sysAclModule record);
}