/*
SQLyog Ultimate v12.08 (32 bit)
MySQL - 5.7.10-log : Database - myfactory
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`myfactory` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_croatian_ci */;

USE `myfactory`;

/*Table structure for table `box_conn_prod` */

DROP TABLE IF EXISTS `box_conn_prod`;

CREATE TABLE `box_conn_prod` (
    `id` int(10) NOT NULL AUTO_INCREMENT,
  `taskid` int(10),
  `boxcode` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `prodcode` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `batch` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `size` int(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `box_conn_prod` */

/*Table structure for table `company` */

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(155) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '公司名称',
  `address` varchar(155) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '公司地址',
  `faxNumber` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '传真',
  `phoneNumber` varchar(25) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `company` */

/*Table structure for table `prod_info` */

DROP TABLE IF EXISTS `prod_info`;

CREATE TABLE `prod_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '产品表主键',
  `prodName` varchar(40) CHARACTER SET utf8 DEFAULT NULL COMMENT '产品名称',
  `prodCode` varchar(40) CHARACTER SET utf8 DEFAULT NULL COMMENT '产品编号/代码',
  `createTime` datetime DEFAULT NULL COMMENT '产品创建时间',
  `factoryId` int(10) DEFAULT NULL COMMENT '厂家id',
  `registerCode` varchar(40) CHARACTER SET utf8 DEFAULT NULL COMMENT '登记证号',
  `registerName` varchar(40) CHARACTER SET utf8 DEFAULT NULL COMMENT '等级名称',
  `pesticideType` int(2) DEFAULT NULL COMMENT '农药类别',
  `toxicity` int(1) DEFAULT NULL COMMENT '毒性',
  `liquidType` int(1) DEFAULT NULL COMMENT '剂型',
  `percent` decimal(4,0) DEFAULT NULL COMMENT '总含量',
  `startDate` date DEFAULT NULL COMMENT '有效起始日期',
  `endDate` date DEFAULT NULL COMMENT '有效结束日期',
  `remark` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '备注',
  `applicableObject` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '适用对象',
  `protectObject` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '防治对象',
  `dosageMessage` varchar(40) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '有效成分用药量信息：600克/公顷',
  `useMethod` int(1) DEFAULT NULL COMMENT '使用方法：喷雾',
  `prodApproveCode` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '农药生产批准证号',
  `useFor` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '产品用途',
  `companeyId` int(10) DEFAULT '0' COMMENT '公司id',
 `companey` varchar(50) COLLATE utf8_croatian_ci DEFAULT '' COMMENT '公司',
  `period` int(2) DEFAULT NULL COMMENT '保质期（年）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `prod_info` */

/*Table structure for table `sys_params` */

DROP TABLE IF EXISTS `sys_params`;

CREATE TABLE `sys_params` (
  `code` int(2) DEFAULT NULL COMMENT 'value值',
  `cnname` varchar(20) DEFAULT NULL COMMENT '中文名',
  `pid` varchar(10) DEFAULT NULL COMMENT '父级id',
  `orderno` int(3) DEFAULT NULL COMMENT '排序号',
  `remark` varchar(40) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_params` */

/*Table structure for table `task` */

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `prodid` int(10) DEFAULT NULL COMMENT 'prod_info的主键',
  `batchNumber` varchar(20) DEFAULT NULL COMMENT '生产批号',
  `batchLine` varchar(40) DEFAULT NULL COMMENT '生产线',
  `batchDate` date DEFAULT NULL COMMENT '生产日期',
  `endDate` date DEFAULT NULL COMMENT '结束日期',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `standard` varchar(5) DEFAULT NULL COMMENT '规格',
  `taskCode` varchar(50) DEFAULT NULL COMMENT '任务编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `task` */


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
