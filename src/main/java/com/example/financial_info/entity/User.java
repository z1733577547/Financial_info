package com.example.financial_info.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.u_name
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private String uName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_admin
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Boolean isAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.state
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Boolean state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public User(Integer uId, String uName, String email, String password, Boolean isAdmin, Date createTime, Boolean state) {
        this.uId = uId;
        this.uName = uName;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.createTime = createTime;
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.u_id
     *
     * @return the value of user.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.u_id
     *
     * @param uId the value for user.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.u_name
     *
     * @return the value of user.u_name
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.u_name
     *
     * @param uName the value for user.u_name
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_admin
     *
     * @return the value of user.is_admin
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_admin
     *
     * @param isAdmin the value for user.is_admin
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.state
     *
     * @return the value of user.state
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.state
     *
     * @param state the value for user.state
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setState(Boolean state) {
        this.state = state;
    }
}