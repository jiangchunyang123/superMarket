/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : myfactory

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2018-02-12 20:55:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for box_conn_prod
-- ----------------------------
DROP TABLE IF EXISTS `box_conn_prod`;
CREATE TABLE `box_conn_prod` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `taskid` int(10) DEFAULT NULL,
  `boxcode` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `prodcode` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `batch` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `size` int(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of box_conn_prod
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(155) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '公司名称',
  `address` varchar(155) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '公司地址',
  `faxNumber` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '传真',
  `phoneNumber` varchar(25) COLLATE utf8_croatian_ci DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for deal
-- ----------------------------
DROP TABLE IF EXISTS `deal`;
CREATE TABLE `deal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL,
  `total_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of deal
-- ----------------------------
INSERT INTO `deal` VALUES ('1', '2018-02-05 23:09:42', null, '4.00');
INSERT INTO `deal` VALUES ('2', '2018-02-05 23:14:48', null, '56.50');
INSERT INTO `deal` VALUES ('3', '2018-02-05 23:21:17', null, '1.00');
INSERT INTO `deal` VALUES ('4', '2018-02-05 23:22:45', null, '1.00');
INSERT INTO `deal` VALUES ('5', '2018-02-05 23:23:02', null, '1.00');
INSERT INTO `deal` VALUES ('6', '2018-02-05 23:23:07', null, '1.00');
INSERT INTO `deal` VALUES ('7', '2018-02-05 23:24:13', null, '1.00');
INSERT INTO `deal` VALUES ('8', '2018-02-05 23:24:17', null, '1.00');
INSERT INTO `deal` VALUES ('9', '2018-02-05 23:24:19', null, '1.00');
INSERT INTO `deal` VALUES ('10', '2018-02-05 23:24:26', null, '7.00');
INSERT INTO `deal` VALUES ('11', '2018-02-05 23:37:38', null, '1.00');
INSERT INTO `deal` VALUES ('12', '2018-02-06 22:46:49', null, '5.00');
INSERT INTO `deal` VALUES ('13', '2018-02-06 22:46:52', null, '0.00');
INSERT INTO `deal` VALUES ('14', '2018-02-06 22:46:57', null, '1.00');
INSERT INTO `deal` VALUES ('15', '2018-02-06 22:47:23', null, '2.00');
INSERT INTO `deal` VALUES ('16', '2018-02-06 23:00:26', null, '50.00');
INSERT INTO `deal` VALUES ('17', '2018-02-06 23:02:40', null, '65.30');
INSERT INTO `deal` VALUES ('18', '2018-02-06 23:07:34', null, '1.00');
INSERT INTO `deal` VALUES ('19', '2018-02-06 23:08:01', null, '1.00');
INSERT INTO `deal` VALUES ('20', '2018-02-06 23:21:39', null, '158.00');
INSERT INTO `deal` VALUES ('21', '2018-02-06 23:42:22', null, '130.00');
INSERT INTO `deal` VALUES ('22', '2018-02-06 23:46:46', null, '43.92');
INSERT INTO `deal` VALUES ('23', '2018-02-10 19:05:03', null, '2.00');

-- ----------------------------
-- Table structure for deal_detail
-- ----------------------------
DROP TABLE IF EXISTS `deal_detail`;
CREATE TABLE `deal_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_id` int(11) DEFAULT NULL,
  `deal_id` int(11) DEFAULT NULL,
  `stock_name` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL,
  `single_price` decimal(10,2) DEFAULT NULL,
  `discount` double(4,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `number` int(11) DEFAULT NULL,
  `total_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of deal_detail
-- ----------------------------
INSERT INTO `deal_detail` VALUES ('1', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:09:42', null, null, null, '4', '4.00');
INSERT INTO `deal_detail` VALUES ('2', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:14:48', null, null, null, '4', '4.00');
INSERT INTO `deal_detail` VALUES ('3', '2', '1', '娃哈哈AD钙', '7.50', '1.00', '2018-02-05 23:14:48', null, null, null, '7', '52.50');
INSERT INTO `deal_detail` VALUES ('4', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:21:17', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('5', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:22:45', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('6', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:23:02', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('7', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:23:07', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('8', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:24:13', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('9', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:24:17', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('10', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:24:19', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('11', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:24:26', null, null, null, '7', '7.00');
INSERT INTO `deal_detail` VALUES ('12', '1', '1', '1', '1.00', '1.00', '2018-02-05 23:37:38', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('13', '1', '1', '1', '1.00', '1.00', '2018-02-06 22:46:49', null, null, null, '5', '5.00');
INSERT INTO `deal_detail` VALUES ('14', '1', '1', '1', '1.00', '1.00', '2018-02-06 22:46:57', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('15', '1', '1', '1', '1.00', '1.00', '2018-02-06 22:47:23', null, null, null, '2', '2.00');
INSERT INTO `deal_detail` VALUES ('16', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('17', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('18', '4', '1', '测试商品全名', '25.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '25.00');
INSERT INTO `deal_detail` VALUES ('19', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('20', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('21', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('22', null, '1', '未知商品', '4.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '4.00');
INSERT INTO `deal_detail` VALUES ('23', null, '1', '未知商品', '11.00', '1.00', '2018-02-06 23:00:26', null, null, null, '1', '11.00');
INSERT INTO `deal_detail` VALUES ('24', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('25', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('26', null, '1', '未知商品', '1.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('27', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('28', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('29', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('30', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('31', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('32', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('33', null, '1', '未知商品', '3.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '3.00');
INSERT INTO `deal_detail` VALUES ('34', null, '1', '未知商品', '6.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '6.00');
INSERT INTO `deal_detail` VALUES ('35', null, '1', '未知商品', '7.00', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '7.00');
INSERT INTO `deal_detail` VALUES ('36', null, '1', '未知商品', '9.70', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '9.70');
INSERT INTO `deal_detail` VALUES ('37', null, '1', '未知商品', '19.60', '1.00', '2018-02-06 23:02:40', null, null, null, '1', '19.60');
INSERT INTO `deal_detail` VALUES ('38', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:07:34', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('39', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:08:01', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('40', '8', '1', '保湿水', '158.00', '1.00', '2018-02-06 23:21:39', null, null, null, '1', '158.00');
INSERT INTO `deal_detail` VALUES ('41', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:42:22', null, null, null, '5', '5.00');
INSERT INTO `deal_detail` VALUES ('42', '4', '1', '测试商品全名', '25.00', '1.00', '2018-02-06 23:42:22', null, null, null, '5', '125.00');
INSERT INTO `deal_detail` VALUES ('43', '1', '1', '1', '1.00', '1.00', '2018-02-06 23:46:46', null, null, null, '3', '3.00');
INSERT INTO `deal_detail` VALUES ('44', null, '1', '未知商品', '2.00', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '2.00');
INSERT INTO `deal_detail` VALUES ('45', null, '1', '未知商品', '33.00', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '33.00');
INSERT INTO `deal_detail` VALUES ('46', null, '1', '未知商品', '1.46', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '1.46');
INSERT INTO `deal_detail` VALUES ('47', null, '1', '未知商品', '1.13', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '1.13');
INSERT INTO `deal_detail` VALUES ('48', null, '1', '未知商品', '1.33', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '1.33');
INSERT INTO `deal_detail` VALUES ('49', null, '1', '未知商品', '1.00', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('50', null, '1', '未知商品', '1.00', '1.00', '2018-02-06 23:46:46', null, null, null, '1', '1.00');
INSERT INTO `deal_detail` VALUES ('51', '1', '1', '1', '1.00', '1.00', '2018-02-10 19:05:03', null, null, null, '2', '2.00');

-- ----------------------------
-- Table structure for prod_info
-- ----------------------------
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of prod_info
-- ----------------------------

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_croatian_ci NOT NULL,
  `barcode` varchar(50) COLLATE utf8_croatian_ci NOT NULL,
  `name2` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(50) COLLATE utf8_croatian_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_user` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `in_price` decimal(10,2) DEFAULT NULL,
  `sale_price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `company` int(20) DEFAULT NULL,
  `produce_date` date DEFAULT NULL,
  `effDays` int(20) DEFAULT NULL,
  `type1` int(2) DEFAULT NULL,
  `type2` int(2) DEFAULT NULL,
  `remainShare` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('1', '1', '1', '1', '2018-02-06 22:46:17', null, '2018-02-06 22:46:17', '2018-02-06 22:46:17', '1.00', '1.00', '1', '1', '2018-02-04', '1', null, null, '7');
INSERT INTO `stock` VALUES ('2', '娃哈哈AD钙', '6902083881085', '娃哈哈', '2018-02-06 21:36:15', null, '2018-02-06 21:36:15', '2018-02-06 21:36:15', '5.00', '7.50', '', '1', '2018-02-05', '180', null, null, '4');
INSERT INTO `stock` VALUES ('4', '测试商品全名', '123', '测试商品', '2018-02-06 21:46:35', null, null, null, '15.00', '25.00', '', '2', '2018-02-06', '365', null, null, null);
INSERT INTO `stock` VALUES ('8', '保湿水', '6901294530393', '保湿水', '2018-02-06 23:21:24', null, null, null, '100.00', '158.00', '', '1', '2018-02-06', '365', null, null, '1');

-- ----------------------------
-- Table structure for sys_params
-- ----------------------------
DROP TABLE IF EXISTS `sys_params`;
CREATE TABLE `sys_params` (
  `code` int(2) DEFAULT NULL COMMENT 'value值',
  `cnname` varchar(20) DEFAULT NULL COMMENT '中文名',
  `pid` varchar(10) DEFAULT NULL COMMENT '父级id',
  `orderno` int(3) DEFAULT NULL COMMENT '排序号',
  `remark` varchar(40) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_params
-- ----------------------------

-- ----------------------------
-- Table structure for task
-- ----------------------------
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
