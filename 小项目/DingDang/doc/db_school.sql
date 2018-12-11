/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : db_school

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 30/06/2018 13:27:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 110 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES (1, '16软件（1）班');
INSERT INTO `classes` VALUES (2, '16软件（2）班');
INSERT INTO `classes` VALUES (4, '16软件（1）班哈哈');
INSERT INTO `classes` VALUES (100, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (101, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (103, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (104, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (105, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (106, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (107, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (108, '宇宙超级无敌软件一班');
INSERT INTO `classes` VALUES (109, '宇宙超级无敌软件一班');

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名',
  `term` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学期',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1998 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES (1, '线性代数', '大一上');
INSERT INTO `courses` VALUES (2, '高数', '大一下');
INSERT INTO `courses` VALUES (3, 'java程序设计', '大二上');
INSERT INTO `courses` VALUES (4, '算法设计与分析', '大二下');
INSERT INTO `courses` VALUES (1997, '操作系统', '大三上');

-- ----------------------------
-- Table structure for scores
-- ----------------------------
DROP TABLE IF EXISTS `scores`;
CREATE TABLE `scores`  (
  `Sid` int(11) NOT NULL,
  `Cid` int(11) NOT NULL COMMENT '课程id',
  `score` decimal(4, 2) DEFAULT NULL,
  PRIMARY KEY (`Sid`, `Cid`) USING BTREE,
  INDEX `Cid`(`Cid`) USING BTREE,
  CONSTRAINT `scores_ibfk_1` FOREIGN KEY (`Sid`) REFERENCES `stus` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `scores_ibfk_2` FOREIGN KEY (`Cid`) REFERENCES `courses` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of scores
-- ----------------------------
INSERT INTO `scores` VALUES (84, 1, 99.99);
INSERT INTO `scores` VALUES (84, 2, 73.45);
INSERT INTO `scores` VALUES (84, 3, 38.85);
INSERT INTO `scores` VALUES (84, 4, 71.40);
INSERT INTO `scores` VALUES (85, 1, 33.05);
INSERT INTO `scores` VALUES (85, 2, 81.96);
INSERT INTO `scores` VALUES (85, 3, 93.06);
INSERT INTO `scores` VALUES (85, 4, 38.90);
INSERT INTO `scores` VALUES (86, 1, 56.18);
INSERT INTO `scores` VALUES (86, 2, 50.75);
INSERT INTO `scores` VALUES (86, 3, 70.46);
INSERT INTO `scores` VALUES (86, 4, 86.66);
INSERT INTO `scores` VALUES (87, 1, 80.18);
INSERT INTO `scores` VALUES (87, 2, 72.11);
INSERT INTO `scores` VALUES (87, 3, 2.78);
INSERT INTO `scores` VALUES (87, 4, 35.09);
INSERT INTO `scores` VALUES (88, 1, 29.32);
INSERT INTO `scores` VALUES (88, 2, 71.31);
INSERT INTO `scores` VALUES (88, 3, 29.24);
INSERT INTO `scores` VALUES (88, 4, 75.37);
INSERT INTO `scores` VALUES (89, 1, 46.03);
INSERT INTO `scores` VALUES (89, 2, 51.60);
INSERT INTO `scores` VALUES (89, 3, 94.10);
INSERT INTO `scores` VALUES (89, 4, 56.14);
INSERT INTO `scores` VALUES (90, 1, 79.62);
INSERT INTO `scores` VALUES (90, 2, 67.57);
INSERT INTO `scores` VALUES (90, 3, 91.26);
INSERT INTO `scores` VALUES (90, 4, 37.26);
INSERT INTO `scores` VALUES (91, 1, 4.27);
INSERT INTO `scores` VALUES (91, 2, 2.53);
INSERT INTO `scores` VALUES (91, 3, 33.07);
INSERT INTO `scores` VALUES (91, 4, 3.73);
INSERT INTO `scores` VALUES (92, 1, 13.47);
INSERT INTO `scores` VALUES (92, 2, 38.79);
INSERT INTO `scores` VALUES (92, 3, 30.23);
INSERT INTO `scores` VALUES (92, 4, 30.56);
INSERT INTO `scores` VALUES (93, 1, 67.51);
INSERT INTO `scores` VALUES (93, 2, 53.61);
INSERT INTO `scores` VALUES (93, 3, 21.51);
INSERT INTO `scores` VALUES (93, 4, 63.28);
INSERT INTO `scores` VALUES (94, 1, 39.31);
INSERT INTO `scores` VALUES (94, 2, 60.49);
INSERT INTO `scores` VALUES (94, 3, 8.41);
INSERT INTO `scores` VALUES (94, 4, 0.88);
INSERT INTO `scores` VALUES (95, 1, 92.67);
INSERT INTO `scores` VALUES (95, 2, 34.90);
INSERT INTO `scores` VALUES (95, 3, 0.22);
INSERT INTO `scores` VALUES (95, 4, 50.39);
INSERT INTO `scores` VALUES (96, 1, 74.22);
INSERT INTO `scores` VALUES (96, 2, 5.77);
INSERT INTO `scores` VALUES (96, 3, 96.73);
INSERT INTO `scores` VALUES (96, 4, 41.11);
INSERT INTO `scores` VALUES (97, 1, 25.99);
INSERT INTO `scores` VALUES (97, 2, 76.87);
INSERT INTO `scores` VALUES (97, 3, 64.44);
INSERT INTO `scores` VALUES (97, 4, 6.27);
INSERT INTO `scores` VALUES (98, 1, 58.70);
INSERT INTO `scores` VALUES (98, 2, 34.19);
INSERT INTO `scores` VALUES (98, 3, 51.10);
INSERT INTO `scores` VALUES (98, 4, 39.81);
INSERT INTO `scores` VALUES (99, 1, 28.20);
INSERT INTO `scores` VALUES (99, 2, 41.62);
INSERT INTO `scores` VALUES (99, 3, 32.69);
INSERT INTO `scores` VALUES (99, 4, 34.08);
INSERT INTO `scores` VALUES (100, 1, 47.51);
INSERT INTO `scores` VALUES (100, 2, 75.68);
INSERT INTO `scores` VALUES (100, 3, 66.68);
INSERT INTO `scores` VALUES (100, 4, 82.97);
INSERT INTO `scores` VALUES (101, 1, 47.45);
INSERT INTO `scores` VALUES (101, 2, 72.95);
INSERT INTO `scores` VALUES (101, 3, 0.75);
INSERT INTO `scores` VALUES (101, 4, 64.50);
INSERT INTO `scores` VALUES (102, 1, 79.25);
INSERT INTO `scores` VALUES (102, 2, 87.17);
INSERT INTO `scores` VALUES (102, 3, 42.91);
INSERT INTO `scores` VALUES (102, 4, 84.24);
INSERT INTO `scores` VALUES (103, 1, 75.54);
INSERT INTO `scores` VALUES (103, 2, 78.59);
INSERT INTO `scores` VALUES (103, 3, 68.02);
INSERT INTO `scores` VALUES (103, 4, 88.23);
INSERT INTO `scores` VALUES (104, 1, 52.83);
INSERT INTO `scores` VALUES (104, 2, 87.86);
INSERT INTO `scores` VALUES (104, 3, 17.93);
INSERT INTO `scores` VALUES (104, 4, 31.92);
INSERT INTO `scores` VALUES (105, 1, 30.86);
INSERT INTO `scores` VALUES (105, 2, 12.55);
INSERT INTO `scores` VALUES (105, 3, 45.68);
INSERT INTO `scores` VALUES (105, 4, 95.33);
INSERT INTO `scores` VALUES (106, 1, 55.15);
INSERT INTO `scores` VALUES (106, 2, 85.33);
INSERT INTO `scores` VALUES (106, 3, 73.36);
INSERT INTO `scores` VALUES (106, 4, 57.83);
INSERT INTO `scores` VALUES (107, 1, 60.80);
INSERT INTO `scores` VALUES (107, 2, 8.58);
INSERT INTO `scores` VALUES (107, 3, 42.67);
INSERT INTO `scores` VALUES (107, 4, 17.11);
INSERT INTO `scores` VALUES (108, 1, 90.85);
INSERT INTO `scores` VALUES (108, 2, 89.25);
INSERT INTO `scores` VALUES (108, 3, 67.53);
INSERT INTO `scores` VALUES (108, 4, 52.46);
INSERT INTO `scores` VALUES (109, 1, 45.62);
INSERT INTO `scores` VALUES (109, 2, 26.70);
INSERT INTO `scores` VALUES (109, 3, 78.77);
INSERT INTO `scores` VALUES (109, 4, 74.81);
INSERT INTO `scores` VALUES (110, 1, 62.75);
INSERT INTO `scores` VALUES (110, 2, 71.87);
INSERT INTO `scores` VALUES (110, 3, 28.65);
INSERT INTO `scores` VALUES (110, 4, 73.79);
INSERT INTO `scores` VALUES (111, 1, 16.16);
INSERT INTO `scores` VALUES (111, 2, 14.06);
INSERT INTO `scores` VALUES (111, 3, 92.40);
INSERT INTO `scores` VALUES (111, 4, 1.22);
INSERT INTO `scores` VALUES (112, 1, 39.19);
INSERT INTO `scores` VALUES (112, 2, 75.50);
INSERT INTO `scores` VALUES (112, 3, 28.14);
INSERT INTO `scores` VALUES (112, 4, 23.03);
INSERT INTO `scores` VALUES (113, 1, 68.43);
INSERT INTO `scores` VALUES (113, 2, 48.38);
INSERT INTO `scores` VALUES (113, 3, 94.68);
INSERT INTO `scores` VALUES (113, 4, 16.23);
INSERT INTO `scores` VALUES (114, 1, 23.26);
INSERT INTO `scores` VALUES (114, 2, 85.65);
INSERT INTO `scores` VALUES (114, 3, 58.55);
INSERT INTO `scores` VALUES (114, 4, 89.30);
INSERT INTO `scores` VALUES (115, 1, 69.67);
INSERT INTO `scores` VALUES (115, 2, 28.02);
INSERT INTO `scores` VALUES (115, 3, 71.25);
INSERT INTO `scores` VALUES (115, 4, 5.60);
INSERT INTO `scores` VALUES (116, 1, 8.15);
INSERT INTO `scores` VALUES (116, 2, 85.93);
INSERT INTO `scores` VALUES (116, 3, 60.87);
INSERT INTO `scores` VALUES (116, 4, 97.86);
INSERT INTO `scores` VALUES (117, 1, 2.32);
INSERT INTO `scores` VALUES (117, 2, 95.87);
INSERT INTO `scores` VALUES (117, 3, 48.59);
INSERT INTO `scores` VALUES (117, 4, 73.00);
INSERT INTO `scores` VALUES (118, 1, 62.78);
INSERT INTO `scores` VALUES (118, 2, 85.33);
INSERT INTO `scores` VALUES (118, 3, 81.30);
INSERT INTO `scores` VALUES (118, 4, 31.16);
INSERT INTO `scores` VALUES (119, 1, 85.32);
INSERT INTO `scores` VALUES (119, 2, 36.27);
INSERT INTO `scores` VALUES (119, 3, 22.31);
INSERT INTO `scores` VALUES (119, 4, 10.28);
INSERT INTO `scores` VALUES (120, 1, 42.19);
INSERT INTO `scores` VALUES (120, 2, 62.39);
INSERT INTO `scores` VALUES (120, 3, 89.04);
INSERT INTO `scores` VALUES (120, 4, 30.92);
INSERT INTO `scores` VALUES (121, 1, 45.19);
INSERT INTO `scores` VALUES (121, 2, 63.66);
INSERT INTO `scores` VALUES (121, 3, 91.96);
INSERT INTO `scores` VALUES (121, 4, 57.69);
INSERT INTO `scores` VALUES (122, 1, 58.37);
INSERT INTO `scores` VALUES (122, 2, 1.52);
INSERT INTO `scores` VALUES (122, 3, 53.58);
INSERT INTO `scores` VALUES (122, 4, 30.60);
INSERT INTO `scores` VALUES (123, 1, 83.32);
INSERT INTO `scores` VALUES (123, 2, 29.75);
INSERT INTO `scores` VALUES (123, 3, 58.57);
INSERT INTO `scores` VALUES (123, 4, 7.02);
INSERT INTO `scores` VALUES (124, 1, 79.02);
INSERT INTO `scores` VALUES (124, 2, 6.58);
INSERT INTO `scores` VALUES (124, 3, 62.29);
INSERT INTO `scores` VALUES (124, 4, 12.32);
INSERT INTO `scores` VALUES (125, 1, 0.65);
INSERT INTO `scores` VALUES (125, 2, 12.00);
INSERT INTO `scores` VALUES (125, 3, 19.30);
INSERT INTO `scores` VALUES (125, 4, 33.74);
INSERT INTO `scores` VALUES (126, 1, 44.00);
INSERT INTO `scores` VALUES (126, 2, 64.29);
INSERT INTO `scores` VALUES (126, 3, 57.45);
INSERT INTO `scores` VALUES (126, 4, 30.15);
INSERT INTO `scores` VALUES (127, 1, 95.81);
INSERT INTO `scores` VALUES (127, 2, 10.32);
INSERT INTO `scores` VALUES (127, 3, 37.05);
INSERT INTO `scores` VALUES (127, 4, 31.43);
INSERT INTO `scores` VALUES (128, 1, 2.19);
INSERT INTO `scores` VALUES (128, 2, 95.73);
INSERT INTO `scores` VALUES (128, 3, 85.57);
INSERT INTO `scores` VALUES (128, 4, 92.50);
INSERT INTO `scores` VALUES (129, 1, 48.69);
INSERT INTO `scores` VALUES (129, 2, 71.16);
INSERT INTO `scores` VALUES (129, 3, 71.62);
INSERT INTO `scores` VALUES (129, 4, 61.53);
INSERT INTO `scores` VALUES (130, 1, 75.24);
INSERT INTO `scores` VALUES (130, 2, 78.18);
INSERT INTO `scores` VALUES (130, 3, 81.16);
INSERT INTO `scores` VALUES (130, 4, 50.31);
INSERT INTO `scores` VALUES (131, 1, 38.08);
INSERT INTO `scores` VALUES (131, 2, 78.70);
INSERT INTO `scores` VALUES (131, 3, 34.29);
INSERT INTO `scores` VALUES (131, 4, 24.60);
INSERT INTO `scores` VALUES (132, 1, 48.76);
INSERT INTO `scores` VALUES (132, 2, 41.30);
INSERT INTO `scores` VALUES (132, 3, 52.33);
INSERT INTO `scores` VALUES (132, 4, 94.80);
INSERT INTO `scores` VALUES (133, 1, 18.60);
INSERT INTO `scores` VALUES (133, 2, 1.27);
INSERT INTO `scores` VALUES (133, 3, 67.34);
INSERT INTO `scores` VALUES (133, 4, 5.42);
INSERT INTO `scores` VALUES (134, 1, 76.48);
INSERT INTO `scores` VALUES (134, 2, 42.05);
INSERT INTO `scores` VALUES (134, 3, 95.92);
INSERT INTO `scores` VALUES (134, 4, 29.19);
INSERT INTO `scores` VALUES (135, 1, 0.25);
INSERT INTO `scores` VALUES (135, 2, 57.80);
INSERT INTO `scores` VALUES (135, 3, 56.59);
INSERT INTO `scores` VALUES (135, 4, 43.54);
INSERT INTO `scores` VALUES (136, 1, 58.34);
INSERT INTO `scores` VALUES (136, 2, 0.58);
INSERT INTO `scores` VALUES (136, 3, 46.55);
INSERT INTO `scores` VALUES (136, 4, 41.49);
INSERT INTO `scores` VALUES (137, 1, 31.97);
INSERT INTO `scores` VALUES (137, 2, 73.93);
INSERT INTO `scores` VALUES (137, 3, 56.30);
INSERT INTO `scores` VALUES (137, 4, 33.50);
INSERT INTO `scores` VALUES (138, 1, 19.58);
INSERT INTO `scores` VALUES (138, 2, 36.08);
INSERT INTO `scores` VALUES (138, 3, 55.45);
INSERT INTO `scores` VALUES (138, 4, 72.72);
INSERT INTO `scores` VALUES (139, 1, 89.59);
INSERT INTO `scores` VALUES (139, 2, 30.29);
INSERT INTO `scores` VALUES (139, 3, 42.99);
INSERT INTO `scores` VALUES (139, 4, 64.29);
INSERT INTO `scores` VALUES (140, 1, 74.74);
INSERT INTO `scores` VALUES (140, 2, 75.81);
INSERT INTO `scores` VALUES (140, 3, 2.83);
INSERT INTO `scores` VALUES (140, 4, 43.93);
INSERT INTO `scores` VALUES (141, 1, 8.14);
INSERT INTO `scores` VALUES (141, 2, 66.49);
INSERT INTO `scores` VALUES (141, 3, 17.67);
INSERT INTO `scores` VALUES (141, 4, 66.49);
INSERT INTO `scores` VALUES (142, 1, 7.64);
INSERT INTO `scores` VALUES (142, 2, 23.06);
INSERT INTO `scores` VALUES (142, 3, 70.33);
INSERT INTO `scores` VALUES (142, 4, 78.51);
INSERT INTO `scores` VALUES (143, 1, 78.57);
INSERT INTO `scores` VALUES (143, 2, 93.61);
INSERT INTO `scores` VALUES (143, 3, 44.42);
INSERT INTO `scores` VALUES (143, 4, 47.14);
INSERT INTO `scores` VALUES (144, 1, 36.64);
INSERT INTO `scores` VALUES (144, 2, 60.79);
INSERT INTO `scores` VALUES (144, 3, 39.23);
INSERT INTO `scores` VALUES (144, 4, 32.11);
INSERT INTO `scores` VALUES (145, 1, 49.82);
INSERT INTO `scores` VALUES (145, 2, 85.03);
INSERT INTO `scores` VALUES (145, 3, 47.25);
INSERT INTO `scores` VALUES (145, 4, 57.68);
INSERT INTO `scores` VALUES (146, 1, 62.87);
INSERT INTO `scores` VALUES (146, 2, 36.33);
INSERT INTO `scores` VALUES (146, 3, 34.11);
INSERT INTO `scores` VALUES (146, 4, 21.20);
INSERT INTO `scores` VALUES (147, 1, 38.62);
INSERT INTO `scores` VALUES (147, 2, 61.18);
INSERT INTO `scores` VALUES (147, 3, 87.00);
INSERT INTO `scores` VALUES (147, 4, 57.86);
INSERT INTO `scores` VALUES (148, 1, 18.58);
INSERT INTO `scores` VALUES (148, 2, 19.50);
INSERT INTO `scores` VALUES (148, 3, 2.11);
INSERT INTO `scores` VALUES (148, 4, 23.99);
INSERT INTO `scores` VALUES (149, 1, 51.30);
INSERT INTO `scores` VALUES (149, 2, 57.07);
INSERT INTO `scores` VALUES (149, 3, 5.19);
INSERT INTO `scores` VALUES (149, 4, 10.33);
INSERT INTO `scores` VALUES (150, 1, 42.33);
INSERT INTO `scores` VALUES (150, 2, 51.69);
INSERT INTO `scores` VALUES (150, 3, 3.06);
INSERT INTO `scores` VALUES (150, 4, 12.10);
INSERT INTO `scores` VALUES (151, 1, 64.80);
INSERT INTO `scores` VALUES (151, 2, 63.16);
INSERT INTO `scores` VALUES (151, 3, 52.93);
INSERT INTO `scores` VALUES (151, 4, 64.23);
INSERT INTO `scores` VALUES (152, 1, 8.62);
INSERT INTO `scores` VALUES (152, 2, 6.69);
INSERT INTO `scores` VALUES (152, 3, 87.58);
INSERT INTO `scores` VALUES (152, 4, 60.05);
INSERT INTO `scores` VALUES (153, 1, 97.08);
INSERT INTO `scores` VALUES (153, 2, 60.09);
INSERT INTO `scores` VALUES (153, 3, 19.45);
INSERT INTO `scores` VALUES (153, 4, 64.32);
INSERT INTO `scores` VALUES (154, 1, 30.28);
INSERT INTO `scores` VALUES (154, 2, 65.29);
INSERT INTO `scores` VALUES (154, 3, 56.63);
INSERT INTO `scores` VALUES (154, 4, 71.23);
INSERT INTO `scores` VALUES (155, 1, 21.39);
INSERT INTO `scores` VALUES (155, 2, 25.39);
INSERT INTO `scores` VALUES (155, 3, 36.90);
INSERT INTO `scores` VALUES (155, 4, 51.95);
INSERT INTO `scores` VALUES (156, 1, 33.94);
INSERT INTO `scores` VALUES (156, 2, 65.15);
INSERT INTO `scores` VALUES (156, 3, 28.93);
INSERT INTO `scores` VALUES (156, 4, 53.35);
INSERT INTO `scores` VALUES (157, 1, 43.15);
INSERT INTO `scores` VALUES (157, 2, 76.72);
INSERT INTO `scores` VALUES (157, 3, 66.11);
INSERT INTO `scores` VALUES (157, 4, 8.63);
INSERT INTO `scores` VALUES (158, 1, 81.16);
INSERT INTO `scores` VALUES (158, 2, 25.18);
INSERT INTO `scores` VALUES (158, 3, 90.48);
INSERT INTO `scores` VALUES (158, 4, 74.38);
INSERT INTO `scores` VALUES (159, 1, 63.43);
INSERT INTO `scores` VALUES (159, 2, 29.93);
INSERT INTO `scores` VALUES (159, 3, 61.47);
INSERT INTO `scores` VALUES (159, 4, 29.09);
INSERT INTO `scores` VALUES (160, 1, 70.80);
INSERT INTO `scores` VALUES (160, 2, 59.32);
INSERT INTO `scores` VALUES (160, 3, 64.47);
INSERT INTO `scores` VALUES (160, 4, 30.69);
INSERT INTO `scores` VALUES (161, 1, 98.87);
INSERT INTO `scores` VALUES (161, 2, 92.82);
INSERT INTO `scores` VALUES (161, 3, 71.83);
INSERT INTO `scores` VALUES (161, 4, 1.25);
INSERT INTO `scores` VALUES (162, 1, 11.84);
INSERT INTO `scores` VALUES (162, 2, 88.31);
INSERT INTO `scores` VALUES (162, 3, 19.01);
INSERT INTO `scores` VALUES (162, 4, 63.28);
INSERT INTO `scores` VALUES (163, 1, 14.40);
INSERT INTO `scores` VALUES (163, 2, 85.81);
INSERT INTO `scores` VALUES (163, 3, 59.51);
INSERT INTO `scores` VALUES (163, 4, 13.16);
INSERT INTO `scores` VALUES (1997, 1, 80.98);
INSERT INTO `scores` VALUES (1997, 2, 80.00);
INSERT INTO `scores` VALUES (1997, 3, 76.50);
INSERT INTO `scores` VALUES (1997, 4, 45.41);
INSERT INTO `scores` VALUES (1997, 1997, NULL);

-- ----------------------------
-- Table structure for stus
-- ----------------------------
DROP TABLE IF EXISTS `stus`;
CREATE TABLE `stus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `academy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Classid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Classid`(`Classid`) USING BTREE,
  CONSTRAINT `stus_ibfk_1` FOREIGN KEY (`Classid`) REFERENCES `classes` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2000 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stus
-- ----------------------------
INSERT INTO `stus` VALUES (84, '1234', '张三01543', '计算机学院', 2);
INSERT INTO `stus` VALUES (85, '1234', '李四1', '计算机学院', 1);
INSERT INTO `stus` VALUES (86, '1234', '王五2', '计算机学院', 2);
INSERT INTO `stus` VALUES (87, '1234', '王二麻子3', '计算机学院', 2);
INSERT INTO `stus` VALUES (88, '1234', '张三4', '计算机学院', 1);
INSERT INTO `stus` VALUES (89, '1234', '李四5', '计算机学院', 2);
INSERT INTO `stus` VALUES (90, '1234', '王五6', '计算机学院', 1);
INSERT INTO `stus` VALUES (91, '1234', '王二麻子7', '计算机学院', 1);
INSERT INTO `stus` VALUES (92, '1234', '张三8', '计算机学院', 2);
INSERT INTO `stus` VALUES (93, '1234', '李四9', '计算机学院', 1);
INSERT INTO `stus` VALUES (94, '1234', '王五10', '计算机学院', 2);
INSERT INTO `stus` VALUES (95, '1234', '王二麻子11', '计算机学院', 2);
INSERT INTO `stus` VALUES (96, '1234', '张三12', '计算机学院', 1);
INSERT INTO `stus` VALUES (97, '1234', '李四13', '计算机学院', 1);
INSERT INTO `stus` VALUES (98, '1234', '王五14', '计算机学院', 2);
INSERT INTO `stus` VALUES (99, '1234', '王二麻子15', '计算机学院', 2);
INSERT INTO `stus` VALUES (100, '1234', '张三16', '计算机学院', 2);
INSERT INTO `stus` VALUES (101, '1234', '李四17', '计算机学院', 1);
INSERT INTO `stus` VALUES (102, '1234', '王五18', '计算机学院', 1);
INSERT INTO `stus` VALUES (103, '1234', '王二麻子19', '计算机学院', 1);
INSERT INTO `stus` VALUES (104, '1234', '张三20', '计算机学院', 2);
INSERT INTO `stus` VALUES (105, '1234', '李四21', '计算机学院', 1);
INSERT INTO `stus` VALUES (106, '1234', '王五22', '计算机学院', 1);
INSERT INTO `stus` VALUES (107, '1234', '王二麻子23', '计算机学院', 1);
INSERT INTO `stus` VALUES (108, '1234', '张三24', '计算机学院', 2);
INSERT INTO `stus` VALUES (109, '1234', '李四25', '计算机学院', 2);
INSERT INTO `stus` VALUES (110, '1234', '王五26', '计算机学院', 1);
INSERT INTO `stus` VALUES (111, '1234', '王二麻子27', '计算机学院', 2);
INSERT INTO `stus` VALUES (112, '1234', '张三28', '计算机学院', 1);
INSERT INTO `stus` VALUES (113, '1234', '李四29', '计算机学院', 2);
INSERT INTO `stus` VALUES (114, '1234', '王五30', '计算机学院', 2);
INSERT INTO `stus` VALUES (115, '1234', '王二麻子31', '计算机学院', 1);
INSERT INTO `stus` VALUES (116, '1234', '张三32', '计算机学院', 1);
INSERT INTO `stus` VALUES (117, '1234', '李四33', '计算机学院', 2);
INSERT INTO `stus` VALUES (118, '1234', '王五34', '计算机学院', 2);
INSERT INTO `stus` VALUES (119, '1234', '王二麻子35', '计算机学院', 1);
INSERT INTO `stus` VALUES (120, '1234', '张三36', '计算机学院', 1);
INSERT INTO `stus` VALUES (121, '1234', '李四37', '计算机学院', 1);
INSERT INTO `stus` VALUES (122, '1234', '王五38', '计算机学院', 1);
INSERT INTO `stus` VALUES (123, '1234', '王二麻子39', '计算机学院', 1);
INSERT INTO `stus` VALUES (124, '1234', '张三40', '计算机学院', 1);
INSERT INTO `stus` VALUES (125, '1234', '李四41', '计算机学院', 2);
INSERT INTO `stus` VALUES (126, '1234', '王五42', '计算机学院', 1);
INSERT INTO `stus` VALUES (127, '1234', '王二麻子43', '计算机学院', 1);
INSERT INTO `stus` VALUES (128, '1234', '张三44', '计算机学院', 2);
INSERT INTO `stus` VALUES (129, '1234', '李四45', '计算机学院', 1);
INSERT INTO `stus` VALUES (130, '1234', '王五46', '计算机学院', 1);
INSERT INTO `stus` VALUES (131, '1234', '王二麻子47', '计算机学院', 1);
INSERT INTO `stus` VALUES (132, '1234', '张三48', '计算机学院', 2);
INSERT INTO `stus` VALUES (133, '1234', '李四49', '计算机学院', 1);
INSERT INTO `stus` VALUES (134, '1234', '王五50', '计算机学院', 1);
INSERT INTO `stus` VALUES (135, '1234', '王二麻子51', '计算机学院', 2);
INSERT INTO `stus` VALUES (136, '1234', '张三52', '计算机学院', 1);
INSERT INTO `stus` VALUES (137, '1234', '李四53', '计算机学院', 2);
INSERT INTO `stus` VALUES (138, '1234', '王五54', '计算机学院', 1);
INSERT INTO `stus` VALUES (139, '1234', '王二麻子55', '计算机学院', 2);
INSERT INTO `stus` VALUES (140, '1234', '张三56', '计算机学院', 1);
INSERT INTO `stus` VALUES (141, '1234', '李四57', '计算机学院', 1);
INSERT INTO `stus` VALUES (142, '1234', '王五58', '计算机学院', 2);
INSERT INTO `stus` VALUES (143, '1234', '王二麻子59', '计算机学院', 2);
INSERT INTO `stus` VALUES (144, '1234', '张三60', '计算机学院', 1);
INSERT INTO `stus` VALUES (145, '1234', '李四61', '计算机学院', 2);
INSERT INTO `stus` VALUES (146, '1234', '王五62', '计算机学院', 1);
INSERT INTO `stus` VALUES (147, '1234', '王二麻子63', '计算机学院', 2);
INSERT INTO `stus` VALUES (148, '1234', '张三64', '计算机学院', 1);
INSERT INTO `stus` VALUES (149, '1234', '李四65', '计算机学院', 2);
INSERT INTO `stus` VALUES (150, '1234', '王五66', '计算机学院', 2);
INSERT INTO `stus` VALUES (151, '1234', '王二麻子67', '计算机学院', 2);
INSERT INTO `stus` VALUES (152, '1234', '张三68', '计算机学院', 2);
INSERT INTO `stus` VALUES (153, '1234', '李四69', '计算机学院', 2);
INSERT INTO `stus` VALUES (154, '1234', '王五70', '计算机学院', 1);
INSERT INTO `stus` VALUES (155, '1234', '王二麻子71', '计算机学院', 2);
INSERT INTO `stus` VALUES (156, '1234', '张三72', '计算机学院', 2);
INSERT INTO `stus` VALUES (157, '1234', '李四73', '计算机学院', 2);
INSERT INTO `stus` VALUES (158, '1234', '王五74', '计算机学院', 2);
INSERT INTO `stus` VALUES (159, '1234', '王二麻子75', '计算机学院', 2);
INSERT INTO `stus` VALUES (160, '1234', '张三76', '计算机学院', 2);
INSERT INTO `stus` VALUES (161, '1234', '李四77', '计算机学院', 1);
INSERT INTO `stus` VALUES (162, '1234', '王五78', '计算机学院', 2);
INSERT INTO `stus` VALUES (163, '1234', '王二麻子79', '计算机学院', 2);
INSERT INTO `stus` VALUES (1997, '1234', '李朝阳', '计算机学院', 2);
INSERT INTO `stus` VALUES (1998, NULL, NULL, NULL, NULL);
INSERT INTO `stus` VALUES (1999, NULL, NULL, NULL, NULL);

-- ----------------------------
-- View structure for scorejoin
-- ----------------------------
DROP VIEW IF EXISTS `scorejoin`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `scorejoin` AS select `t`.`name` AS `stuName`,`s`.`Sid` AS `Sid`,`s`.`Cid` AS `Cid`,`c`.`name` AS `coursename`,`s`.`score` AS `score`,`c`.`term` AS `term` from ((`stus` `t` join `scores` `s`) join `courses` `c`) where ((`t`.`id` = `s`.`Sid`) and (`c`.`id` = `s`.`Cid`));

SET FOREIGN_KEY_CHECKS = 1;
