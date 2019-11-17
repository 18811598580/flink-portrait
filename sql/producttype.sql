/*
Navicat MySQL Data Transfer

Source Server         : 公有云自建Mysql
Source Server Version : 50723
Source Host           : 192.168.2.26:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-11-16 21:09:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for producttype
-- ----------------------------
DROP TABLE IF EXISTS `producttype`;
CREATE TABLE `producttype` (
  `id` int(11) NOT NULL,
  `producttypename` varchar(50) DEFAULT NULL,
  `producttypedesctiption` varchar(50) DEFAULT NULL,
  `producttypeleave` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
