/*
Navicat MySQL Data Transfer

Source Server         : 公有云自建Mysql
Source Server Version : 50723
Source Host           : 192.168.2.26:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-11-16 21:09:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for productinfo
-- ----------------------------
DROP TABLE IF EXISTS `productinfo`;
CREATE TABLE `productinfo` (
  `id` int(20) NOT NULL,
  `producttypeid` int(20) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `productdescription` varchar(1500) NOT NULL,
  `price` int(20) NOT NULL,
  `num` int(20) NOT NULL,
  `createtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL,
  `mechartid` int(20) NOT NULL,
  `producturl` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
