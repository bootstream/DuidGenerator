package com.artisan.duid.service;

/**
 *
 * @author xz man
 * @date 2019-07-22 23:32
 * @since v1.0
 * 业务主键自增服务
 *
 */
public interface WorkNoIncrementService {

    /**
     *
     * @author xz man
     * @date 2019-07-22 23:46
     * @since v1.0
     * 方法描述: 获取到唯一业务主键
     *
     */
    long generator(String workNoTag);
}
