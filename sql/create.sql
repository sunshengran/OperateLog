DROP TABLE IF EXISTS `t_log`;

CREATE TABLE `t_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人id',
  `user_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人名字',
  `IP` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT 'IP',
  `menu_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '菜单名字',
  `oper_type` varchar(8) COLLATE utf8_bin DEFAULT NULL COMMENT '操作类型',
  `dept` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '部门',
  `company` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '公司',
  `content` text COLLATE utf8_bin COMMENT '内容',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=475 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='操作日志表';


DROP TABLE IF EXISTS `t_log_manager`;

CREATE TABLE `t_log_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人id',
  `user_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人名字',
  `IP` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT 'IP',
  `menu_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '菜单名字',
  `oper_type` varchar(8) COLLATE utf8_bin DEFAULT NULL COMMENT '操作类型',
  `dept` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '部门',
  `company` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '公司',
  `content` text COLLATE utf8_bin COMMENT '内容',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=475 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='管理员操作日志表';
