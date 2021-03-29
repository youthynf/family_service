package com.study.bean;

import java.io.Serializable;

/**
 * <p>
 * 用户子公司表
 * </p>
 *
 * @author lian
 * @since 2021-03-27
 */
public class TblUserSubCompany implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 子公司编号
     */
    private Integer companyId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "TblUserSubCompany{" +
        "userId=" + userId +
        ", companyId=" + companyId +
        "}";
    }
}
