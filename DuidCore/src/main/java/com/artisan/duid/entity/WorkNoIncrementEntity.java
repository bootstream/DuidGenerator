package com.artisan.duid.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 *
 * @author xz man
 * @date 2019-07-22 23:35
 * @since v1.0
 * 业务主键自增对象
 *
 */
@Data
public class WorkNoIncrementEntity {

    /**
     * 主键
     */
    private Long id;

    /**
     * 业务主键标签
     */
    private String workNoTag;

    /**
     * 当前最大业务主键编号
     */
    private Long currentMaxNo;

    /**
     * 默认步数
     */
    private Long defaultStep;

    /**
     * 描述信息
     */
    private String describeInfo;

    /**
     * 当前版本
     */
    private Integer currentVersion;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 操作时间
     */
    private Timestamp operateTime;

    /**
     * 当前业务主键
     */
    private Long currentNo;

    /**
     * 实际步长
     */
    private Long step;


}
