/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : shopping

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2019-11-15 15:26:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` int(20) DEFAULT NULL COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户名称',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `telphone` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `registerTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `usetype` int(1) DEFAULT NULL COMMENT '终端类型：0为pc端，1为移动端，2为小程序端'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
