package com.artisan.duid.entity;

/**
 *
 * @author xz man
 * @date 2019-07-24 06:42
 * @since v1.0
 * 业务主键标签枚举
 *
 */
public enum WorkNoTagEnum {


    /**
     * 用户唯一主键标签
     */
    USER_ID_TAG("user_id_tag","用户唯一主键标签"),

    /**
     * 地址信息唯一主键标签
     */
    ADDRESS_ID_TAG("address_id_tag","地址信息唯一主键标签"),

    /**
     * 订单信息唯一主键标签
     */
    ORDER_ID_TAG("order_id_tag","订单信息唯一主键标签"),

    /**
     * 库存信息唯一主键
     */
    STORAGE_ID_TAG("",""),

    /**
     * 物流信息唯一主键
     */
    LOGISTICS_ID_TAGE("","");


    /**
     * 标签
     */
    private String tag;

    /**
     * 描述信息
     */
    private String describeInfo;

    /**
     * 初始值
     */
    private Long startNo;

    /**
     * 步长
     */
    private Long step;



    WorkNoTagEnum(String tag, String describeInfo) {
        this.tag=tag;
        this.describeInfo=describeInfo;
    }

    WorkNoTagEnum(String tag, String describeInfo, Long startNo, Long step) {
        this.tag = tag;
        this.describeInfo = describeInfo;
        this.startNo = startNo;
        this.step = step;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescribeInfo() {
        return describeInfo;
    }

    public void setDescribeInfo(String describeInfo) {
        this.describeInfo = describeInfo;
    }

    public Long getStartNo() {
        return startNo;
    }

    public void setStartNo(Long startNo) {
        this.startNo = startNo;
    }

    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }
}
