/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : shopping

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2019-11-15 15:25:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo` (
  `id` int(20) NOT NULL,
  `productid` int(20) DEFAULT NULL,
  `producttypeid` int(20) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `amount` double(20,2) DEFAULT NULL COMMENT '支付金额',
  `paytype` int(2) DEFAULT NULL,
  `paytime` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `paystatus` int(2) DEFAULT NULL,
  `couponamount` double(20,2) DEFAULT NULL,
  `totalmount` double(20,2) DEFAULT NULL,
  `refundmount` double(20,2) DEFAULT NULL COMMENT '退款金额',
  `num` int(5) DEFAULT NULL COMMENT '商品数量',
  `userid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
