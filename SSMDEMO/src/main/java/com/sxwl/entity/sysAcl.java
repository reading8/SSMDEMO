package com.sxwl.entity;

import java.util.Date;

public class sysAcl {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.code
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.name
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.acl_module_id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Integer aclModuleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.url
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.type
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.status
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.seq
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Integer seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.remark
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.operator
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_acl.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    private String operateIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.id
     *
     * @return the value of sys_acl.id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.id
     *
     * @param id the value for sys_acl.id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.code
     *
     * @return the value of sys_acl.code
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.code
     *
     * @param code the value for sys_acl.code
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.name
     *
     * @return the value of sys_acl.name
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.name
     *
     * @param name the value for sys_acl.name
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.acl_module_id
     *
     * @return the value of sys_acl.acl_module_id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Integer getAclModuleId() {
        return aclModuleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.acl_module_id
     *
     * @param aclModuleId the value for sys_acl.acl_module_id
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setAclModuleId(Integer aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.url
     *
     * @return the value of sys_acl.url
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.url
     *
     * @param url the value for sys_acl.url
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.type
     *
     * @return the value of sys_acl.type
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.type
     *
     * @param type the value for sys_acl.type
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.status
     *
     * @return the value of sys_acl.status
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.status
     *
     * @param status the value for sys_acl.status
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.seq
     *
     * @return the value of sys_acl.seq
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.seq
     *
     * @param seq the value for sys_acl.seq
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.remark
     *
     * @return the value of sys_acl.remark
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.remark
     *
     * @param remark the value for sys_acl.remark
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.operator
     *
     * @return the value of sys_acl.operator
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.operator
     *
     * @param operator the value for sys_acl.operator
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.operate_time
     *
     * @return the value of sys_acl.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.operate_time
     *
     * @param operateTime the value for sys_acl.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_acl.operate_ip
     *
     * @return the value of sys_acl.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_acl.operate_ip
     *
     * @param operateIp the value for sys_acl.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:53 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}