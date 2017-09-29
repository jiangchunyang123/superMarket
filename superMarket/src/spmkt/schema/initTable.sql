/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.24 : Database - know_you_self
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

/*Table structure for table `householdstuff` */

DROP TABLE IF EXISTS `householdstuff`;

CREATE TABLE `householdstuff` (
  `fullName` varchar(50) DEFAULT NULL,
  `id` varchar(36) NOT NULL,
  `shortName` varchar(20) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `firstUser` varchar(36) DEFAULT NULL,
  `currentUser` varchar(36) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `location` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_d5lnmxncv55doyrdsvvqukvgy` (`currentUser`),
  KEY `FK_l3flt3e932ocbdlx8abrohio9` (`firstUser`),
  CONSTRAINT `FK_d5lnmxncv55doyrdsvvqukvgy` FOREIGN KEY (`currentUser`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_l3flt3e932ocbdlx8abrohio9` FOREIGN KEY (`firstUser`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `householdstuff` */


/*Table structure for table `people` */

DROP TABLE IF EXISTS `people`;

CREATE TABLE `people` (
  `id` varchar(16) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `stock_info` */

DROP TABLE IF EXISTS `stock_info`;

CREATE TABLE `stock_info` (
  `filePath` varchar(40) DEFAULT NULL COMMENT '图片地址',
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sellState` varchar(10) DEFAULT NULL COMMENT '状态',
  `cName1` varchar(40) DEFAULT NULL COMMENT '简称1',
  `cName2` varchar(40) DEFAULT NULL COMMENT '简称2',
  `inPrice` decimal(10,0) DEFAULT NULL COMMENT '进价',
  `inDate` date DEFAULT NULL COMMENT '进货日期',
  `sellingPrice` decimal(10,0) DEFAULT NULL COMMENT '当前售卖价格',
  `outPrice` decimal(10,0) DEFAULT NULL COMMENT '卖出价格',
  `outDate` date DEFAULT NULL COMMENT '卖出日期',
  `factory` varchar(10) DEFAULT NULL COMMENT '厂商',
  `barcode` varchar(30) NOT NULL COMMENT '条形码',
  `name` varchar(20) DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `email` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `adress` longtext,
  `people_id` varchar(16) CHARACTER SET latin1 DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */


/*Data for the table `order` */
DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `status` varchar(10) DEFAULT NULL COMMENT '状态',
  `createDate` date DEFAULT NULL COMMENT '日期',
  `totalPrice` decimal(12,4) DEFAULT NULL COMMENT '售卖价格',
  `tradeid` varchar(30) NOT NULL COMMENT '交易编号',
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `stockDeal`;
/*Data for the table `order` */
/*Data for the table `stockDeal` */
CREATE TABLE `stockDeal` (
  `id` BIGINT(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `stockId` BIGINT(10) COMMENT 'stock_info主键',
  `status` VARCHAR(10) DEFAULT NULL COMMENT '状态',
  `dealdate` DATE DEFAULT NULL COMMENT '日期',
  `price` DECIMAL(12,4) DEFAULT NULL COMMENT '售卖价格',
  `orderid` BIGINT(10) NOT NULL COMMENT 'order主键',
  KEY `id` (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*Data for the table `stockDeal` */
ALTER TABLE  stock_info ADD COLUMN remainPosition INT(5) COMMENT '库存量';
