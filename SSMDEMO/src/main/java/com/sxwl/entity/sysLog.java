package com.sxwl.entity;

import java.util.Date;

public class sysLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.type
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.target_id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private Integer targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operator
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private String operateIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.status
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.id
     *
     * @param id the value for sys_log.id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.type
     *
     * @return the value of sys_log.type
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.type
     *
     * @param type the value for sys_log.type
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.target_id
     *
     * @return the value of sys_log.target_id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.target_id
     *
     * @param targetId the value for sys_log.target_id
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operator
     *
     * @return the value of sys_log.operator
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operator
     *
     * @param operator the value for sys_log.operator
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operate_time
     *
     * @return the value of sys_log.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operate_time
     *
     * @param operateTime the value for sys_log.operate_time
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operate_ip
     *
     * @return the value of sys_log.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operate_ip
     *
     * @param operateIp the value for sys_log.operate_ip
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.status
     *
     * @return the value of sys_log.status
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.status
     *
     * @param status the value for sys_log.status
     *
     * @mbg.generated Sat Aug 03 18:28:54 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}