/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost:3306
 Source Schema         : financial_info

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : 65001

 Date: 22/04/2021 14:48:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for optional stock
-- ----------------------------
DROP TABLE IF EXISTS `optional stock`;
CREATE TABLE `optional stock`  (
  `u_id` int(11) NOT NULL,
  `s_id` int(11) NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE,
  INDEX `s_id`(`s_id`) USING BTREE,
  CONSTRAINT `optional stock_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `optional stock_ibfk_2` FOREIGN KEY (`s_id`) REFERENCES `stock` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of optional stock
-- ----------------------------
INSERT INTO `optional stock` VALUES (1, 1);
INSERT INTO `optional stock` VALUES (2, 1);

-- ----------------------------
-- Table structure for quotation
-- ----------------------------
DROP TABLE IF EXISTS `quotation`;
CREATE TABLE `quotation`  (
  `s_code` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `datetime` datetime(0) NULL DEFAULT NULL,
  `time_interval` tinyint(4) NULL DEFAULT NULL,
  `now_price` float UNSIGNED NULL DEFAULT NULL,
  `open_price` float UNSIGNED NULL DEFAULT NULL,
  `close_price` float UNSIGNED NULL DEFAULT NULL,
  `highest` float UNSIGNED NULL DEFAULT NULL,
  `lowest` float UNSIGNED NULL DEFAULT NULL,
  `volume` bigint(20) UNSIGNED NULL DEFAULT NULL,
  `turnover` bigint(20) UNSIGNED NULL DEFAULT NULL,
  `turnover_rate` float NULL DEFAULT NULL,
  `amplitude` float NULL DEFAULT NULL,
  `change_amount` bigint(20) NULL DEFAULT NULL,
  `change_rate` float NULL DEFAULT NULL,
  PRIMARY KEY (`s_code`) USING BTREE,
  CONSTRAINT `quotation_ibfk_1` FOREIGN KEY (`s_code`) REFERENCES `stock` (`s_code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of quotation
-- ----------------------------
INSERT INTO `quotation` VALUES ('606118', '2021-04-22 14:46:02', NULL, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock`  (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_code` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`s_id`) USING BTREE,
  UNIQUE INDEX `s_code`(`s_code`, `s_name`) USING BTREE,
  INDEX `s_code_2`(`s_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES (1, '606118', '肉蛋葱鸡', 'A股');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `state` tinyint(1) NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zhangsan', '2547113514@qq.com', '123456', 1, '2021-04-22 00:00:00', 1);
INSERT INTO `user` VALUES (2, 'lisi', '33265578142qq.com', '123456', 0, '2021-04-22 00:00:00', 1);

SET FOREIGN_KEY_CHECKS = 1;
