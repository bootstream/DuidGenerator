package com.artisan.duid.mapper;


import com.artisan.duid.entity.WorkNoIncrementEntity;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author xz man
 * @date 2019-07-22 23:26
 * @since v1.0
 * 业务主键自增表Mapper
 *
 */
public interface WorkNoIncrementMapper {

    /**
     *
     * @author xz man
     * @date 2019-07-23 00:10
     * @since v1.0
     * 方法描述: 创建业务主键自增对象
     *
     */
    Integer createWorkNoIncrement(@Param(value = "inc") WorkNoIncrementEntity inc);

    /**
     *
     * @author xz man
     * @date 2019-07-23 00:11
     * @since v1.0
     * 方法描述: 获取到业务主键自增对象
     *
     */
    WorkNoIncrementEntity getWorkNoIncrement(@Param(value = "workNoTag") String workNoTag);

}
