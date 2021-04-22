package com.example.financial_info.entity;

import java.io.Serializable;

public class OptionalStock implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column optional stock.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column optional stock.s_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private Integer sId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table optional stock
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table optional stock
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public OptionalStock(Integer uId, Integer sId) {
        this.uId = uId;
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table optional stock
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public OptionalStock() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column optional stock.u_id
     *
     * @return the value of optional stock.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column optional stock.u_id
     *
     * @param uId the value for optional stock.u_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column optional stock.s_id
     *
     * @return the value of optional stock.s_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column optional stock.s_id
     *
     * @param sId the value for optional stock.s_id
     *
     * @mbg.generated Thu Apr 22 15:46:51 CST 2021
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }
}