CREATE TABLE `work_no_increment_generator` (
   `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '业务ID自增表--物理主键',
   `work_no_tag` varchar(32) COMMENT '物理主键标签--作为唯一值',
   `current_max_no` bigint UNSIGNED COMMENT '当前最大业务主键',
   `default_step` int UNSIGNED DEFAULT 1000 COMMENT '默认步长，可以自定义',
   `describe_info` varchar(200) DEFAULT '业务自增主键' COMMENT '描述业务自增主键标签信息',
   `current_version` int UNSIGNED DEFAULT 0 COMMENT '当前版本号',
   `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `operate_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
   PRIMARY KEY (`id`),
   UNIQUE `work_no_tag_index` (`work_no_tag`) comment '业务主键标签--唯一索引'
) ENGINE=`InnoDB` COMMENT='业务自增主键生成器';

