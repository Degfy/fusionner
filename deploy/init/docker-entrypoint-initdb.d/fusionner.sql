# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.32-log)
# Database: feature-dep
# Generation Time: 2020-11-19 00:51:56 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table v1_feature
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_feature`;

CREATE TABLE `v1_feature` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '特性ID',
  `code` varchar(20) DEFAULT NULL COMMENT '特性编号',
  `product_id` int(11) unsigned NOT NULL COMMENT '产品ID',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '特性名称',
  `description` varchar(200) DEFAULT NULL COMMENT '特性描述',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态：0开始，5进行中，9结束',
  `is_behind` tinyint(4) DEFAULT NULL COMMENT '是否落后于主版本',
  `existed_not_test_code` int(11) DEFAULT NULL COMMENT '是否存在未测试的代码',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table v1_feature_repo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_feature_repo`;

CREATE TABLE `v1_feature_repo` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `feature_id` int(11) unsigned NOT NULL COMMENT '特性ID',
  `repo_id` int(11) unsigned NOT NULL COMMENT '仓库ID',
  `note` varchar(200) DEFAULT NULL COMMENT '备注：描述加入特性的原因',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table v1_product
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_product`;

CREATE TABLE `v1_product` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '产品ID',
  `name` varchar(20) DEFAULT NULL COMMENT '产品名字',
  `description` varchar(200) DEFAULT NULL COMMENT '产品描述',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table v1_repo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_repo`;

CREATE TABLE `v1_repo` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '代码仓库ID',
  `product_id` int(10) unsigned NOT NULL COMMENT '产品ID',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '仓库名',
  `description` varchar(200) DEFAULT NULL COMMENT '仓库描述',
  `url` varchar(200) NOT NULL DEFAULT '' COMMENT '仓库地址',
  `user` varchar(20) DEFAULT NULL COMMENT '有权登陆仓库的用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '有权登陆仓库的用户名-对应密码',
  `id_rsa` varchar(3000) DEFAULT NULL COMMENT '访问仓库的私钥证书',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table v1_test_point
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_test_point`;

CREATE TABLE `v1_test_point` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '提测ID',
  `feature_id` int(11) unsigned NOT NULL COMMENT '特性ID',
  `content` varchar(500) DEFAULT NULL COMMENT '提测内容',
  `test_record_id` int(10) unsigned NOT NULL,
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='提测点：提测产生';



# Dump of table v1_test_point_version
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_test_point_version`;

CREATE TABLE `v1_test_point_version` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '提测版本ID',
  `feature_repo_id` int(11) unsigned NOT NULL COMMENT '特性仓库ID',
  `tag` varchar(20) DEFAULT NULL COMMENT '版本tag',
  `hash` varchar(100) DEFAULT NULL COMMENT '版本hash值',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='提测版本';



# Dump of table v1_test_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_test_record`;

CREATE TABLE `v1_test_record` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `feature_id` int(11) unsigned NOT NULL COMMENT '特性ID',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试记录';



# Dump of table v1_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `v1_user`;

CREATE TABLE `v1_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password_hash` varchar(128) NOT NULL DEFAULT '' COMMENT '密码hash',
  `role` int(4) NOT NULL COMMENT '角色bitmap：1产品，2开发，4测试，8运维',
  `created_by` int(11) NOT NULL COMMENT '创建者',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` int(11) DEFAULT NULL COMMENT '修改者',
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
