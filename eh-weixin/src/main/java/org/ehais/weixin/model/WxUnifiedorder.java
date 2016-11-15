package org.ehais.weixin.model;

public class WxUnifiedorder {
	
    public WxUnifiedorder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxUnifiedorder(WeiXinUnifiedOrder model) {
		super();
		this.appid = model.getAppid();
		this.mchId = model.getMch_id();
		this.deviceInfo = model.getDevice_info();
		this.nonceStr = model.getNonce_str();
		this.sign = model.getSign();
		this.body = model.getBody();
		this.detail = model.getDetail();
		this.attach = model.getAttach();
		this.outTradeNo = model.getOut_trade_no();
		this.feeType = model.getFee_type();
		this.totalFee = model.getTotal_fee();
		this.spbillCreateIp = model.getSpbill_create_ip();
		this.timeStart = model.getTime_start();
		this.timeExpire = model.getTime_expire();
		this.goodsTag = model.getGoods_tag();
		this.notifyUrl = model.getNotify_url();
		this.tradeType = model.getTrade_type();
		this.productId = model.getProduct_id();
		this.limitPay = model.getLimit_pay();
		this.openid = model.getOpenid();
		this.ePayStatus = model.getE_pay_status();
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.wx_order_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private Integer wxOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.appid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.mch_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String mchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.device_info
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String deviceInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.nonce_str
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String nonceStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.sign
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.body
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String body;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.detail
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.attach
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String attach;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.out_trade_no
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String outTradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.fee_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String feeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.total_fee
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private Integer totalFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.spbill_create_ip
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String spbillCreateIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.time_start
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private Float timeStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.time_expire
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private Float timeExpire;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.goods_tag
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String goodsTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.notify_url
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String notifyUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.trade_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.product_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.limit_pay
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String limitPay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.openid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_unifiedorder.e_pay_status
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    private Short ePayStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.wx_order_id
     *
     * @return the value of wx_unifiedorder.wx_order_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public Integer getWxOrderId() {
        return wxOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.wx_order_id
     *
     * @param wxOrderId the value for wx_unifiedorder.wx_order_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setWxOrderId(Integer wxOrderId) {
        this.wxOrderId = wxOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.appid
     *
     * @return the value of wx_unifiedorder.appid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.appid
     *
     * @param appid the value for wx_unifiedorder.appid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.mch_id
     *
     * @return the value of wx_unifiedorder.mch_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.mch_id
     *
     * @param mchId the value for wx_unifiedorder.mch_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.device_info
     *
     * @return the value of wx_unifiedorder.device_info
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.device_info
     *
     * @param deviceInfo the value for wx_unifiedorder.device_info
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.nonce_str
     *
     * @return the value of wx_unifiedorder.nonce_str
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getNonceStr() {
        return nonceStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.nonce_str
     *
     * @param nonceStr the value for wx_unifiedorder.nonce_str
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.sign
     *
     * @return the value of wx_unifiedorder.sign
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.sign
     *
     * @param sign the value for wx_unifiedorder.sign
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.body
     *
     * @return the value of wx_unifiedorder.body
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.body
     *
     * @param body the value for wx_unifiedorder.body
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.detail
     *
     * @return the value of wx_unifiedorder.detail
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.detail
     *
     * @param detail the value for wx_unifiedorder.detail
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.attach
     *
     * @return the value of wx_unifiedorder.attach
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getAttach() {
        return attach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.attach
     *
     * @param attach the value for wx_unifiedorder.attach
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.out_trade_no
     *
     * @return the value of wx_unifiedorder.out_trade_no
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.out_trade_no
     *
     * @param outTradeNo the value for wx_unifiedorder.out_trade_no
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.fee_type
     *
     * @return the value of wx_unifiedorder.fee_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.fee_type
     *
     * @param feeType the value for wx_unifiedorder.fee_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.total_fee
     *
     * @return the value of wx_unifiedorder.total_fee
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.total_fee
     *
     * @param totalFee the value for wx_unifiedorder.total_fee
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.spbill_create_ip
     *
     * @return the value of wx_unifiedorder.spbill_create_ip
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.spbill_create_ip
     *
     * @param spbillCreateIp the value for wx_unifiedorder.spbill_create_ip
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.time_start
     *
     * @return the value of wx_unifiedorder.time_start
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public Float getTimeStart() {
        return timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.time_start
     *
     * @param timeStart the value for wx_unifiedorder.time_start
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setTimeStart(Float timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.time_expire
     *
     * @return the value of wx_unifiedorder.time_expire
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public Float getTimeExpire() {
        return timeExpire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.time_expire
     *
     * @param timeExpire the value for wx_unifiedorder.time_expire
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setTimeExpire(Float timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.goods_tag
     *
     * @return the value of wx_unifiedorder.goods_tag
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getGoodsTag() {
        return goodsTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.goods_tag
     *
     * @param goodsTag the value for wx_unifiedorder.goods_tag
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.notify_url
     *
     * @return the value of wx_unifiedorder.notify_url
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.notify_url
     *
     * @param notifyUrl the value for wx_unifiedorder.notify_url
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.trade_type
     *
     * @return the value of wx_unifiedorder.trade_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.trade_type
     *
     * @param tradeType the value for wx_unifiedorder.trade_type
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.product_id
     *
     * @return the value of wx_unifiedorder.product_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.product_id
     *
     * @param productId the value for wx_unifiedorder.product_id
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.limit_pay
     *
     * @return the value of wx_unifiedorder.limit_pay
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getLimitPay() {
        return limitPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.limit_pay
     *
     * @param limitPay the value for wx_unifiedorder.limit_pay
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.openid
     *
     * @return the value of wx_unifiedorder.openid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.openid
     *
     * @param openid the value for wx_unifiedorder.openid
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_unifiedorder.e_pay_status
     *
     * @return the value of wx_unifiedorder.e_pay_status
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public Short getePayStatus() {
        return ePayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_unifiedorder.e_pay_status
     *
     * @param ePayStatus the value for wx_unifiedorder.e_pay_status
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    public void setePayStatus(Short ePayStatus) {
        this.ePayStatus = ePayStatus;
    }
}