package com.artisan.duid.service.impl;

import com.artisan.duid.entity.WorkNoIncrementEntity;
import com.artisan.duid.service.WorkNoIncrementService;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class WorkNoIncrementServiceImpl implements WorkNoIncrementService {

    /**
     * 业务主键自增对象仓库
     */
    private static volatile Map<String, WorkNoIncrementEntity> WORK_NO_INC_STORAGE;

    /**
     * 默认容量
     */
    private final static int STORAGE_DEFAULT_CAPACITY = 16;

    /**
     * 默认步长
     */
    private final static long DEFAULT_STEP = 1000;

    /**
     * 默认开始编号
     */
    private final static long DEFAULT_START_NO = 0;

    /**
     *
     * @author xz man
     * @date 2019-07-22 23:41
     * @since v1.0
     * 方法描述: 获取到自增对象仓库
     *
     */
    private static Map<String, WorkNoIncrementEntity> getStoage(){
        if(null == WORK_NO_INC_STORAGE){
            synchronized (WorkNoIncrementServiceImpl.class){
                if(null == WORK_NO_INC_STORAGE){
                    WORK_NO_INC_STORAGE = new ConcurrentHashMap<>(STORAGE_DEFAULT_CAPACITY);
                }
            }
        }
        return WORK_NO_INC_STORAGE;
    }


    /**
     * @author xz man
     * @date 2019-07-22 23:44
     * @since v1.0
     * 方法描述: 获取到唯一业务主键
     */
    @Override
    public long generator(String workNoTag) {
        if(null == workNoTag || "".equals(workNoTag)){
            throw new IllegalArgumentException("获取唯一主键时，业务标签不可为空。");
        }

        return 0;
    }

    /**
     *
     * @author xz man
     * @date 2019-07-23 00:14
     * @since v1.0
     * 方法描述: 获取到自增对象
     *
     */
    private WorkNoIncrementEntity getWorkNoIncrement(String workNoTag){

        //获取到自增仓库
        Map<String, WorkNoIncrementEntity> storage = getStoage();
        synchronized (workNoTag.intern()){
            //获取到
            WorkNoIncrementEntity inc = storage.get(workNoTag);

        }
        return null;
    }

    private WorkNoIncrementEntity buildInc(String workNoTag){
        WorkNoIncrementEntity inc = new WorkNoIncrementEntity();
        //业务主键标签
        inc.setWorkNoTag(workNoTag);
        //初始值
        inc.setCurrentMaxNo(DEFAULT_START_NO);
        //设置默认步长
        inc.setDefaultStep(DEFAULT_STEP);
        //当前时间
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        //设置创建时间
        inc.setCreateTime(currentTime);
        //设置操作时间
        inc.setOperateTime(currentTime);

        return inc;
    }
}
