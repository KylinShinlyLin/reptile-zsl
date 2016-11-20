package com.ehais.hrlucene.model;

import java.io.Serializable;

public class HaiHrPositionWithBLOBs extends HaiHrPosition implements Serializable {
    /**
     * 招聘要求
     */
    private String detailrequirement;

    /**
     * 招聘通知
     */
    private String notice;

    /**
     * 工作概述
     */
    private String workIntro;

    /**
     * 不确定的备注信息
     */
    private String remark;
    
    /**
     * 公司详情
     */
    private String companyDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_hr_position.detailrequirement
     *
     * @return the value of hai_hr_position.detailrequirement
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public String getDetailrequirement() {
        return detailrequirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_hr_position.detailrequirement
     *
     * @param detailrequirement the value for hai_hr_position.detailrequirement
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public void setDetailrequirement(String detailrequirement) {
        this.detailrequirement = detailrequirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_hr_position.notice
     *
     * @return the value of hai_hr_position.notice
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public String getNotice() {
        return notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_hr_position.notice
     *
     * @param notice the value for hai_hr_position.notice
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_hr_position.work_intro
     *
     * @return the value of hai_hr_position.work_intro
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public String getWorkIntro() {
        return workIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_hr_position.work_intro
     *
     * @param workIntro the value for hai_hr_position.work_intro
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public void setWorkIntro(String workIntro) {
        this.workIntro = workIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_hr_position.remark
     *
     * @return the value of hai_hr_position.remark
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_hr_position.remark
     *
     * @param remark the value for hai_hr_position.remark
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getCompanyDetail() {
		return companyDetail;
	}

	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}
    
    
}